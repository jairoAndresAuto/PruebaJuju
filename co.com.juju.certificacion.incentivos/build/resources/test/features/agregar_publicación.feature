Feature: Realizar una publicacion en la pagina tu logo

  Scenario Outline: publicar noticia y video sobre pruebas
    Given que jairo se encuentra logueado en la pagina de tu logo
      |user    | password|
      |jujudemo| 12345678|
    When procedo a publicar la noticia <descripcion>, la url y publicar
    Then observo que sale un pop up indicando elsiguiente mensaje Nombre_124924 Apellido_124924

    Examples:
      |descripcion   |
      |son las investigaciones empíricas y técnicas cuyo objetivo es proporcionar información objetiva e independiente sobre la calidad del producto a la parte interesada o stakeholder. Es una actividad más en el proceso de control de calidad.|

