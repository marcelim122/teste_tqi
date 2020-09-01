/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Util.hibernateUtil;
import org.hibernate.Session;
import Controller.Login;
import Controller.Login;

/**
 *
 * @author marce
 */
public class LoginDAO {
    public static void salvarLogin(Login login){
        Session session = null;
        
        try{
            session = hibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(login);
            session.getTransaction().commit();
        }catch (Throwable e) {
            System.out.println("Erro ao salvar o Login: " + e.getMessage());
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
    
    public static Login getByCpf(String usuario){
        Login login =  null;
        Session session = null;

        try {
            session = hibernateUtil.getSessionFactory().openSession();
            login = (Login) session.get(Login.class, usuario);
        } catch (Throwable e){
                System.out.println("Erro ao recuperar a pessoa. Mensagem " + e.getMessage());
        }finally {
            try {
                if(session.isOpen()){
                    session.close();
                }
            } catch (Throwable e){
                System.out.println("Erro ao fechar a sessão. Mensagem: " + e.getMessage());
            }    
        }
        return login;
    }
}
