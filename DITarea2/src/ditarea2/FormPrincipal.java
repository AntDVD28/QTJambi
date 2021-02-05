/********************************************************************************
 ** Form generated from reading ui file 'formPrincipal.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package ditarea2;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class FormPrincipal implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QAction actionSalir;
    public QAction actionAbrir_Ficha;
    public QWidget centralwidget;
    public QLabel label_imagen;
    public QPushButton pushButton_AbrirFicha;
    public QPushButton pushButton_CerrarFormPrincipal;
    public QLabel label_titulo;
    public QLabel label_logo;
    public QMenuBar menubar;
    public QMenu menuArchivo;
    public QMenu menuSeg_Caiser;
    public QStatusBar statusbar;

    public FormPrincipal(){ super(); }
    
    void abrir(){

        Ficha f = new Ficha();
        QDialog dialog = new QDialog();
        f.setupUi(dialog);
        dialog.show();

    }

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(500, 322).expandedTo(MainWindow.minimumSizeHint()));

        //Menú Salir
        actionSalir = new QAction(MainWindow);
        actionSalir.setObjectName("actionSalir");
        /******************************************************
         * Añadimos funcionalidad al menú
         */
        actionSalir.triggered.connect(MainWindow, "close()");
        
        //Menú Abrir Ficha
        actionAbrir_Ficha = new QAction(MainWindow);
        actionAbrir_Ficha.setObjectName("actionAbrir_Ficha");
        /******************************************************
         * Añadimos funcionalidad al menú
         */
        actionAbrir_Ficha.triggered.connect(this, "abrir()");
        /*********************************************************/
        
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        label_imagen = new QLabel(centralwidget);
        label_imagen.setObjectName("label_imagen");
        label_imagen.setGeometry(new QRect(10, 90, 290, 174));
        //Mostrar fotografía
        label_imagen.setPixmap(new QPixmap(("src/ditarea2/recursos/foto.png")));
        label_imagen.setScaledContents(true);
        label_imagen.setWordWrap(false);
        pushButton_AbrirFicha = new QPushButton(centralwidget);
        pushButton_AbrirFicha.setObjectName("pushButton_AbrirFicha");
        pushButton_AbrirFicha.setGeometry(new QRect(350, 100, 100, 25));
        pushButton_AbrirFicha.setStyleSheet("font: 8pt \"Gill Sans Ultra Bold\";\n"+
"color: rgb(41, 104, 135);\n"+
"border-radius: 8px;\n"+
"background-color: rgb(148,180,195);\n"+
"");
        pushButton_CerrarFormPrincipal = new QPushButton(centralwidget);
        pushButton_CerrarFormPrincipal.setObjectName("pushButton_CerrarFormPrincipal");
        pushButton_CerrarFormPrincipal.setGeometry(new QRect(350, 180, 100, 25));
        pushButton_CerrarFormPrincipal.setStyleSheet("font: 8pt \"Gill Sans Ultra Bold\";\n"+
"color: rgb(41, 104, 135);\n"+
"border-radius: 8px;\n"+
"background-color: rgb(148,180,195);");
        label_titulo = new QLabel(centralwidget);
        label_titulo.setObjectName("label_titulo");
        label_titulo.setGeometry(new QRect(190, 40, 201, 20));
        label_titulo.setStyleSheet("font: 11pt \"Gill Sans Ultra Bold\";\n"+
"color: rgb(41, 104, 135);");
        label_logo = new QLabel(centralwidget);
        label_logo.setObjectName("label_logo");
        label_logo.setEnabled(true);
        label_logo.setGeometry(new QRect(100, 10, 88, 68));
        label_logo.setPixmap(new QPixmap(("src/ditarea2/recursos/icono.png")));
        label_logo.setScaledContents(true);
        label_logo.setWordWrap(true);
        label_logo.setMargin(0);
        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 500, 21));
        menuArchivo = new QMenu(menubar);
        menuArchivo.setObjectName("menuArchivo");
        menuSeg_Caiser = new QMenu(menubar);
        menuSeg_Caiser.setObjectName("menuSeg_Caiser");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuArchivo.menuAction());
        menubar.addAction(menuSeg_Caiser.menuAction());
        menuArchivo.addAction(actionSalir);
        menuSeg_Caiser.addAction(actionAbrir_Ficha);
        retranslateUi(MainWindow);
        pushButton_CerrarFormPrincipal.clicked.connect(MainWindow, "close()");
        
        pushButton_AbrirFicha.clicked.connect(this, "abrir()");

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        actionSalir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Salir", null));
        actionAbrir_Ficha.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Abrir Ficha", null));
        label_imagen.setText("");
        pushButton_AbrirFicha.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"+
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"+
"p, li { white-space: pre-wrap; }\n"+
"</style></head><body style=\" font-family:'Gill Sans Ultra Bold'; font-size:8pt; font-weight:400; font-style:normal;\">\n"+
"<p style=\" margin-top:12px; margin-bottom:12px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-size:7pt;\">Abrir ficha</span></p></body></html>", null));
        pushButton_AbrirFicha.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "&Ficha", null));
        pushButton_CerrarFormPrincipal.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "<html><head/><body><p><span style=\" font-size:7pt;\">Cerrar Aplicaci\u00f3n</span></p></body></html>", null));
        pushButton_CerrarFormPrincipal.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "&Salir", null));
        label_titulo.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "SEGUROS CAISERDJR", null));
        label_logo.setText("");
        menuArchivo.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Archivo", null));
        menuSeg_Caiser.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Seg.Caiser", null));
    } // retranslateUi

}

