package co.com.juju.certificacion.incentivos.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PublicarNoticiaIU {

    public static Target LBL_DESCRIPCION=
            Target.the("label descripción").located(By.xpath("//label[contains(.,'Descripción')]"));
    public static Target TXT_NOTICIA=
            Target.the("texto noticia").located(By.id("txtPublishDescription"));
    public static Target BTN_PUBLICAR=
            Target.the("Boton publicar").located(By.xpath("//button[contains(.,'Publicar')]"));
    public static Target ICON_VIDEO=
            Target.the("icono video").located(By.xpath("//i[@class='icon-icon_Video publish-actions']"));
    public static Target TXT_URL_VIDEO=
            Target.the("texto url video").located(By.xpath("//input[@name='video']"));
    public static Target LBL_NOMBRE=
            Target.the("etiqueta nombre").located(By.xpath("//h4[contains(.,'Nombre_124924 Apellido_124924')]"));


}
