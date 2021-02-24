package co.com.juju.certificacion.incentivos.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.juju.certificacion.incentivos.Utilidades.url_video;
import static co.com.juju.certificacion.incentivos.userinterface.PublicarNoticiaIU.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PublicarNoticia implements Task {

    private String descripcion;

    public PublicarNoticia(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_DESCRIPCION,isVisible()),
                Scroll.to(LBL_DESCRIPCION),
                Enter.theValue(descripcion).into(TXT_NOTICIA),
                Click.on(ICON_VIDEO),
                Enter.theValue(url_video).into(TXT_URL_VIDEO),
                Click.on(BTN_PUBLICAR)
        );
    }

    public static PublicarNoticia con(String descripcion){
        return Tasks.instrumented(PublicarNoticia.class,descripcion);
    }

}
