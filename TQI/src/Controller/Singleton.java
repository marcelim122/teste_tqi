package Controller;

import Model.LoginDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class Singleton extends Login{
    private static Singleton instancia = null;

    private Singleton(){}
    
    public static Singleton getInstancia(String user){
        
        if (instancia == null) {
            
            try{
                Login l = LoginDAO.getByCpf(user);

                if(l.getUsuario() == null || l.getSenha() == null){
                    JOptionPane.showMessageDialog(null, "Usuário não cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    instancia = new Singleton();
                    instancia.setUsuario(l.getUsuario());
                    instancia.setSenha(l.getSenha());
                }    
            } catch (NullPointerException e){
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
             
        }
        
        return instancia;
    }
}
