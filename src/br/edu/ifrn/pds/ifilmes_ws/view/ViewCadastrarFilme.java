package br.edu.ifrn.pds.ifilmes_ws.view;

import br.edu.ifrn.pds.ifilmes_ws.services.Filme;
import javax.swing.JOptionPane;

public class ViewCadastrarFilme extends javax.swing.JFrame {

    public ViewCadastrarFilme() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTopo = new javax.swing.JPanel();
        labelNomeApp = new javax.swing.JLabel();
        buttonVoltarView = new javax.swing.JButton();
        panelFundo = new javax.swing.JPanel();
        labelTituloFilme = new javax.swing.JLabel();
        labelDuracaoFilme = new javax.swing.JLabel();
        labelAnoLancamentoFilme = new javax.swing.JLabel();
        labelAvaliacaoFilme = new javax.swing.JLabel();
        labelSinopseFilme = new javax.swing.JLabel();
        txtFieldTituloFilme = new javax.swing.JTextField();
        txtFieldDuracaoFilme = new javax.swing.JTextField();
        txtFieldAnoLancamentoFilme = new javax.swing.JTextField();
        txtFieldAvaliacaoFilme = new javax.swing.JTextField();
        scrollPaneSinopseFilme = new javax.swing.JScrollPane();
        txtAreaSinopseFilme = new javax.swing.JTextArea();
        buttonCadastrarFilme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTopo.setBackground(new java.awt.Color(255, 204, 51));
        panelTopo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNomeApp.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 16)); // NOI18N
        labelNomeApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeApp.setText("IFilmes");
        panelTopo.add(labelNomeApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 360, 20));

        buttonVoltarView.setBackground(new java.awt.Color(255, 204, 51));
        buttonVoltarView.setForeground(new java.awt.Color(255, 255, 255));
        buttonVoltarView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrn/pds/ifilmes_ws/view/resourcers/icon_back_arrow.png"))); // NOI18N
        buttonVoltarView.setBorder(null);
        buttonVoltarView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVoltarView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarViewActionPerformed(evt);
            }
        });
        panelTopo.add(buttonVoltarView, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, -1));

        getContentPane().add(panelTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        panelFundo.setBackground(new java.awt.Color(51, 51, 51));
        panelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTituloFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelTituloFilme.setForeground(new java.awt.Color(204, 204, 204));
        labelTituloFilme.setText("Título: *");
        panelFundo.add(labelTituloFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, -1));

        labelDuracaoFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDuracaoFilme.setForeground(new java.awt.Color(204, 204, 204));
        labelDuracaoFilme.setText("Duração (min): *");
        panelFundo.add(labelDuracaoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        labelAnoLancamentoFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelAnoLancamentoFilme.setForeground(new java.awt.Color(204, 204, 204));
        labelAnoLancamentoFilme.setText("Ano lançamento: *");
        panelFundo.add(labelAnoLancamentoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 60, -1, -1));

        labelAvaliacaoFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelAvaliacaoFilme.setForeground(new java.awt.Color(204, 204, 204));
        labelAvaliacaoFilme.setText("Avaliação: *");
        panelFundo.add(labelAvaliacaoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        labelSinopseFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelSinopseFilme.setForeground(new java.awt.Color(204, 204, 204));
        labelSinopseFilme.setText("Sinopse: *");
        panelFundo.add(labelSinopseFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtFieldTituloFilme.setBackground(new java.awt.Color(65, 65, 65));
        txtFieldTituloFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFieldTituloFilme.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldTituloFilme.setText("Lorem ipsum dolor sit amet");
        txtFieldTituloFilme.setBorder(null);
        txtFieldTituloFilme.setCaretColor(new java.awt.Color(255, 204, 51));
        txtFieldTituloFilme.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtFieldTituloFilme.setSelectionColor(new java.awt.Color(255, 204, 51));
        panelFundo.add(txtFieldTituloFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 360, 20));

        txtFieldDuracaoFilme.setBackground(new java.awt.Color(65, 65, 65));
        txtFieldDuracaoFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFieldDuracaoFilme.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldDuracaoFilme.setText("90");
        txtFieldDuracaoFilme.setBorder(null);
        txtFieldDuracaoFilme.setCaretColor(new java.awt.Color(255, 204, 51));
        txtFieldDuracaoFilme.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtFieldDuracaoFilme.setSelectionColor(new java.awt.Color(255, 204, 51));
        panelFundo.add(txtFieldDuracaoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 20));

        txtFieldAnoLancamentoFilme.setBackground(new java.awt.Color(65, 65, 65));
        txtFieldAnoLancamentoFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFieldAnoLancamentoFilme.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldAnoLancamentoFilme.setText("2023");
        txtFieldAnoLancamentoFilme.setBorder(null);
        txtFieldAnoLancamentoFilme.setCaretColor(new java.awt.Color(255, 204, 51));
        txtFieldAnoLancamentoFilme.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtFieldAnoLancamentoFilme.setSelectionColor(new java.awt.Color(255, 204, 51));
        panelFundo.add(txtFieldAnoLancamentoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 80, 110, 20));

        txtFieldAvaliacaoFilme.setBackground(new java.awt.Color(65, 65, 65));
        txtFieldAvaliacaoFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFieldAvaliacaoFilme.setForeground(new java.awt.Color(255, 255, 255));
        txtFieldAvaliacaoFilme.setText("0.0");
        txtFieldAvaliacaoFilme.setBorder(null);
        txtFieldAvaliacaoFilme.setCaretColor(new java.awt.Color(255, 204, 51));
        txtFieldAvaliacaoFilme.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtFieldAvaliacaoFilme.setSelectionColor(new java.awt.Color(255, 204, 51));
        panelFundo.add(txtFieldAvaliacaoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 110, 20));

        scrollPaneSinopseFilme.setBackground(new java.awt.Color(65, 65, 65));
        scrollPaneSinopseFilme.setBorder(null);

        txtAreaSinopseFilme.setBackground(new java.awt.Color(65, 65, 65));
        txtAreaSinopseFilme.setColumns(20);
        txtAreaSinopseFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAreaSinopseFilme.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaSinopseFilme.setLineWrap(true);
        txtAreaSinopseFilme.setRows(5);
        txtAreaSinopseFilme.setWrapStyleWord(true);
        txtAreaSinopseFilme.setBorder(null);
        txtAreaSinopseFilme.setCaretColor(new java.awt.Color(255, 204, 51));
        txtAreaSinopseFilme.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtAreaSinopseFilme.setSelectionColor(new java.awt.Color(255, 204, 51));
        scrollPaneSinopseFilme.setViewportView(txtAreaSinopseFilme);

        panelFundo.add(scrollPaneSinopseFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, -1));

        buttonCadastrarFilme.setBackground(new java.awt.Color(255, 204, 51));
        buttonCadastrarFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonCadastrarFilme.setText("Cadastrar");
        buttonCadastrarFilme.setBorder(null);
        buttonCadastrarFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCadastrarFilme.setFocusTraversalPolicyProvider(true);
        buttonCadastrarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarFilmeActionPerformed(evt);
            }
        });
        panelFundo.add(buttonCadastrarFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 80, 20));

        getContentPane().add(panelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCadastrarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarFilmeActionPerformed
        String titulo = txtFieldTituloFilme.getText();
        String sinopse = txtAreaSinopseFilme.getText();
        int duracao = Integer.parseInt(txtFieldDuracaoFilme.getText());
        int anoLancamento = Integer.parseInt(txtFieldAnoLancamentoFilme.getText());
        double avaliacao = Double.parseDouble(txtFieldAvaliacaoFilme.getText());

        Filme filme = new Filme();
        filme.setTitulo(titulo);
        filme.setSinopse(sinopse);
        filme.setDuracao(duracao);
        filme.setAnoLancamento(anoLancamento);
        filme.setAvaliacao(avaliacao);

        boolean result = create(filme);

        if (result) {
            JOptionPane.showMessageDialog(rootPane,
                    "Este filme foi cadastrado com sucesso.",
                    "Sucesso!",
                    JOptionPane.PLAIN_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(rootPane,
                    "Erro ao tentar cadastrar filme.",
                    "Erro...",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonCadastrarFilmeActionPerformed

    private void buttonVoltarViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarViewActionPerformed
        this.dispose();
        new ViewMain().setVisible(true);
    }//GEN-LAST:event_buttonVoltarViewActionPerformed

    private static boolean create(br.edu.ifrn.pds.ifilmes_ws.services.Filme filme) {
        br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS_Service service = new br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS_Service();
        br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS port = service.getIFilmesWSPort();
        return port.create(filme);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCadastrarFilme;
    private javax.swing.JButton buttonVoltarView;
    private javax.swing.JLabel labelAnoLancamentoFilme;
    private javax.swing.JLabel labelAvaliacaoFilme;
    private javax.swing.JLabel labelDuracaoFilme;
    private javax.swing.JLabel labelNomeApp;
    private javax.swing.JLabel labelSinopseFilme;
    private javax.swing.JLabel labelTituloFilme;
    private javax.swing.JPanel panelFundo;
    private javax.swing.JPanel panelTopo;
    private javax.swing.JScrollPane scrollPaneSinopseFilme;
    private javax.swing.JTextArea txtAreaSinopseFilme;
    private javax.swing.JTextField txtFieldAnoLancamentoFilme;
    private javax.swing.JTextField txtFieldAvaliacaoFilme;
    private javax.swing.JTextField txtFieldDuracaoFilme;
    private javax.swing.JTextField txtFieldTituloFilme;
    // End of variables declaration//GEN-END:variables

}
