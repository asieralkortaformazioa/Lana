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

	//	@Dado("^estando en la página ([a-z|A-Z|0-9]*)$")
	//	public void estamos_en_la_pagina_nombre(String nombrePagina) throws B2BException {
	//		System.out.println("Url:" + nombrePagina);
	//		String url = ConfigManager.getProperty(nombrePagina);
	//		estamos_en_la_pagina_url(url);
	//	}
	//	@Dado("^estando en la página \"(.*?)\"$")
	//	public void estando_en_la_página(String arg1) throws Throwable {
	//		System.out.println("Url:" + arg1);
	//		String url = ConfigManager.getProperty(arg1);
	//		estamos_en_la_pagina_url(url);
	//	}
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

	//    @Y ("^se modifica el campo (\"(.*?)\")$ por (\"(.*?)\")$")
	//    public void y_se_modifica_el_campo_por (String nombreCampo, String valorCampo) throws Throwable {
	//        // Write code here that turns the phrase above into concrete actions
	////        throw new PendingException();
	//        se_modifica_el_campo_por_gen (nombreCampo,valorCampo);
	//    }
	public void se_modifica_el_campo_por_gen(String nombreCampo, String valorCampo) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//		throw new PendingException();
		SeleniumUtils.typeFocusAndHighlight(SeleniumSingleton.getSelenium(), nombreCampo, valorCampo);
	}

	//    @Y("^en el campo (\"(.*?)\")$ se visualizará (\"(.*?)\")$")
	//    public void y_en_el_campo_se_visualizara  (String nombreCampo, String valorCampo) throws Throwable {
	//        // Write code here that turns the phrase above into concrete actions
	////        throw new PendingException();
	//        en_el_campo_se_visualizara_gen (nombreCampo,valorCampo);
	//    }
	public void en_el_campo_se_visualizara_gen(String nombreCampo, String valorCampo) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
		//		en_el_campo_se_visualizara_gen(nombreCampo, valorCampo);
	}

	@Dado("^estando logados como ([a-z|A-Z|0-9]*)$")
	public void estando_logados_como(String username) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
	}

	@Cuando("^(vamos a|estando en) la página (((https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?))$")
	public void vamos_a_la_pagina_url(String m1, String url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		estamos_en_la_pagina_url(url);
		//		throw new PendingException();
	}

	@Cuando("^(vamos a|estando en) la página \"(.*?)\"$")
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

	@Entonces("^debería ver \"(.*?)\"$")
	public void debería_ver(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		esperarA(arg1);
		throw new PendingException();
	}

	@Entonces("^\tse (tiene que|debería) ver el texto \"(.*?)\"$")
	public void debería_ver_texto(String m1, String text) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//		esperarA(arg1);
		if (SeleniumUtils.checkTextPresent(SeleniumSingleton.getSelenium(), text)) {
			throw new Exception("Text Not present " + text);
		}
	}

	@Dado("^se pulsa \"(.*?)\"$")
	public void se_pulsa(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		esperarA(arg1);
		SeleniumUtils.waitTime(3000);
		SeleniumUtils.clickFocusAndHighlight(SeleniumSingleton.getSelenium(), arg1);
		SeleniumSingleton.waitForPageToLoad();
		//		throw new PendingException();
	}

	public void esperarA(String id) {
		Wait<WebDriver> wait = new WebDriverWait(SeleniumSingleton.getDriver(), 30);
		WebElement element = wait.until(visibilityOfElementLocated(By.id(id)));
	}

	//	@Y("^se pulsa \"(.*?)\"$")
	//	public void y_se_pulsa(String arg1) throws Throwable {
	//		se_pulsa(arg1);
	//	}
	@Entonces("^en el listado \"(.*?)\" (?:no) se visualizará \"(.*?)\"$")
	public void en_el_listado_no_se_visualizara(String listId, String negate, String value) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		esperarA(listId);
		throw new PendingException();
	}
}
