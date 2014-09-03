import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.*;

/**
 * Created by developer on 7/29/14.
 */
public class CalidadStepDefinitions {

    @Dado("^estando en la página ((https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?)$")
    public void estamos_en_la_página_url(String url)
    {
        System.out.println("Url:"+url);
// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }




    @Dado("^estando en la página ([a-z|A-Z|0-9]*)$")
    public void estamos_en_la_página_nombre (String url)
    {
        System.out.println("Url:"+url);
// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Cuando("^se necesita un nuevo proyecto$")
    public void se_necesita_un_nuevo_proyecto ()
    {
// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^existirá en los sistemas de Caf$")
    public void existira_en_los_sistemas_de_Caf (){
// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



    @Dado("^un proyecto llamado (\"(.*?)\")$")
    public void un_proyecto_llamado_proyecto_ejemplo() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Y ("^se modifica el campo (\"(.*?)\")$ por (\"(.*?)\")$")
    @Cuando ("^se modifica el campo (\"(.*?)\")$ por (\"(.*?)\")$")
    public void se_modifica_el_campo_por (String nombreCampo, String valorCampo) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Y("^en el campo (\"(.*?)\")$ se visualizará (\"(.*?)\")$")
    @Entonces("^en el campo (\"(.*?)\")$ se visualizará (\"(.*?)\")$")
    public void en_el_campo_se_visualizara  (String nombreCampo, String valorCampo) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }





    @Dado("^estando logados como ([a-z|A-Z|0-9]*)$")
    public void estando_logados_como (String username) throws Throwable {
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

    @Entonces("^se deberían ver el árbol de proyectos$")
    public void se_deberían_ver_el_árbol_de_proyectos() throws Throwable {
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

    @Cuando("^se añada una unidad$")
    public void se_añada_una_unidad() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^debería ver la nueva unidad en el listado$")
    public void debería_ver_la_nueva_unidad_en_el_listado() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^deberá ver los coches de cada unidad con el tipo especificado$")
    public void deberá_ver_los_coches_de_cada_unidad_con_el_tipo_especificado() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Cuando("^se edite la información de cabecera y se guarde$")
    public void se_edite_la_información_de_cabecera_y_se_guarde() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^se deberá ver correctamente$")
    public void se_deberá_ver_correctamente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



    @Given("^a mower in (\\d+),(\\d+) facin$")
    public void a_mower_in_facin(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I pivot the mower to the right$")
    public void i_pivot_the_mower_to_the_right() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I move the mower$")
    public void i_move_the_mower() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I move the d$")
    public void i_move_the_d() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the mower should be in (\\d+),(\\d+) facing east$")
    public void the_mower_should_be_in_facing_east(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Cuando("^copiamos la estructura de un proyecto$")
    public void copiamos_la_estructura_de_un_proyecto() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^se generará la estructura en el proyecto actual$")
    public void se_generará_la_estructura_en_el_proyecto_actual() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^tendrá las mismas unidades$")
    public void tendrá_las_mismas_unidades() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^los mismos coches$")
    public void los_mismos_coches() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Dado("^estamos editando un proyecto$")
    public void estamos_editando_un_proyecto() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



    @Cuando("^añadimos el responsable ([a-z|A-Z|0-9]*)  al proyecto$")
    public void añadimos_el_resposable_al_proyecto (String resposable)
    {
// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Entonces("^el responsable ([a-z|A-Z|0-9]*) no se listará en el  ([a-z|A-Z|0-9]*)$")
    public void el_resposable_no_se_listara_en (String resposable)
    {
// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Pero("^el responsable ([a-z|A-Z|0-9]*) se visualizará en el listado de ([a-z|A-Z|0-9]*)$")
    public void el_resposable_se_visualizara_en_el_listado_de (String responsable)
    {
// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @Dado("^el proyecto ([a-z|A-Z|0-9]*) existe$")
    public void el_proyecto_prueba_existe (String responsable)
    {
// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }





    @Cuando("^en la tabla (\"(.*?)\")$ fila (\"(.*?)\")$ se modifica el campo (\"(.*?)\")$ a (\"(.*?)\")$")
    public void en_la_tabla_fila_se_modifica_el_campo (String tabla, String fila, String campo, String valor)
    {
// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Entonces("^en la tabla (\"(.*?)\")$ fila (\"(.*?)\")$ el campo \"Estado\" tendrá el valor (\"(.*?)\")$ ")
    public void en_la_tabla_fila_el_campo_tendra_el_valor (String tabla, String fila, String campo, String valor)
    {
// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }




    @Entonces("^en la tabla (\"(.*?)\")$ fila (\"(.*?)\")$ se visualiza el valor (\"(.*?)\")$ en el campo (\"(.*?)\")$")
    public void en_la_tabla_fila_se_modifica_el_campo_(String tabla, String fila, String valor, String campo)
    {
// Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
