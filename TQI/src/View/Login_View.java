package View;

import Controller.Login;
import Model.LoginDAO;
import Controller.Singleton;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class Login_View extends javax.swing.JFrame {

    Singleton singleton = null;
    
    Login login = new Login();
    LoginDAO loginDAO = new LoginDAO();
    
    Principal_View tela_principal;
    Cadastro_View tela_cadastro;
    
    public Login_View() {
        initComponents();
        this.setLocationRelativeTo(null);
        Color Cor = new Color (245, 209, 160);
        this.getContentPane().setBackground(Cor);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_Botao = new javax.swing.JButton();
        Cadastro_Botao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        senha_login = new javax.swing.JPasswordField();
        cpf_login = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        Login_Botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user.png"))); // NOI18N
        Login_Botao.setText("Login");
        Login_Botao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login_Botao.setBorderPainted(false);
        Login_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_BotaoActionPerformed(evt);
            }
        });

        Cadastro_Botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/user_add.png"))); // NOI18N
        Cadastro_Botao.setText("Cadastrar-se");
        Cadastro_Botao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cadastro_Botao.setBorderPainted(false);
        Cadastro_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro_BotaoActionPerformed(evt);
            }
        });

        jLabel1.setText("CPF:");

        jLabel2.setText("Senha:");

        try {
            cpf_login.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cpf_login, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(senha_login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Login_Botao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cadastro_Botao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cadastro_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Login_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cpf_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(senha_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cadastro_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro_BotaoActionPerformed
        tela_cadastro = new Cadastro_View();
        tela_cadastro.setVisible(true);
        tela_cadastro.setState(Cadastro_View.NORMAL);
        tela_cadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_Cadastro_BotaoActionPerformed

    private void Login_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_BotaoActionPerformed
        if(senha_login.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!", "Login do Cliente", JOptionPane.INFORMATION_MESSAGE);
        } 
        else{
            singleton = Singleton.getInstancia(cpf_login.getText());

            if(cpf_login.getText().equals(singleton.getUsuario()) && senha_login.getText().equals(singleton.getSenha())){
                tela_principal = new Principal_View(singleton, 0);
                tela_principal.setVisible(true);
                tela_principal.setState(Cadastro_View.NORMAL);
                tela_principal.setVisible(true);
                dispose();
                JOptionPane.showMessageDialog(null,"Logado com sucesso, BEM-VINDO!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
                cpf_login.setText("");
                senha_login.setText("");
            }
        }  
    }//GEN-LAST:event_Login_BotaoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastro_Botao;
    private javax.swing.JButton Login_Botao;
    private javax.swing.JFormattedTextField cpf_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField senha_login;
    // End of variables declaration//GEN-END:variables
}
