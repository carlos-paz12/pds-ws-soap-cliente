package br.edu.ifrn.pds.ifilmes_ws.view;

import javax.swing.JOptionPane;

public class ViewAtualizarAvaliacao extends javax.swing.JFrame {

    public ViewAtualizarAvaliacao() {
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
        labelIdFilme = new javax.swing.JLabel();
        txtFieldIdFilme = new javax.swing.JTextField();
        txtFieldNovaAvaliacaoFilme = new javax.swing.JTextField();
        labelNovaAvaliacaoFilme = new javax.swing.JLabel();
        buttonAtualizarFilme = new javax.swing.JButton();

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

        labelIdFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelIdFilme.setForeground(new java.awt.Color(204, 204, 204));
        labelIdFilme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIdFilme.setText("ID do Filme: *");
        pnlBackground.add(labelIdFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, -1));

        txtFieldIdFilme.setBackground(new java.awt.Color(65, 65, 65));
        txtFieldIdFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFieldIdFilme.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldIdFilme.setBorder(null);
        txtFieldIdFilme.setCaretColor(new java.awt.Color(255, 204, 51));
        txtFieldIdFilme.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtFieldIdFilme.setSelectionColor(new java.awt.Color(255, 204, 51));
        pnlBackground.add(txtFieldIdFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 360, 20));

        txtFieldNovaAvaliacaoFilme.setBackground(new java.awt.Color(65, 65, 65));
        txtFieldNovaAvaliacaoFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFieldNovaAvaliacaoFilme.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldNovaAvaliacaoFilme.setBorder(null);
        txtFieldNovaAvaliacaoFilme.setCaretColor(new java.awt.Color(255, 204, 51));
        txtFieldNovaAvaliacaoFilme.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtFieldNovaAvaliacaoFilme.setSelectionColor(new java.awt.Color(255, 204, 51));
        pnlBackground.add(txtFieldNovaAvaliacaoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 360, 20));

        labelNovaAvaliacaoFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelNovaAvaliacaoFilme.setForeground(new java.awt.Color(204, 204, 204));
        labelNovaAvaliacaoFilme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNovaAvaliacaoFilme.setText("Nova avaliação: *");
        pnlBackground.add(labelNovaAvaliacaoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 400, -1));

        buttonAtualizarFilme.setBackground(new java.awt.Color(255, 204, 51));
        buttonAtualizarFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonAtualizarFilme.setText("Atualizar");
        buttonAtualizarFilme.setBorder(null);
        buttonAtualizarFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAtualizarFilme.setFocusTraversalPolicyProvider(true);
        buttonAtualizarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarFilmeActionPerformed(evt);
            }
        });
        pnlBackground.add(buttonAtualizarFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 80, 20));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackViewActionPerformed
        this.dispose();
        new ViewMain().setVisible(true);
    }//GEN-LAST:event_btnBackViewActionPerformed

    private void buttonAtualizarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarFilmeActionPerformed
        int id = Integer.parseInt(txtFieldIdFilme.getText());
        double novaAvaliacao = Double.parseDouble(txtFieldNovaAvaliacaoFilme.getText());
        boolean result = update(id, novaAvaliacao);

        if (result) {
            JOptionPane.showMessageDialog(rootPane,
                    "Filme atualizado com sucesso.",
                    "Sucesso!",
                    JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Erro ao tentar atualizar filme.",
                    "Erro...",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonAtualizarFilmeActionPerformed

    private static boolean update(int idFIlme, double novaAvaliacao) {
        br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS_Service service = new br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS_Service();
        br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS port = service.getIFilmesWSPort();
        return port.update(idFIlme, novaAvaliacao);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackView;
    private javax.swing.JButton buttonAtualizarFilme;
    private javax.swing.JLabel labelIdFilme;
    private javax.swing.JLabel labelNovaAvaliacaoFilme;
    private javax.swing.JLabel lblIfilmesLogo;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField txtFieldIdFilme;
    private javax.swing.JTextField txtFieldNovaAvaliacaoFilme;
    // End of variables declaration//GEN-END:variables

}
