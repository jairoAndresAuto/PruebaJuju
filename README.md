# PruebaJuju

Durante la prueba se escogio el lenguaje JAVA como herramienta de automatización, a continuación anexo lo que se debe de tener en cuenta para replicar el escenario de prueba:

Descargar el jdk1.8.0_271 y crear la variable de entorno java home en una ruta similar a esta donde hallas guardado dicha descarga: C:\Program Files\Java\jdk1.8.0_271
Descargar IntelliJ IDEA Community Edition 2020.2.3
Descargar el plugin de cucumber en intellij: https://letzdotesting.com/install-cucumber-plugin-for-intellij/
Descargar Gradle https://www.adictosaltrabajo.com/2013/12/04/gradle-install/

despues de tener estas herramientas instaladas, se debe abrir intellij y abrir el proyecto. Una vez abierto se deben impotar las librerias desde la pestaña build.gradle o muchas veces lo realiza de forma automatica. Despues de tener todo me dirijo a la siguiente ruta: src/test/co.com.juju.certificacion.incentivos.runners/runners/publicarNotaRunner, se da clic derecho y RUN.

NOTA: El driver de chrome debe de ser la misma version del navegador para que pueda correr
