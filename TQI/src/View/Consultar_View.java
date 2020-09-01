package View;

import Controller.Singleton;
import Controller.Solicitacao;
import Util.hibernateUtil;
import java.awt.Color;
import org.hibernate.Session;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marce
 */
public class Consultar_View extends javax.swing.JFrame {

    Principal_View tela_principal;
    
    public Singleton current_singleton = null;
    
    public int flag = 0;
    
    public Consultar_View(Singleton singleton, int current_flag) {
        initComponents();
        Color Cor = new Color (245, 209, 160);
        this.getContentPane().setBackground(Cor);
        this.setLocationRelativeTo(null);
        current_singleton = singleton;
        String singleton_cpf = singleton.getUsuario();
        flag = current_flag;
        
        int i=0;
        DefaultTableModel modelo = (DefaultTableModel) tabela_solicitacao.getModel();
        for(Solicitacao solicitacao: listaSolicitacao(singleton_cpf)){
            modelo.addRow(new Object[]{null,null});
            tabela_solicitacao.setValueAt(solicitacao.getFk_cliente(), i, 0);
            tabela_solicitacao.setValueAt(solicitacao.getData(), i, 1);
            tabela_solicitacao.setValueAt(solicitacao.getValor(), i, 2);
            i++;
        }
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    private Consultar_View() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela_solicitacao = new javax.swing.JTable();
        Voltar_Consultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar Solicitações");
        setResizable(false);

        tabela_solicitacao.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        tabela_solicitacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Data", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela_solicitacao);

        Voltar_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/arrow_left.png"))); // NOI18N
        Voltar_Consultar.setText("Voltar");
        Voltar_Consultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Voltar_Consultar.setBorderPainted(false);
        Voltar_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar_ConsultarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel1.setText("Todas as solicitações:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Voltar_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Voltar_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Voltar_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar_ConsultarActionPerformed
        tela_principal = new Principal_View(current_singleton, flag);
        tela_principal.setVisible(true);
        tela_principal.setState(Solicitacao_View.NORMAL);
        tela_principal.setVisible(true);
        this.dispose();
        
        tela_principal.qtd_solicitacao(flag);
    }//GEN-LAST:event_Voltar_ConsultarActionPerformed

    public List<Solicitacao> listaSolicitacao(String fk_cliente){
        Session session=null;
        session = hibernateUtil.getSessionFactory().openSession();
        List<Solicitacao> lista = null;
            
        try {
            lista = session.createQuery("from Solicitacao where fk_cliente='" + fk_cliente + "'").list();
        } catch (Throwable e){
            System.out.println("Erro ao recuperar as solicitações. Mensagem " + e.getMessage());
        }finally {
            try {
                if(session.isOpen()){
                    session.close();
                }
            } catch (Throwable e){
                System.out.println("Erro ao fechar a sessão. Mensagem: " + e.getMessage());
            }    
        }
        return lista;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar_Consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela_solicitacao;
    // End of variables declaration//GEN-END:variables
}
