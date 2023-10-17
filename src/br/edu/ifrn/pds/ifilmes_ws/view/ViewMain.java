package br.edu.ifrn.pds.ifilmes_ws.view;

public class ViewMain extends javax.swing.JFrame {

    public ViewMain() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFundo1 = new javax.swing.JPanel();
        buttonBuscarFilme = new javax.swing.JButton();
        buttonCadastrarFilme = new javax.swing.JButton();
        buttonAtualizarAvaliacao = new javax.swing.JButton();
        buttonRemoverDoCatalogo = new javax.swing.JButton();
        labelDescricao = new javax.swing.JLabel();
        panelFundo2 = new javax.swing.JPanel();
        labelNomeApp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFundo1.setBackground(new java.awt.Color(51, 51, 51));
        panelFundo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonBuscarFilme.setBackground(new java.awt.Color(255, 204, 51));
        buttonBuscarFilme.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        buttonBuscarFilme.setText("Buscar Filme");
        buttonBuscarFilme.setBorder(null);
        buttonBuscarFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBuscarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarFilmeActionPerformed(evt);
            }
        });
        panelFundo1.add(buttonBuscarFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 145, 25));

        buttonCadastrarFilme.setBackground(new java.awt.Color(255, 204, 51));
        buttonCadastrarFilme.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        buttonCadastrarFilme.setText("Cadastrar Filme");
        buttonCadastrarFilme.setBorder(null);
        buttonCadastrarFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCadastrarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFilmeActionPerformed(evt);
            }
        });
        panelFundo1.add(buttonCadastrarFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 145, 25));

        buttonAtualizarAvaliacao.setBackground(new java.awt.Color(255, 204, 51));
        buttonAtualizarAvaliacao.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        buttonAtualizarAvaliacao.setText("Atualizar Avaliação");
        buttonAtualizarAvaliacao.setBorder(null);
        buttonAtualizarAvaliacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAtualizarAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarAvaliacaoActionPerformed(evt);
            }
        });
        panelFundo1.add(buttonAtualizarAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 145, 25));

        buttonRemoverDoCatalogo.setBackground(new java.awt.Color(255, 204, 51));
        buttonRemoverDoCatalogo.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        buttonRemoverDoCatalogo.setText("Remover do Catálogo");
        buttonRemoverDoCatalogo.setBorder(null);
        buttonRemoverDoCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRemoverDoCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverDoCatalogoActionPerformed(evt);
            }
        });
        panelFundo1.add(buttonRemoverDoCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 145, 25));

        labelDescricao.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        labelDescricao.setForeground(new java.awt.Color(102, 102, 102));
        labelDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDescricao.setText("IFilmes Produções");
        panelFundo1.add(labelDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, -1));

        getContentPane().add(panelFundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 300));

        panelFundo2.setBackground(new java.awt.Color(255, 204, 51));
        panelFundo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNomeApp.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 55)); // NOI18N
        labelNomeApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeApp.setText("IFilmes");
        panelFundo2.add(labelNomeApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 60));

        getContentPane().add(panelFundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 200, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBuscarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarFilmeActionPerformed
        this.dispose();
        new ViewBuscarFilme().setVisible(true);
    }//GEN-LAST:event_buttonBuscarFilmeActionPerformed

    private void buttonCadastrarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarFilmeActionPerformed
        this.dispose();
        new ViewCadastrarFilme().setVisible(true);
    }//GEN-LAST:event_buttonCadastrarFilmeActionPerformed

    private void buttonAtualizarAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarAvaliacaoActionPerformed
        this.dispose();
        new ViewAtualizarAvaliacao().setVisible(true);
    }//GEN-LAST:event_buttonAtualizarAvaliacaoActionPerformed

    private void buttonRemoverDoCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverDoCatalogoActionPerformed
        this.dispose();
        new ViewRemoverDoCatalogo().setVisible(true);
    }//GEN-LAST:event_buttonRemoverDoCatalogoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtualizarAvaliacao;
    private javax.swing.JButton buttonBuscarFilme;
    private javax.swing.JButton buttonCadastrarFilme;
    private javax.swing.JButton buttonRemoverDoCatalogo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelNomeApp;
    private javax.swing.JPanel panelFundo1;
    private javax.swing.JPanel panelFundo2;
    // End of variables declaration//GEN-END:variables
}
