package net.caf.tests.stepdefs;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import net.caf.selenium.SeleniumSingleton;
import net.caf.selenium.SeleniumUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.b2b2000.utils.config.lightwieght.ConfigManager;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

/**
 * Created by developer on 10/9/14.
 */
public class GeneralStepDefinitions {

	@Before
	public void initSelenium() throws Exception {
		System.out.println("Before General steps");
		//
		//		selenium = new WebDriverBackedSelenium(driver, "http://localhost:8080/pluto/portal");
		//		selenium.start();
		//		WebDriver driver = ((WrapsDriver) selenium).getWrappedDriver();
		//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//		System.out.println("Getting google");
		SeleniumSingleton.init();
		SeleniumSingleton.getDriver().get("http://www.google.com");
		//		driver.get("http://www.google.com");
		//		selenium.start();
	}

	@After
	public void destroySelenium() {
		SeleniumSingleton.stop();
		//		selenium.stop();
		//		driver.quit(); // quit is a webdriver method.
	}

	@Dado("^estamos logados como \"(.*?)\" con password \"(.*?)\"$")
	public void estamos_logados_como_con_password(String user, String pwd) throws Throwable {
		//		estamos_en_la_pagina_nombre("Login");
		String url = ConfigManager.getProperty("Login");
		estamos_en_la_pagina_url(url);
		dado_se_modifica_el_campo_por("j_username", user);
		dado_se_modifica_el_campo_por("j_password", pwd);
		se_pulsa("j_login");
	}

	@Dado("^estando en la página ((https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?)$")
	public void estamos_en_la_pagina_url(String url) {
		System.out.println("Url:" + url);
		SeleniumSingleton.getSelenium().open(url);
		SeleniumSingleton.getSelenium().waitForPageToLoad(SeleniumSingleton.TIMEOUT_PAGE_LOAD);
	}

	@Dado("^se modifica el campo \"(.*?)\" por \"(.*?)\"$")
	public void dado_se_modifica_el_campo_por(String arg1, String arg2) throws Throwable {
		esperarA(arg1);
		se_modifica_el_campo_por_gen(arg1, arg2);
	}

	@Cuando("^se modifica el campo (\"(.*?)\")$ por (\"(.*?)\")$")
	public void cuando_se_modifica_el_campo_por(String nombreCampo, String valorCampo) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//        throw new PendingException();
		esperarA(nombreCampo);
		se_modifica_el_campo_por_gen(nombreCampo, valorCampo);
	}

	@Entonces("^en el campo \"(.*?)\" se visualizará \"(.*?)\"$")
	public void en_el_campo_se_visualizara(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	public void se_modifica_el_campo_por_gen(String nombreCampo, String valorCampo) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//		throw new PendingException();
		SeleniumUtils.typeFocusAndHighlight(SeleniumSingleton.getSelenium(), nombreCampo, valorCampo);
	}

	@Dado("^estando logados como ([a-z|A-Z|0-9]*)$")
	public void estando_logados_como(String username) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Cuando("^(?:vamos a|estando en) la página (((https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?))$")
	public void vamos_a_la_pagina_url(String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		estamos_en_la_pagina_url(url);
		//		throw new PendingException();
	}

	@Cuando("^(?:vamos a|estando en) la página \"(.*?)\"$")
	public void vamos_a_la_pagina_nombre(String m1, String name) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//		throw new PendingException();
		System.out.println("Url:" + name);
		String url = ConfigManager.getProperty(name);
		estamos_en_la_pagina_url(url);
	}

	@Cuando("^se navega hasta (\"(.*?)\")$")
	public void se_navegue_hasta_el_proyecto(String projectName) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entonces("^se (?:tiene que|debería) ver el texto \"(.*?)\"$")
	public void debería_ver_texto(String m1, String text) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//		esperarA(arg1);
		boolean res = (SeleniumUtils.checkTextPresent(SeleniumSingleton.getSelenium(), SeleniumSingleton.getDriver(), text));
		if (!res) {
			String screenshotName = SeleniumUtils.takeScreenshot(SeleniumSingleton.getDriver(), "el_campo_debera_tener_el_valor", "");
			throw new Exception("Text Not present " + text + " Captura:\n" + screenshotName + "\n");
		}
	}

	@Dado("^se pulsa \"(.*?)\"$")
	public void se_pulsa(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		esperarA(arg1);
		SeleniumUtils.waitThreadTime(3000);
		SeleniumUtils.clickFocusAndHighlight(SeleniumSingleton.getSelenium(), arg1);
		SeleniumSingleton.waitForPageToLoad();
		//		throw new PendingException();
	}

	public void esperarA(String id) {
		Wait<WebDriver> wait = new WebDriverWait(SeleniumSingleton.getDriver(), 30);
		WebElement element = wait.until(visibilityOfElementLocated(By.id(id)));
	}

	@Entonces("^en el listado \"(.*?)\"( no|^) se visualizará \"(.*?)\"$")
	public void en_el_listado_no_se_visualizara(String listId, String negate, String value) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		esperarA(listId);
		throw new PendingException();
	}

	@Dado("^estando logado en el entorno \"(.*?)\" en la página \"(.*?)\" como \"(.*?)\" con password \"(.*?)\"$")
	public void estando_logado_en_el_entorno_en_la_pagina_como_con_password(String entorno, String pagina, String user, String pwd) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String url = ConfigManager.getProperty(pagina);
		estamos_en_la_pagina_url(url);
		dado_se_modifica_el_campo_por("j_username", user);
		dado_se_modifica_el_campo_por("j_password", pwd);
		se_pulsa("j_login");
	}

	@Dado("^se selecciona \"(.*?)\" en el (combo|listado) \"(.*?)\"$")
	public void se_selecciona_en_el_combo(String id, String tipoSeleccion, String value) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if ("combo".equals(tipoSeleccion)) {
			SeleniumUtils.selectFocusAndHighlightComboElementByVisibleText(SeleniumSingleton.getDriver(), SeleniumSingleton.getSelenium(), id, value);
		} else if ("listado".equals(tipoSeleccion)) {
			SeleniumUtils.selectFocusAndHighlightComboElementByVisibleText(SeleniumSingleton.getDriver(), SeleniumSingleton.getSelenium(), id, value);
		}
	}

	@Dado("^se selecciona el modo de portlet \"(.*?)\" en el combo \"(.*?)\"$")
	public void se_selecciona_el_modo_de_portlet_en_el_combo(String value, String id) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		SeleniumUtils.selectFocusAndHighlightComboElementByVisibleText(SeleniumSingleton.getDriver(), SeleniumSingleton.getSelenium(), id, value);
		SeleniumUtils.waitForPageLoad(SeleniumSingleton.getDriver());
	}

	@Entonces("^el campo \"(.*?)\" deberá tener el valor \"(.*?)\"$")
	public void el_campo_debera_tener_el_valor(String id, String value) throws Throwable {
		boolean ok = SeleniumUtils.checkInputTextValue(SeleniumSingleton.getDriver(), id, value);
		if (!ok) {
			String screenshotName = SeleniumUtils.takeScreenshot(SeleniumSingleton.getDriver(), "el_campo_debera_tener_el_valor", "");
			throw new Exception("El campo " + id + " no contiene el valor " + value + "\nCaptura de pantalla en :\n" + screenshotName + "\n");
		}
	}

	@Entonces("^capturar Pantalla \"(.*?)\"$")
	public void capturar_pantalla(String name) throws Throwable {
		String screenshotName = SeleniumUtils.takeScreenshot(SeleniumSingleton.getDriver(), name, "");
		System.out.println("Pantalla capturada: " + name);
		System.out.println("Fichero:\n" + screenshotName);
	}

	@Entonces("^en el combo \"(.*?)\" el valor seleccionado será \"(.*?)\"$")
	public void en_el_combo_el_valor_seleccionado_sera(String id, String value) throws Exception {
		boolean ok = SeleniumUtils.checkComboValue(SeleniumSingleton.getDriver(), id, value);
		if (!ok) {
			String screenshotName = SeleniumUtils.takeScreenshot(SeleniumSingleton.getDriver(), "el_combo_debera_tener_el_valor", "");
			throw new Exception("El combo " + id + " no contiene el valor " + value + "\nCaptura de pantalla en :\n" + screenshotName + "\n");
		}
	}

	@Entonces("^el listado \"(.*?)\" está vacío$")
	public void el_listado_esta_vacio(String id) throws Exception {
		int count = SeleniumUtils.getComboValueNumber(SeleniumSingleton.getDriver(), id);
		if (count > 0) {
			String screenshotName = SeleniumUtils.takeScreenshot(SeleniumSingleton.getDriver(), "el_listado_esta_vacio", "");
			throw new Exception("El listado " + id + " no está vacío.\nCaptura de pantalla en :\n" + screenshotName + "\n");
		}
	}

	@Entonces("^el listado \"(.*?)\" contiene  (\\d+) valores$")
	public void el_listado_contiene_valores(String id, Integer number) throws Exception {
		int count = SeleniumUtils.getComboValueNumber(SeleniumSingleton.getDriver(), id);
		if (count == number) {
			String screenshotName = SeleniumUtils.takeScreenshot(SeleniumSingleton.getDriver(), "el_listado_contiene_valores", "");
			throw new Exception("El listado " + id + " no contiene " + number + "valores, sino " + count + ".\nCaptura de pantalla en :\n" + screenshotName + "\n");
		}
	}

	@Entonces("^el listado \"(.*?)\"( no|^) contiene el valor \"(.*?)\"$")
	public void el_listado_contiene_el_valor(String id, String negate, String option) throws Exception {
		boolean ok = SeleniumUtils.comboContainsOption(SeleniumSingleton.getDriver(), id, option);
		boolean negation = "no".equals(negate);
		if (!negation == ok) {
			String screenshotName = SeleniumUtils.takeScreenshot(SeleniumSingleton.getDriver(), "el_listado_contiene_el_valor", "");
			throw new Exception("El listado " + id + " " + negate + " contiene el valor " + option + ".\nCaptura de pantalla en :\n" + screenshotName + "\n");
		}
	}
}
