package Controller;

/**
 *
 * @author marce
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Solicitacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    protected String valor;
    protected String data;
    protected String fk_cliente;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFk_cliente() {
        return fk_cliente;
    }

    public void setFk_cliente_cpf(String fk_cliente) {
        this.fk_cliente = fk_cliente;
    } 
}
