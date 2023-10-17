package br.edu.ifrn.pds.ifilmes_ws;

import br.edu.ifrn.pds.ifilmes_ws.view.ViewMain;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UIManager;
import java.util.logging.Logger;

public class IFilmesApplicationMain {

    public static void main(String[] args) {
        try {

            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {

                if ("Windows".equals(info.getName())) {

                    UIManager.setLookAndFeel(info.getClassName());
                    break;

                }

            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

            Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

        ViewMain viewHome = new ViewMain();
        viewHome.setVisible(true);
    }

}
