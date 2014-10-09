import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

/**
 * Created by developer on 10/9/14.
 */
public class GeneralStepDefinitions {

	@Dado("^estando en la página ((https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?)$")
	public void estamos_en_la_página_url(String url) {
		System.out.println("Url:" + url);
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Dado("^estando en la página ([a-z|A-Z|0-9]*)$")
	public void estamos_en_la_página_nombre(String url) {
		System.out.println("Url:" + url);
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Cuando("^se modifica el campo (\"(.*?)\")$ por (\"(.*?)\")$")
	public void se_modifica_el_campo_por(String nombreCampo, String valorCampo) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//        throw new PendingException();
		se_modifica_el_campo_por_gen(nombreCampo, valorCampo);
	}

	@Entonces("^en el campo (\"(.*?)\")$ se visualizará (\"(.*?)\")$")
	public void en_el_campo_se_visualizara(String nombreCampo, String valorCampo) throws Throwable {
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
		throw new PendingException();
	}

	//    @Y("^en el campo (\"(.*?)\")$ se visualizará (\"(.*?)\")$")
	//    public void y_en_el_campo_se_visualizara  (String nombreCampo, String valorCampo) throws Throwable {
	//        // Write code here that turns the phrase above into concrete actions
	////        throw new PendingException();
	//        en_el_campo_se_visualizara_gen (nombreCampo,valorCampo);
	//    }
	public void en_el_campo_se_visualizara_gen(String nombreCampo, String valorCampo) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		//        throw new PendingException();
		en_el_campo_se_visualizara_gen(nombreCampo, valorCampo);
	}

	@Dado("^estando logados como ([a-z|A-Z|0-9]*)$")
	public void estando_logados_como(String username) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Cuando("^vamos a la página (((https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?))$")
	public void vamos_a_la_página_url() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Cuando("^vamos a la página ([a-z0-9_-]*)$")
	public void vamos_a_la_página_nombre() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Cuando("^se navega hasta (\"(.*?)\")$")
	public void se_navegue_hasta_el_proyecto(String projectName) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entonces("^debería ver \"(.*?)\"$")
	public void debería_ver(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
