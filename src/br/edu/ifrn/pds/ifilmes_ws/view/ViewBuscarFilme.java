package br.edu.ifrn.pds.ifilmes_ws.view;

import br.edu.ifrn.pds.ifilmes_ws.services.Filme;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ViewBuscarFilme extends javax.swing.JFrame {

    public ViewBuscarFilme() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        Filme filme = retrieveLatest();
        if (filme != null) {
            setFilmeInView(filme);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelTopo = new javax.swing.JPanel();
        buttonVoltarView = new javax.swing.JButton();
        txtFieldBarraPesquisa = new javax.swing.JTextField();
        panelFundo = new javax.swing.JPanel();
        labelTituloFilme = new javax.swing.JLabel();
        labelAnoLancamentoFilme = new javax.swing.JLabel();
        labelDuracaoFilme = new javax.swing.JLabel();
        labelAvaliacaoFilme = new javax.swing.JLabel();
        scrollPaneSinopseFilme = new javax.swing.JScrollPane();
        txtAreaSinopseFilme = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTopo.setBackground(new java.awt.Color(255, 204, 51));
        panelTopo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txtFieldBarraPesquisa.setBackground(new java.awt.Color(250, 250, 250));
        txtFieldBarraPesquisa.setBorder(null);
        txtFieldBarraPesquisa.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtFieldBarraPesquisa.setSelectionColor(new java.awt.Color(255, 204, 51));
        txtFieldBarraPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFieldBarraPesquisaKeyPressed(evt);
            }
        });
        panelTopo.add(txtFieldBarraPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 350, 20));

        getContentPane().add(panelTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        panelFundo.setBackground(new java.awt.Color(51, 51, 51));
        panelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTituloFilme.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        labelTituloFilme.setForeground(new java.awt.Color(255, 204, 51));
        labelTituloFilme.setText("Lorem ipsum dolor sit amet");
        labelTituloFilme.setToolTipText("");
        panelFundo.add(labelTituloFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 350, -1));

        labelAnoLancamentoFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelAnoLancamentoFilme.setForeground(new java.awt.Color(153, 153, 153));
        labelAnoLancamentoFilme.setText("XXXX");
        panelFundo.add(labelAnoLancamentoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        labelDuracaoFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelDuracaoFilme.setForeground(new java.awt.Color(153, 153, 153));
        labelDuracaoFilme.setText("XX min");
        panelFundo.add(labelDuracaoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        labelAvaliacaoFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelAvaliacaoFilme.setForeground(new java.awt.Color(153, 153, 153));
        labelAvaliacaoFilme.setText("0.0");
        panelFundo.add(labelAvaliacaoFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        scrollPaneSinopseFilme.setBorder(null);
        scrollPaneSinopseFilme.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtAreaSinopseFilme.setBackground(new java.awt.Color(51, 51, 51));
        txtAreaSinopseFilme.setColumns(20);
        txtAreaSinopseFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtAreaSinopseFilme.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaSinopseFilme.setLineWrap(true);
        txtAreaSinopseFilme.setRows(5);
        txtAreaSinopseFilme.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.");
        txtAreaSinopseFilme.setBorder(null);
        txtAreaSinopseFilme.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtAreaSinopseFilme.setDisabledTextColor(new java.awt.Color(250, 250, 250));
        txtAreaSinopseFilme.setEnabled(false);
        txtAreaSinopseFilme.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtAreaSinopseFilme.setSelectionColor(new java.awt.Color(255, 204, 51));
        scrollPaneSinopseFilme.setViewportView(txtAreaSinopseFilme);

        panelFundo.add(scrollPaneSinopseFilme, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, 110));

        getContentPane().add(panelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarViewActionPerformed
        this.dispose();
        new ViewMain().setVisible(true);
    }//GEN-LAST:event_buttonVoltarViewActionPerformed

    private void txtFieldBarraPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldBarraPesquisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Filme filmePesquisa = retrieve(txtFieldBarraPesquisa.getText());

            if (filmePesquisa != null) {
                setFilmeInView(filmePesquisa);
            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "Este filme não foi encontrado em nossa base de dados. :/",
                        "Erro...",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtFieldBarraPesquisaKeyPressed

    private static Filme retrieve(java.lang.String titulo) {
        br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS_Service service = new br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS_Service();
        br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS port = service.getIFilmesWSPort();
        return port.retrieve(titulo);
    }

    private static Filme retrieveLatest() {
        br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS_Service service = new br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS_Service();
        br.edu.ifrn.pds.ifilmes_ws.services.IFilmesWS port = service.getIFilmesWSPort();
        return port.retrieveLatest();
    }

    private void setFilmeInView(Filme f) {
        labelTituloFilme.setText(f.getTitulo());
        labelAnoLancamentoFilme.setText(String.valueOf(f.getAnoLancamento()));
        labelDuracaoFilme.setText(String.valueOf(f.getDuracao()) + " min");
        labelAvaliacaoFilme.setText(String.valueOf(f.getAvaliacao()));
        txtAreaSinopseFilme.setText(f.getSinopse());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonVoltarView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAnoLancamentoFilme;
    private javax.swing.JLabel labelAvaliacaoFilme;
    private javax.swing.JLabel labelDuracaoFilme;
    private javax.swing.JLabel labelTituloFilme;
    private javax.swing.JPanel panelFundo;
    private javax.swing.JPanel panelTopo;
    private javax.swing.JScrollPane scrollPaneSinopseFilme;
    private javax.swing.JTextArea txtAreaSinopseFilme;
    private javax.swing.JTextField txtFieldBarraPesquisa;
    // End of variables declaration//GEN-END:variables

}
