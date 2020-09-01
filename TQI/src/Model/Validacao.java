package Model;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author marce
 */
public class Validacao {
    public static boolean verificaCPF(String cpf){
        // cpf invalido com sequencia de numeros iguais
        if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999")){
            JOptionPane.showMessageDialog(null,"CPF invalido!","Cadastro Cliente", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        //dig10 e dig11 = x, y
        char x, y;
        int soma, i, resto, numero, peso;

        try {
        // calculando o 1o digito
            soma = 0;
            peso = 10;
            
            // converte o caractere do CPF em um numero
            for (i=0; i<9; i++) {
            numero = (int)(cpf.charAt(i) - 48);
            soma = soma + (numero * peso);
            peso = peso - 1;
            }

            resto = 11 - (soma % 11);
            if ((resto == 10) || (resto == 11)){
                x = '0';
            }
            // converte no converte no caracter do numero
            else{
                x = (char)(resto + 48);
            } 

        //calculando o 2o digito
            soma = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                numero = (int)(cpf.charAt(i) - 48);
                soma = soma + (numero * peso);
                peso = peso - 1;
            }

            resto = 11 - (soma % 11);
            if ((resto == 10) || (resto == 11)){
                y = '0';
            }
            else{
                y = (char)(resto + 48);
            }

        //verifica se o que foi calculado é igual ao que foi digitado
            if ((x == cpf.charAt(9)) && (y == cpf.charAt(10))){
                return true;
            }        
            else{
                JOptionPane.showMessageDialog(null,"CPF invalido!","Cadastro Cliente", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null,"E-mail invalido!","Cadastro Cliente", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static boolean verificaEmail(String email){
        if (email != null && email.length() > 0){
            String verificacao = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            
            Pattern pattern = Pattern.compile(verificacao, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            
            if (matcher.matches()) {
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null,"E-mail invalido!","Cadastro Cliente", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"E-mail invalido!","Cadastro Cliente", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static boolean validarSenha(String senha){
        boolean numero = false;
        boolean maiuscula = false;
        boolean minuscula = false;
        boolean especial = false;
        
        if (senha.length() < 8){
            JOptionPane.showMessageDialog(null,"Senha invalida, possui menos de 8 dígitos!", "Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        else{
            for (char x : senha.toCharArray()) {
                if (x >= '0' && x <= '9') {
                    numero = true;
                }
                if (x >= 'A' && x <= 'Z') {
                    maiuscula = true;
                }
                if (x >= 'a' && x <= 'z') {
                    minuscula = true;
                }
                if (x == '!' || x == '@' || x == '#' || x == '$' || x == '%' || x == '&' || x == '*'){
                    especial = true;
                }
            }
            
            if(numero == false){
                JOptionPane.showMessageDialog(null,"Senha invalida, insira números!", "Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE);
            }
            if(maiuscula == false){
                JOptionPane.showMessageDialog(null,"Senha invalida, insira letras maiúsculas!", "Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE);
            }
            if(minuscula == false){
                JOptionPane.showMessageDialog(null,"Senha invalida, insira letras minúsuclas!", "Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE);
            }
            if(especial == false){
                JOptionPane.showMessageDialog(null,"Senha invalida, insira caracteres especiais!", "Cadastro Cliente", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(numero == true && maiuscula == true && minuscula == true && especial == true){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean soLetra(String x){ 
        try{
            for(int i=0; i<=x.length(); i++ ){
                if(Character.isLetter(x.charAt(i)) == false){
                    return false;
                }
            }
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("Mensagem de erro: "+ e.getMessage());
        }

        return true;
    }
}
