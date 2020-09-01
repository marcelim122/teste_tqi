package Model;

import org.hibernate.Session;
import Util.hibernateUtil;
import Controller.Cliente;
import Controller.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;


/**
 *
 * @author marce
 */
public class ClienteDAO {
    public static void salvarCliente(Cliente cliente){
        Session session = null;
        
        try{
            session = hibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(cliente);
            session.getTransaction().commit();
        }catch (Throwable e) {
            System.out.println("Erro ao salvar o Cliente: " + e.getMessage());
        }finally {
            try{
                if(session.isOpen()){
                    session.close();
                }
            }catch (Throwable e) {
                System.out.println("Erro ao salvar a sessão: " + e.getMessage());
            }
        }
    }
    
    public static List<String> buscarId(String cpf){
        Session session = null;
        List<String> resultado = null;
        
        try{
            session = hibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query  = session.createQuery("from Cliente where cpf = :cpf");
            query.setParameter("cpf", cpf);
            resultado = query.list();
        }catch (Throwable e) {
            System.out.println("Erro ao salvar o Cliente: " + e.getMessage());
        }finally {
            try{
                if(session.isOpen()){
                    session.close();
                }
            }catch (Throwable e) {
                System.out.println("Erro ao salvar a sessão: " + e.getMessage());
            }
        }
        return resultado;
    }
}
