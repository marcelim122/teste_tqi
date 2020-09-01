package Model;

import Util.hibernateUtil;
import org.hibernate.Session;
import Controller.Solicitacao;
import Controller.Solicitacao;
import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class SolicitacaoDAO {
    public static boolean salvarSolicitacao(Solicitacao solicitacao){
        Session session = null;
        
        try{
            session = hibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(solicitacao);
            JOptionPane.showMessageDialog(null, "Solicitação realizada com sucesso");
            session.getTransaction().commit();
            return true;
        }catch (Throwable e) {
            System.out.println("Erro ao salvar a Solicitação: " + e.getMessage());
            return false;
        }finally {
            try{
                if(session.isOpen()){
                    session.close();
                }
            }catch (Throwable e) {
            System.out.println("Erro ao salvar a sessão.Mensagem: " + e.getMessage());
            }
        }
    }
}
