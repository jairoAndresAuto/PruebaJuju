package co.com.juju.certificacion.incentivos.stepdefinitions;

import co.com.juju.certificacion.incentivos.questions.ValidateTarget;
import co.com.juju.certificacion.incentivos.task.IngresarLogin;
import co.com.juju.certificacion.incentivos.task.PublicarNoticia;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;
import static co.com.juju.certificacion.incentivos.Utilidades.*;
import static co.com.juju.certificacion.incentivos.userinterface.PublicarNoticiaIU.LBL_NOMBRE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PublicarNotaStep extends GeneralStepDefinitions{

    @Before
    public void Configuracion(){
        setUp(actor,url);
    }

    @Given("^que jairo se encuentra logueado en la pagina de tu logo$")
    public void queJairoSeEncuentraLogueadoEnLaPaginaDeTuLogo(List<Map<String,String>> credenciales) {
        theActorInTheSpotlight().attemptsTo(IngresarLogin.con(credenciales.get(0).get("user"),credenciales.get(0).get("password")));
    }

    @When("^procedo a publicar la noticia (.*), la url y publicar$")
    public void procedoAPublicarLaNoticiaSonLasInvestigacionesEmpíricasYTécnicasCuyoObjetivoEsProporcionarInformaciónObjetivaEIndependienteSobreLaCalidadDelProductoALaParteInteresadaOStakeholderEsUnaActividadMásEnElProcesoDeControlDeCalidadLaUrlYPublicar(String descripcion) {
        theActorInTheSpotlight().attemptsTo(PublicarNoticia.con(descripcion));
    }

    @Then("^observo que sale un pop up indicando elsiguiente mensaje (.*)$")
    public void observoQueSaleUnPopUpIndicandoElsiguienteMensajeNombre_Apellido_(String mensaje) {
        theActorInTheSpotlight().should(seeThat(ValidateTarget.attach(mensaje,LBL_NOMBRE)));
    }

}
