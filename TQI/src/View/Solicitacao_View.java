package View;

import Controller.Singleton;
import Controller.Solicitacao;
import Model.SolicitacaoDAO;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class Solicitacao_View extends javax.swing.JFrame {

    Principal_View tela_principal;
    
    Solicitacao solicitacao = new Solicitacao();
    SolicitacaoDAO solicitacaoDAO = new SolicitacaoDAO();
    
    public Singleton current_singleton = null;
    
    public int flag = 0;
    
    public Solicitacao_View(Singleton singleton) {
        initComponents();
        Color Cor = new Color (245, 209, 160);
        this.getContentPane().setBackground(Cor);
        this.setLocationRelativeTo(null);
        current_singleton = singleton;
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    private Solicitacao_View() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        confirmar_solicitacao = new javax.swing.JButton();
        Voltar_Solicitar = new javax.swing.JButton();
        Valor_txt = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        calendario_solicitacao = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerar Solicitação");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setText("Digitar o valor a solicitar:");

        confirmar_solicitacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/disk.png"))); // NOI18N
        confirmar_solicitacao.setText("Confirmar");
        confirmar_solicitacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmar_solicitacao.setBorderPainted(false);
        confirmar_solicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar_solicitacaoActionPerformed(evt);
            }
        });

        Voltar_Solicitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/arrow_left.png"))); // NOI18N
        Voltar_Solicitar.setText("Voltar");
        Voltar_Solicitar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Voltar_Solicitar.setBorderPainted(false);
        Voltar_Solicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar_SolicitarActionPerformed(evt);
            }
        });

        Valor_txt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setText("Preencha os dados:");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel3.setText("Selecione a data atual:");

        calendario_solicitacao.setDate(new java.util.Date(1598739315000L));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Voltar_Solicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(Valor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(confirmar_solicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(calendario_solicitacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltar_Solicitar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Valor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendario_solicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmar_solicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Voltar_SolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar_SolicitarActionPerformed
        tela_principal = new Principal_View(current_singleton, flag);
        tela_principal.setVisible(true);
        tela_principal.setState(Solicitacao_View.NORMAL);
        tela_principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Voltar_SolicitarActionPerformed

    private void confirmar_solicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar_solicitacaoActionPerformed
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String data_formatada = simpleDateFormat.format(calendario_solicitacao.getDate());

        if(data_formatada.equals("") || Valor_txt.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, digite o valor desejado e selecione a data atual!", "Gerar Solicitação", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            solicitacao.setValor(Valor_txt.getText());
            
            Date data_atual = new Date();
            String data_atual_formatada = simpleDateFormat.format(data_atual);
            
            if(data_formatada.equals(data_atual_formatada)){
                solicitacao.setData(data_formatada);
                solicitacao.setFk_cliente_cpf(current_singleton.getUsuario());

                if(solicitacaoDAO.salvarSolicitacao(solicitacao)==true){
                    JOptionPane.showMessageDialog(null, "É permitido apenas uma solicitação por vez!");
                    flag=1;
                    tela_principal = new Principal_View(current_singleton, flag);
                    tela_principal.setVisible(true);
                    tela_principal.setState(Solicitacao_View.NORMAL);
                    tela_principal.setVisible(true);
                    this.dispose();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Data atual esta errada!", "Gerar Solicitação", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_confirmar_solicitacaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solicitacao_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Valor_txt;
    private javax.swing.JButton Voltar_Solicitar;
    private com.toedter.calendar.JCalendar calendario_solicitacao;
    private javax.swing.JButton confirmar_solicitacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
