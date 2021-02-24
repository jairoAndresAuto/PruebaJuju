package co.com.juju.certificacion.incentivos.task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.juju.certificacion.incentivos.userinterface.LoginIU.*;

public class IngresarLogin implements Task {

    private String user;
    private String password;

    public IngresarLogin(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 Enter.keyValues(user).into(TXT_USUARIO),
                 Enter.keyValues(password).into(TXT_CLAVE),
                 Click.on(BTN_INGRESAR)
         );
    }

    public static IngresarLogin con(String user, String password){
        return Tasks.instrumented(IngresarLogin.class,user,password);
    }

}
