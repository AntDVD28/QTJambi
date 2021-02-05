/********************************************************************************
 ** Form generated from reading ui file 'ficha.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package ditarea2;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ficha implements com.trolltech.qt.QUiForm<QDialog>
{
    public QLabel label_logo;
    public QLabel label_titulo;
    public QLabel label_tituloFicha;
    public QWidget widget;
    public QGridLayout gridLayout_3;
    public QGridLayout gridLayout;
    public QSpacerItem horizontalSpacer_11;
    public QLineEdit lineEdit_tarifa;
    public QSpacerItem horizontalSpacer_4;
    public QSpacerItem verticalSpacer_4;
    public QSpacerItem horizontalSpacer_9;
    public QLabel label_tarifa;
    public QLabel label_mensaje;
    public QComboBox comboBox_comercial;
    public QSpacerItem verticalSpacer_3;
    public QSpacerItem horizontalSpacer_10;
    public QSpacerItem horizontalSpacer_5;
    public QLabel label_comercial;
    public QSpacerItem verticalSpacer_5;
    public QGroupBox groupBox_zona;
    public QVBoxLayout verticalLayout;
    public QHBoxLayout horizontalLayout_4;
    public QRadioButton radioButton_levante;
    public QRadioButton radioButton_centro;
    public QRadioButton radioButton_sur;
    public QGridLayout gridLayout_2;
    public QCheckBox checkBox_estructura;
    public QCheckBox checkBox_albanileria;
    public QCheckBox checkBox_fontaneria;
    public QCheckBox checkBox_cimentacion;
    public QSpacerItem verticalSpacer;
    public QCheckBox checkBox_decoracion;
    public QCheckBox checkBox_carpinteria;
    public QSpacerItem verticalSpacer_2;
    public QSpacerItem horizontalSpacer_8;
    public QSpacerItem horizontalSpacer_2;
    public QLabel label_nombre;
    public QCalendarWidget calendarWidget;
    public QLineEdit lineEdit_telefono;
    public QLineEdit lineEdit_apellidos;
    public QSpacerItem horizontalSpacer_7;
    public QSpacerItem horizontalSpacer;
    public QLabel label_codigo;
    public QHBoxLayout horizontalLayout_6;
    public QPushButton pushButton_aceptar;
    public QSpacerItem horizontalSpacer_3;
    public QPushButton pushButton_cancelar;
    public QLineEdit lineEdit_nombre;
    public QLabel label_apellidos;
    public QLabel label_telefono;
    public QLabel label_direccion;
    public QLineEdit lineEdit_codigo;
    public QLineEdit lineEdit_direccion;
    public QLabel label_fechaAlta;
    

    public Ficha() { super(); }
    
    void limpliar_checkboxs(){
        if(checkBox_estructura.isChecked()){
            checkBox_estructura.setCheckState(Qt.CheckState.Unchecked);
        }
        if(checkBox_cimentacion.isChecked()){
            checkBox_cimentacion.setCheckState(Qt.CheckState.Unchecked);
        }
        if(checkBox_albanileria.isChecked()){
            checkBox_albanileria.setCheckState(Qt.CheckState.Unchecked);
        }
        if(checkBox_fontaneria.isChecked()){
            checkBox_fontaneria.setCheckState(Qt.CheckState.Unchecked);
        }    
        if(checkBox_carpinteria.isChecked()){
            checkBox_carpinteria.setCheckState(Qt.CheckState.Unchecked);
        }
        if(checkBox_decoracion.isChecked()){
            checkBox_decoracion.setCheckState(Qt.CheckState.Unchecked);
        }
    }
    
   
    
    void habilitar_levante(){
        limpliar_checkboxs();
        lineEdit_tarifa.setEnabled(false);
        checkBox_estructura.setEnabled(true);
        checkBox_cimentacion.setEnabled(true);
        checkBox_albanileria.setEnabled(true);
        checkBox_fontaneria.setEnabled(true);
        checkBox_carpinteria.setEnabled(true);
        checkBox_decoracion.setEnabled(true);
    }
    
    void habilitar_centro(){
        limpliar_checkboxs();
        lineEdit_tarifa.setEnabled(false);
        checkBox_estructura.setEnabled(false);
        checkBox_cimentacion.setEnabled(false);
        checkBox_albanileria.setEnabled(true);
        checkBox_fontaneria.setEnabled(true);
        checkBox_carpinteria.setEnabled(true);
        checkBox_decoracion.setEnabled(true);
    }
    
    void habilitar_sur(){
        limpliar_checkboxs();
        lineEdit_tarifa.setEnabled(false);
        checkBox_estructura.setEnabled(false);
        checkBox_cimentacion.setEnabled(false);
        checkBox_albanileria.setEnabled(true);
        checkBox_fontaneria.setEnabled(true);
        checkBox_carpinteria.setEnabled(true);
        checkBox_decoracion.setEnabled(false);
    }
    
    void compruebaVacioCodigo(){
        if (lineEdit_codigo.isModified()){
            lineEdit_nombre.setEnabled(true);
            lineEdit_nombre.setFocus();           
        }
    }
    
    void compruebaVacioNombre(){
        if (lineEdit_nombre.isModified()){
            lineEdit_apellidos.setEnabled(true);
            lineEdit_apellidos.setFocus();
        }
    }
   
    void compruebaVacioApellidos(){
        if (lineEdit_apellidos.isModified()){
            lineEdit_direccion.setEnabled(true);
            lineEdit_direccion.setFocus();
        }
    }
    
    void compruebaVacioDireccion(){
        if (lineEdit_direccion.isModified()){
            lineEdit_telefono.setEnabled(true);
            lineEdit_telefono.setFocus();
        }
    }
    
    void compruebaVacioTelefono(){
        if (lineEdit_telefono.isModified()){
            calendarWidget.setEnabled(true);
            calendarWidget.setFocus();
            groupBox_zona.setEnabled(true);
        }
    }
    
    void activaTarifa(){
        if( checkBox_estructura.isChecked() || checkBox_cimentacion.isChecked() 
                || checkBox_albanileria.isChecked() || checkBox_fontaneria.isChecked() 
                || checkBox_carpinteria.isChecked() || checkBox_decoracion.isChecked()){
            lineEdit_tarifa.setEnabled(true);
        }
    }
    
    void compruebaTarifa(){
        label_mensaje.setVisible(false);
        if(lineEdit_tarifa.isModified()){
            String s = lineEdit_tarifa.text();
            Integer i = Integer.parseInt(s);
            if(i>100){
                label_mensaje.setVisible(true);
                lineEdit_tarifa.clear();
            }else {
                comboBox_comercial.setEnabled(true);
                pushButton_aceptar.setEnabled(true);
            }
                
        }
    }
    
    void mostrarMensaje(){
        QMessageBox msgBox = new QMessageBox();       
        msgBox.setText("Registro guardado correctamente");
        msgBox.exec();
    }
    

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(595, 591).expandedTo(Dialog.minimumSizeHint()));
        label_logo = new QLabel(Dialog);
        label_logo.setObjectName("label_logo");
        label_logo.setGeometry(new QRect(140, 30, 88, 68));
        label_logo.setPixmap(new QPixmap(("src/ditarea2/recursos/icono.png")));
        label_logo.setScaledContents(true);
        label_titulo = new QLabel(Dialog);
        label_titulo.setObjectName("label_titulo");
        label_titulo.setGeometry(new QRect(220, 60, 191, 20));
        label_titulo.setStyleSheet("font: 11pt \"Gill Sans Ultra Bold\";\n"+
"color: rgb(41, 104, 135);");
        label_tituloFicha = new QLabel(Dialog);
        label_tituloFicha.setObjectName("label_tituloFicha");
        label_tituloFicha.setEnabled(true);
        label_tituloFicha.setGeometry(new QRect(240, 90, 131, 19));
        label_tituloFicha.setStyleSheet("font: 10pt \"Gill Sans Ultra Bold\";\n"+
"color: rgb(41, 104, 135);");
        label_tituloFicha.setScaledContents(false);
        widget = new QWidget(Dialog);
        widget.setObjectName("widget");
        widget.setGeometry(new QRect(12, 122, 571, 458));
        gridLayout_3 = new QGridLayout(widget);
        gridLayout_3.setObjectName("gridLayout_3");
        gridLayout = new QGridLayout();
        gridLayout.setObjectName("gridLayout");
        horizontalSpacer_11 = new QSpacerItem(18, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_11, 0, 0, 1, 2);

        lineEdit_tarifa = new QLineEdit(widget);
        lineEdit_tarifa.setObjectName("lineEdit_tarifa");

        gridLayout.addWidget(lineEdit_tarifa, 0, 3, 1, 1);

        horizontalSpacer_4 = new QSpacerItem(108, 17, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_4, 0, 4, 1, 2);

        verticalSpacer_4 = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer_4, 1, 6, 1, 1);

        horizontalSpacer_9 = new QSpacerItem(18, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_9, 1, 0, 1, 2);

        label_tarifa = new QLabel(widget);
        label_tarifa.setObjectName("label_tarifa");

        gridLayout.addWidget(label_tarifa, 0, 2, 1, 1);

        label_mensaje = new QLabel(widget);
        label_mensaje.setObjectName("label_mensaje");
        label_mensaje.setEnabled(true);
        label_mensaje.setStyleSheet("color: red;");

        gridLayout.addWidget(label_mensaje, 1, 2, 1, 3);

        comboBox_comercial = new QComboBox(widget);
        comboBox_comercial.setObjectName("comboBox_comercial");

        gridLayout.addWidget(comboBox_comercial, 2, 3, 1, 3);

        verticalSpacer_3 = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer_3, 2, 6, 1, 1);

        horizontalSpacer_10 = new QSpacerItem(18, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_10, 1, 5, 1, 1);

        horizontalSpacer_5 = new QSpacerItem(13, 17, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer_5, 2, 0, 1, 1);

        label_comercial = new QLabel(widget);
        label_comercial.setObjectName("label_comercial");

        gridLayout.addWidget(label_comercial, 2, 1, 1, 2);

        verticalSpacer_5 = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout.addItem(verticalSpacer_5, 0, 6, 1, 1);


        gridLayout_3.addLayout(gridLayout, 7, 5, 1, 4);

        groupBox_zona = new QGroupBox(widget);
        groupBox_zona.setObjectName("groupBox_zona");
        groupBox_zona.setFlat(false);
        groupBox_zona.setCheckable(false);
        verticalLayout = new QVBoxLayout(groupBox_zona);
        verticalLayout.setObjectName("verticalLayout");
        horizontalLayout_4 = new QHBoxLayout();
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        radioButton_levante = new QRadioButton(groupBox_zona);
        radioButton_levante.setObjectName("radioButton_levante");

        horizontalLayout_4.addWidget(radioButton_levante);

        radioButton_centro = new QRadioButton(groupBox_zona);
        radioButton_centro.setObjectName("radioButton_centro");

        horizontalLayout_4.addWidget(radioButton_centro);

        radioButton_sur = new QRadioButton(groupBox_zona);
        radioButton_sur.setObjectName("radioButton_sur");

        horizontalLayout_4.addWidget(radioButton_sur);


        verticalLayout.addLayout(horizontalLayout_4);

        gridLayout_2 = new QGridLayout();
        gridLayout_2.setObjectName("gridLayout_2");
        checkBox_estructura = new QCheckBox(groupBox_zona);
        checkBox_estructura.setObjectName("checkBox_estructura");
        checkBox_estructura.setEnabled(false);

        gridLayout_2.addWidget(checkBox_estructura, 1, 0, 1, 1);

        checkBox_albanileria = new QCheckBox(groupBox_zona);
        checkBox_albanileria.setObjectName("checkBox_albanileria");
        checkBox_albanileria.setEnabled(false);

        gridLayout_2.addWidget(checkBox_albanileria, 1, 2, 1, 1);

        checkBox_fontaneria = new QCheckBox(groupBox_zona);
        checkBox_fontaneria.setObjectName("checkBox_fontaneria");
        checkBox_fontaneria.setEnabled(false);

        gridLayout_2.addWidget(checkBox_fontaneria, 2, 0, 1, 1);

        checkBox_cimentacion = new QCheckBox(groupBox_zona);
        checkBox_cimentacion.setObjectName("checkBox_cimentacion");
        checkBox_cimentacion.setEnabled(false);

        gridLayout_2.addWidget(checkBox_cimentacion, 1, 1, 1, 1);

        verticalSpacer = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout_2.addItem(verticalSpacer, 3, 1, 1, 1);

        checkBox_decoracion = new QCheckBox(groupBox_zona);
        checkBox_decoracion.setObjectName("checkBox_decoracion");
        checkBox_decoracion.setEnabled(false);

        gridLayout_2.addWidget(checkBox_decoracion, 2, 2, 1, 1);

        checkBox_carpinteria = new QCheckBox(groupBox_zona);
        checkBox_carpinteria.setObjectName("checkBox_carpinteria");
        checkBox_carpinteria.setEnabled(false);

        gridLayout_2.addWidget(checkBox_carpinteria, 2, 1, 1, 1);

        verticalSpacer_2 = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout_2.addItem(verticalSpacer_2, 0, 1, 1, 1);


        verticalLayout.addLayout(gridLayout_2);


        gridLayout_3.addWidget(groupBox_zona, 7, 0, 1, 5);

        horizontalSpacer_8 = new QSpacerItem(0, 0, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_3.addItem(horizontalSpacer_8, 0, 7, 1, 2);

        horizontalSpacer_2 = new QSpacerItem(358, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_3.addItem(horizontalSpacer_2, 4, 2, 1, 7);

        label_nombre = new QLabel(widget);
        label_nombre.setObjectName("label_nombre");

        gridLayout_3.addWidget(label_nombre, 2, 0, 1, 1);

        calendarWidget = new QCalendarWidget(widget);
        calendarWidget.setObjectName("calendarWidget");

        gridLayout_3.addWidget(calendarWidget, 5, 2, 2, 6);

        lineEdit_telefono = new QLineEdit(widget);
        lineEdit_telefono.setObjectName("lineEdit_telefono");

        gridLayout_3.addWidget(lineEdit_telefono, 4, 1, 1, 1);

        lineEdit_apellidos = new QLineEdit(widget);
        lineEdit_apellidos.setObjectName("lineEdit_apellidos");

        gridLayout_3.addWidget(lineEdit_apellidos, 2, 4, 1, 5);

        horizontalSpacer_7 = new QSpacerItem(78, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_3.addItem(horizontalSpacer_7, 6, 8, 1, 1);

        horizontalSpacer = new QSpacerItem(307, 17, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_3.addItem(horizontalSpacer, 1, 0, 1, 6);

        label_codigo = new QLabel(widget);
        label_codigo.setObjectName("label_codigo");

        gridLayout_3.addWidget(label_codigo, 1, 6, 1, 1);

        horizontalLayout_6 = new QHBoxLayout();
        horizontalLayout_6.setObjectName("horizontalLayout_6");
        pushButton_aceptar = new QPushButton(widget);
        pushButton_aceptar.setObjectName("pushButton_aceptar");

        horizontalLayout_6.addWidget(pushButton_aceptar);

        horizontalSpacer_3 = new QSpacerItem(258, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_6.addItem(horizontalSpacer_3);

        pushButton_cancelar = new QPushButton(widget);
        pushButton_cancelar.setObjectName("pushButton_cancelar");

        horizontalLayout_6.addWidget(pushButton_cancelar);


        gridLayout_3.addLayout(horizontalLayout_6, 8, 0, 1, 9);

        lineEdit_nombre = new QLineEdit(widget);
        lineEdit_nombre.setObjectName("lineEdit_nombre");
        lineEdit_nombre.setMaxLength(10);

        gridLayout_3.addWidget(lineEdit_nombre, 2, 1, 1, 2);

        label_apellidos = new QLabel(widget);
        label_apellidos.setObjectName("label_apellidos");

        gridLayout_3.addWidget(label_apellidos, 2, 3, 1, 1);

        label_telefono = new QLabel(widget);
        label_telefono.setObjectName("label_telefono");

        gridLayout_3.addWidget(label_telefono, 4, 0, 1, 1);

        label_direccion = new QLabel(widget);
        label_direccion.setObjectName("label_direccion");

        gridLayout_3.addWidget(label_direccion, 3, 0, 1, 1);

        lineEdit_codigo = new QLineEdit(widget);
        lineEdit_codigo.setObjectName("lineEdit_codigo");
        lineEdit_codigo.setMaxLength(5);

        gridLayout_3.addWidget(lineEdit_codigo, 1, 7, 1, 2);

        lineEdit_direccion = new QLineEdit(widget);
        lineEdit_direccion.setObjectName("lineEdit_direccion");

        gridLayout_3.addWidget(lineEdit_direccion, 3, 1, 1, 8);

        label_fechaAlta = new QLabel(widget);
        label_fechaAlta.setObjectName("label_fechaAlta");

        gridLayout_3.addWidget(label_fechaAlta, 5, 0, 1, 2);

        label_tarifa.setBuddy(lineEdit_tarifa);
        label_comercial.setBuddy(comboBox_comercial);
        label_nombre.setBuddy(lineEdit_nombre);
        label_codigo.setBuddy(lineEdit_codigo);
        label_apellidos.setBuddy(lineEdit_apellidos);
        label_telefono.setBuddy(lineEdit_telefono);
        label_direccion.setBuddy(lineEdit_direccion);
        QWidget.setTabOrder(lineEdit_codigo, lineEdit_nombre);
        QWidget.setTabOrder(lineEdit_nombre, lineEdit_apellidos);
        QWidget.setTabOrder(lineEdit_apellidos, lineEdit_direccion);
        QWidget.setTabOrder(lineEdit_direccion, lineEdit_telefono);
        QWidget.setTabOrder(lineEdit_telefono, calendarWidget);
        QWidget.setTabOrder(calendarWidget, radioButton_levante);
        QWidget.setTabOrder(radioButton_levante, radioButton_centro);
        QWidget.setTabOrder(radioButton_centro, radioButton_sur);
        QWidget.setTabOrder(radioButton_sur, checkBox_estructura);
        QWidget.setTabOrder(checkBox_estructura, checkBox_cimentacion);
        QWidget.setTabOrder(checkBox_cimentacion, checkBox_albanileria);
        QWidget.setTabOrder(checkBox_albanileria, checkBox_fontaneria);
        QWidget.setTabOrder(checkBox_fontaneria, checkBox_carpinteria);
        QWidget.setTabOrder(checkBox_carpinteria, checkBox_decoracion);
        QWidget.setTabOrder(checkBox_decoracion, lineEdit_tarifa);
        QWidget.setTabOrder(lineEdit_tarifa, comboBox_comercial);
        QWidget.setTabOrder(comboBox_comercial, pushButton_aceptar);
        QWidget.setTabOrder(pushButton_aceptar, pushButton_cancelar);
        retranslateUi(Dialog);
        pushButton_cancelar.clicked.connect(Dialog, "close()");
        
        //Establezco el foco en el campo código
        lineEdit_codigo.setFocus();
        
        
        //Deshabilito todos los campos salvo el del código
        lineEdit_nombre.setEnabled(false);
        lineEdit_apellidos.setEnabled(false);
        lineEdit_direccion.setEnabled(false);
        lineEdit_telefono.setEnabled(false);
        calendarWidget.setEnabled(false);
        groupBox_zona.setEnabled(false);
        lineEdit_tarifa.setEnabled(false);
        comboBox_comercial.setEnabled(false);
        pushButton_aceptar.setEnabled(false);
        
        //Oculto mensaje de error
        label_mensaje.setVisible(false);
        
               
        //conexión signal/slot para la gestión de las zonas
        radioButton_levante.clicked.connect(this, "habilitar_levante()");    
        radioButton_centro.clicked.connect(this, "habilitar_centro()");      
        radioButton_sur.clicked.connect(this, "habilitar_sur()");
        
        //conexión signal/slot para los line_Edit siguientes
        lineEdit_codigo.editingFinished.connect(this, "compruebaVacioCodigo()");      
        lineEdit_nombre.editingFinished.connect(this, "compruebaVacioNombre()");    
        lineEdit_apellidos.editingFinished.connect(this, "compruebaVacioApellidos()");
        lineEdit_direccion.editingFinished.connect(this, "compruebaVacioDireccion()");      
        lineEdit_telefono.editingFinished.connect(this, "compruebaVacioTelefono()");
        
        //No compruebo si se modificó el calendario porque por defecto se marca el día actual
        
        //conexión signal/slot para los checkbox. Si activamos al menos uno de los checkbox activamos la tarifa
        checkBox_estructura.stateChanged.connect(this, "activaTarifa()");
        checkBox_cimentacion.stateChanged.connect(this, "activaTarifa()");
        checkBox_albanileria.stateChanged.connect(this, "activaTarifa()");
        checkBox_fontaneria.stateChanged.connect(this, "activaTarifa()");
        checkBox_carpinteria.stateChanged.connect(this, "activaTarifa()");
        checkBox_decoracion.stateChanged.connect(this, "activaTarifa()");
        
        //conexión signal/slot para el componente de la tarifa
        lineEdit_tarifa.editingFinished.connect(this, "compruebaTarifa()");
        
        //conexión signal/slot para el botón Aceptar.
        //Creamos dos slots para la misma señal
        pushButton_aceptar.clicked.connect(this, "mostrarMensaje()");
        pushButton_aceptar.clicked.connect(Dialog, "close()");

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Dialog", null));
        label_logo.setText("");
        label_titulo.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "SEGUROS CAISERDJR", null));
        label_tituloFicha.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Ficha de cliente", null));
        lineEdit_tarifa.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Tarifa</p></body></html>", null));
        lineEdit_tarifa.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "000; ", null));
        label_tarifa.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Tari&fa:", null));
        label_mensaje.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "La tarifa no puede ser mayor a 100.", null));
        comboBox_comercial.clear();
        comboBox_comercial.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Maria de Valme Cot\u00e1n G\u00f3mez", null));
        comboBox_comercial.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Maria Flor Moncada A\u00f1\u00f3n", null));
        comboBox_comercial.addItem(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "David Jim\u00e9nez Riscardo", null));
        comboBox_comercial.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Comercial que gestiona el seguro</p></body></html>", null));
        label_comercial.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Co&mercial:", null));
        groupBox_zona.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Zona donde reside el cliente</p></body></html>", null));
        groupBox_zona.setTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Zona", null));
        radioButton_levante.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Levante", null));
        radioButton_centro.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Centro", null));
        radioButton_sur.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Sur", null));
        checkBox_estructura.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Estructura", null));
        checkBox_albanileria.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Alba\u00f1iler\u00eda", null));
        checkBox_fontaneria.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fontaner\u00eda", null));
        checkBox_cimentacion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cimentaci\u00f3n", null));
        checkBox_decoracion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Decoraci\u00f3n", null));
        checkBox_carpinteria.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Carpinter\u00eda", null));
        label_nombre.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Nombre:", null));
        lineEdit_telefono.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "000000000; ", null));
        lineEdit_apellidos.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Apellidos del cliente</p></body></html>", null));
        lineEdit_apellidos.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "nnnnnnnnnn; ", null));
        label_codigo.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&C\u00f3digo:", null));
        pushButton_aceptar.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Guardar los cambios</p></body></html>", null));
        pushButton_aceptar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Ace&ptar", null));
        pushButton_cancelar.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Cancelar los cambios</p></body></html>", null));
        pushButton_cancelar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cance&lar", null));
        lineEdit_nombre.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>Nombre del cliente</p></body></html>", null));
        lineEdit_nombre.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "nnnnnnnnnn; ", null));
        label_apellidos.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Apellidos:", null));
        label_telefono.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Tel\u00e9fono:", null));
        label_direccion.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "&Direcci\u00f3n:", null));
        lineEdit_codigo.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "<html><head/><body><p>C\u00f3digo del cliente</p></body></html>", null));
        lineEdit_codigo.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "nnnnn; ", null));
        lineEdit_direccion.setInputMask(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnn; ", null));
        label_fechaAlta.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Fecha de alta:", null));
    } // retranslateUi

}

