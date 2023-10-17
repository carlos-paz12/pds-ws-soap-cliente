package br.edu.ifrn.pds.ifilmes_ws.view;

import javax.swing.JOptionPane;

public class ViewRemoverDoCatalogo extends javax.swing.JFrame {

    public ViewRemoverDoCatalogo() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        btnBackView = new javax.swing.JButton();
        lblIfilmesLogo = new javax.swing.JLabel();
        pnlBackground = new javax.swing.JPanel();
        buttonRemoverFilme = new javax.swing.JButton();
        labelIdFilme = new javax.swing.JLabel();
        txtFieldIdFilme = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTop.setBackground(new java.awt.Color(255, 204, 51));
        pnlTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBackView.setBackground(new java.awt.Color(255, 204, 51));
        btnBackView.setForeground(new java.awt.Color(255, 255, 255));
        btnBackView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/pds/ifilmes_ws/view/resourcers/icon_back_arrow.png"))); // NOI18N
        btnBackView.setBorder(null);
        btnBackView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackViewActionPerformed(evt);
            }
        });
        pnlTop.add(btnBackView, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, -1));

        lblIfilmesLogo.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 16)); // NOI18N
        lblIfilmesLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIfilmesLogo.setText("IFilmes");
        pnlTop.add(lblIfilmesLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 20));

        getContentPane().add(pnlTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        pnlBackground.setBackground(new java.awt.Color(51, 51, 51));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonRemoverFilme.setBackground(new java.awt.Color(255, 204, 51));
        buttonRemoverFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonRemoverFilme.setText("Remover");
        buttonRemoverFilme.setBorder(null);
        buttonRemoverFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoverFilme.setFocusTraversalPolicyProvider(true);
        buttonRemoverFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverFilmeActionPerformed(evt);
            }
        });
        pnlBackground.add(buttonRemoverFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 80, 20));

        labelIdFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelIdFilme.setForeground(new java.awt.Color(204, 204, 204));
        labelIdFilme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIdFilme.setText("ID do Filme: *");
        pnlBackground.add(labelIdFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, -1));

        txtFieldIdFilme.setBackground(new java.awt.Color(65, 65, 65));
        txtFieldIdFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFieldIdFilme.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldIdFilme.setBorder(null);
        txtFieldIdFilme.setCaretColor(new java.awt.Color(255, 204, 51));
        txtFieldIdFilme.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtFieldIdFilme.setSelectionColor(new java.awt.Color(255, 204, 51));
        pnlBackground.add(txtFieldIdFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 360, 20));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackViewActionPerformed
        this.dispose();
        new ViewMain().setVisible(true);
    }//GEN-LAST:event_btnBackViewActionPerformed

    private void buttonRemoverFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverFilmeActionPerformed
        int id = Integer.parseInt(txtFieldIdFilme.getText());
        boolean result = delete(id);

        if (result)
        {
            JOptionPane.showMessageDialog(rootPane,
                "Filme removido com sucesso.",
                "Sucesso!",
                JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,
                "Erro ao tentar remover filme.",
                "Erro...",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonRemoverFilmeActionPerformed

    private static boolean delete(int idFilme) {
        br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS_Service service = new br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS_Service();
        br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS port = service.getIFilmesWSPort();
        return port.delete(idFilme);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackView;
    private javax.swing.JButton buttonRemoverFilme;
    private javax.swing.JLabel labelIdFilme;
    private javax.swing.JLabel lblIfilmesLogo;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField txtFieldIdFilme;
    // End of variables declaration//GEN-END:variables

}
