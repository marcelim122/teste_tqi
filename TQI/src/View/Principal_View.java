package View;

import Controller.Login;
import Controller.Singleton;
import java.awt.Color;

/**
 *
 * @author marce
 */
public class Principal_View extends javax.swing.JFrame {
    
    Solicitacao_View tela_solicitacao;
    Consultar_View tela_consulta;
    
    Login_View tela_login;

    public Singleton current_singleton = null;
    
    public int flag = 0;
    
    public Principal_View(Singleton singleton, int current_flag) {
        initComponents();
        Color Cor = new Color (245, 209, 160);
        this.getContentPane().setBackground(Cor);
        this.setLocationRelativeTo(null);
        current_singleton = singleton;
        flag = current_flag;
        qtd_solicitacao(flag);
    }

    private Principal_View() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Solicitar_Botao = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Consultar_Botao = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        logout_botao = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login.png"))); // NOI18N

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/money.png"))); // NOI18N
        jMenu2.setText("Solicitações de empréstimo");

        Solicitar_Botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cadastro_1.png"))); // NOI18N
        Solicitar_Botao.setText("Solicitar");
        Solicitar_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Solicitar_BotaoActionPerformed(evt);
            }
        });
        jMenu2.add(Solicitar_Botao);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/book_open.png"))); // NOI18N
        jMenu3.setText("Acompanhar Solicitações");

        Consultar_Botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/table_row_insert.png"))); // NOI18N
        Consultar_Botao.setText("Consultar");
        Consultar_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar_BotaoActionPerformed(evt);
            }
        });
        jMenu3.add(Consultar_Botao);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cancel.png"))); // NOI18N
        jMenu4.setText("Sair");

        logout_botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cancel.png"))); // NOI18N
        logout_botao.setText("Encerrar Sessão");
        logout_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_botaoActionPerformed(evt);
            }
        });
        jMenu4.add(logout_botao);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Solicitar_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Solicitar_BotaoActionPerformed
        tela_solicitacao = new Solicitacao_View(current_singleton);
        tela_solicitacao.setVisible(true);
        tela_solicitacao.setState(Solicitacao_View.NORMAL);
        tela_solicitacao.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Solicitar_BotaoActionPerformed

    private void Consultar_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar_BotaoActionPerformed
        tela_consulta = new Consultar_View(current_singleton, flag);
        tela_consulta.setVisible(true);
        tela_consulta.setState(Consultar_View.NORMAL);
        tela_consulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Consultar_BotaoActionPerformed

    private void logout_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_botaoActionPerformed
        tela_login = new Login_View();
        tela_login.setVisible(true);
        tela_login.setState(Consultar_View.NORMAL);
        tela_login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout_botaoActionPerformed

   public void qtd_solicitacao(int flag){
        if(flag==1){
            Solicitar_Botao.setEnabled(false);
        }
        else{
            Solicitar_Botao.setEnabled(true);
        }
    }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Consultar_Botao;
    private javax.swing.JMenuItem Solicitar_Botao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem logout_botao;
    // End of variables declaration//GEN-END:variables
}
