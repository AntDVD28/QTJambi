/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ditarea2;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;

/**
 *
 * @author AntDVD
 */
public class DITarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QApplication.initialize(args);
                QMainWindow mw = new QMainWindow();
                FormPrincipal principal = new FormPrincipal();
                principal.setupUi( mw );
                mw.show();
        QApplication.execStatic();
    }
    
}
