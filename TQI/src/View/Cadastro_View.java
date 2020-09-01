package View;

import Controller.Cliente;
import Model.ClienteDAO;
import Controller.Login;
import Model.LoginDAO;
import Model.Validacao;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class Cadastro_View extends javax.swing.JFrame {

    Login_View tela_login;
    
    Cliente cliente = new Cliente();
    ClienteDAO clienteDAO = new ClienteDAO();
    
    Login login = new Login();
    LoginDAO loginDAO = new LoginDAO();
    
    public Cadastro_View() {
        initComponents();
        this.setLocationRelativeTo(null);
        Color Cor = new Color (245, 209, 160);
        this.getContentPane().setBackground(Cor);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cadastrar_Botao = new javax.swing.JButton();
        Voltar_Botao = new javax.swing.JButton();
        nome_cliente = new javax.swing.JTextField();
        email_cliente = new javax.swing.JTextField();
        senha_cliente = new javax.swing.JPasswordField();
        senhaconfirma_cliente = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        telefone_cliente = new javax.swing.JFormattedTextField();
        cpf_cliente = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        bairro_cliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        numero_cliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        complemento_cliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cidade_cliente = new javax.swing.JTextField();
        estado_cliente = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        jLabel1.setText("Nome:");

        jLabel2.setText("E-mail:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Senha:");

        jLabel5.setText("Confirmar Senha:");

        Cadastrar_Botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/disk.png"))); // NOI18N
        Cadastrar_Botao.setText("Cadastrar");
        Cadastrar_Botao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cadastrar_Botao.setBorderPainted(false);
        Cadastrar_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_BotaoActionPerformed(evt);
            }
        });

        Voltar_Botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/arrow_left.png"))); // NOI18N
        Voltar_Botao.setText("Voltar");
        Voltar_Botao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Voltar_Botao.setBorderPainted(false);
        Voltar_Botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar_BotaoActionPerformed(evt);
            }
        });

        email_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_clienteActionPerformed(evt);
            }
        });

        senha_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha_clienteActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF:");

        try {
            telefone_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpf_cliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel7.setText("Preencha o cadastro:");

        jLabel8.setText("Bairro:");

        jLabel9.setText("Número:");

        jLabel10.setText("Complemento:");

        jLabel11.setText("Cidade:");

        estado_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        jLabel12.setText("Estado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email_cliente)
                    .addComponent(nome_cliente)
                    .addComponent(bairro_cliente)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel12))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(Cadastrar_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(Voltar_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(senhaconfirma_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(senha_cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telefone_cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel10)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cidade_cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(numero_cliente, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(complemento_cliente)
                            .addComponent(estado_cliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltar_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(nome_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(email_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairro_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complemento_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(telefone_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(senha_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaconfirma_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cadastrar_Botao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senha_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha_clienteActionPerformed

    private void Cadastrar_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_BotaoActionPerformed
        int flag=0;
        int flag2 =0;
        int flag3 = 0;
        
        if(nome_cliente.getText().isEmpty() || email_cliente.getText().isEmpty() || cpf_cliente.getText().isEmpty() || telefone_cliente.getText().isEmpty() || senha_cliente.getText().isEmpty() || senhaconfirma_cliente.getText().isEmpty() || bairro_cliente.getText().isEmpty() || numero_cliente.getText().isEmpty() || complemento_cliente.getText().isEmpty() || cidade_cliente.getText().isEmpty() || estado_cliente.getSelectedItem().equals(" ")){
            JOptionPane.showMessageDialog(null,"Algum campo se encontra vazio!","Cadastro Cliente", JOptionPane.ERROR_MESSAGE);
        }
        else{
            cliente.setNome(nome_cliente.getText());
            
            if(Validacao.verificaEmail(email_cliente.getText()) == true){
                cliente.setEmail(email_cliente.getText());
                
                flag2 = 1;
            }
            
            cliente.setCpf(cpf_cliente.getText());
            cliente.setTelefone(telefone_cliente.getText());
            
            if(Validacao.soLetra(cidade_cliente.getText()) == true){
                String endereco = cidade_cliente.getText() + " - " + estado_cliente.getSelectedItem() + ", " + bairro_cliente.getText() + ", " + numero_cliente.getText() + ", " + complemento_cliente.getText();
                cliente.setEndereco(endereco);
                flag3=1;
            }
            else{
                JOptionPane.showMessageDialog(null,"O nome da cidade deve possuir apenas letras!","Cadastro Cliente", JOptionPane.ERROR_MESSAGE);
            }

            login.setUsuario(cpf_cliente.getText());
            
            if(flag3 == 1 && flag2 == 1 && Validacao.verificaCPF(cpf_cliente.getText()) == true){
                if(ClienteDAO.buscarId(cpf_cliente.getText()).isEmpty()){
                    String current_senha = senha_cliente.getText();
                    
                    if(Validacao.validarSenha(current_senha) == true){
                            if(verifica_senha(current_senha)==true){
                                login.setSenha(current_senha);

                                ClienteDAO.salvarCliente(cliente);
                                LoginDAO.salvarLogin(login);

                                flag=1;
                        }
                    }
                    else{
                        senha_cliente.setText("");
                        senhaconfirma_cliente.setText("");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"CPF já cadastrado!","Cadastro Cliente", JOptionPane.ERROR_MESSAGE);
                    cpf_cliente.setText("");
                }
            }

            if(flag==1){
                //limpeza das caixas
                nome_cliente.setText("");
                email_cliente.setText("");
                cpf_cliente.setText("");
                bairro_cliente.setText("");
                numero_cliente.setText("");
                complemento_cliente.setText("");
                cidade_cliente.setText("");
                estado_cliente.setSelectedItem(0);
                telefone_cliente.setText("");
                senha_cliente.setText("");
                senhaconfirma_cliente.setText("");
                
                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!");
                
                //fechar tela e abrir a de login se gravou tudo corretamente
                tela_login = new Login_View();
                tela_login.setVisible(true);
                tela_login.setState(Login_View.NORMAL);
                tela_login.setVisible(true);
                dispose();
            }   
        }     
    }//GEN-LAST:event_Cadastrar_BotaoActionPerformed

    private void Voltar_BotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar_BotaoActionPerformed
        tela_login = new Login_View();
        tela_login.setVisible(true);
        tela_login.setState(Login_View.NORMAL);
        tela_login.setVisible(true);
        dispose();
    }//GEN-LAST:event_Voltar_BotaoActionPerformed

    
    private boolean verifica_senha(String senhaC){
        //txt onde a senha a confirmar esta
        String txt_senha = senhaconfirma_cliente.getText();
        
        //verifica se a senha por parametro esta certa
        if(senhaC.equals(txt_senha)){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "A senha a se confirmar está incorreta", "Confirmação da Senha", JOptionPane.ERROR_MESSAGE);
            return false;
        }   
    }
    
    private void email_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_clienteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar_Botao;
    private javax.swing.JButton Voltar_Botao;
    private javax.swing.JTextField bairro_cliente;
    private javax.swing.JTextField cidade_cliente;
    private javax.swing.JTextField complemento_cliente;
    private javax.swing.JFormattedTextField cpf_cliente;
    private javax.swing.JTextField email_cliente;
    private javax.swing.JComboBox<String> estado_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nome_cliente;
    private javax.swing.JTextField numero_cliente;
    private javax.swing.JPasswordField senha_cliente;
    private javax.swing.JPasswordField senhaconfirma_cliente;
    private javax.swing.JFormattedTextField telefone_cliente;
    // End of variables declaration//GEN-END:variables
}
