# QTJambi

Diseño de una interfaz básica

Trabajo correspondiente a la asignatura DI (Desarrollo de Interfaces) perteneciente a la titulación de Técnico Superior en el Desarrollo de aplicaciones multiplataforma.

La práctica consistía en crear una interfaz multiplataforma (usando QT Jambi) que permita la gestión de los clientes de una empresa de reparación de siniestros llamada Seguros Caiser.

Los pasos seguidos a groso modo fueron:

0. Descargar qtjambi (https://sourceforge.net/projects/qtjambi/), utilizé la versión 4.8.7

1. Crear la interfaz y ciertas funcionalidades utilizando la herramienta QtDesigner

2. Transformar la interfaz obtenida a código java, para lo cual haremos uso de la herramienta "juic" desde la línea de comando

    juic -pf frmPrincipal.jui
    juic -pf ficha.jui

3. Crear un proyecto en Netbeans y agregar los archivos java obtenidos. Deberemos también añadir las bibliotecas correspondientes, incluidas en la descarga.

4. Completar la funcionalidad de la aplicación desde Netbeans.


En la carpeta "interfaces" se encuentra las interfaces creadas con QtDesigner. Las interfaces debemos guardarlas con extensión ".jui", en mi caso al no poder ofrecerme esta opción QtDesigner guardé las interfaces como ".ui", posteriormente renombré dicha extensión editando la etiqueta "ui" de los archivos XML generados, adicionando la opción: language= "jambi"

<ui version="4.0" language="jambi">
  
 Esto sería conveniente para poder utilizar posteriormente la herramienta "juic", sino no reconocerá los archivos.
