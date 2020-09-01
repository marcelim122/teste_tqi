package Controller;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author marce
 */

@Entity
public class Login {
    @Id
    protected String usuario;
    protected String senha;
    
    public Login(){

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
