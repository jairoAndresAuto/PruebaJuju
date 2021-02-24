package co.com.juju.certificacion.incentivos.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginIU {

    public static Target TXT_USUARIO=
            Target.the("ingreso login").located(By.id("userName"));
    public static Target TXT_CLAVE =
            Target.the("ingreso clave").located(By.id("password"));
    public static Target BTN_INGRESAR=
            Target.the("boton ingresar").located(By.xpath("//button[contains(.,'Entrar')]"));

}
