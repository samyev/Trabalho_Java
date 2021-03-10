package Trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author samyev
 */
public class Principal {

       public static ContaEspecial cep = new ContaEspecial();
       public static ContaPoupanca cp = new ContaPoupanca();
       public static ContaComum cc = new ContaComum();
    public static void main(String[] args) {
       
        JOptionPane.showMessageDialog(null, "Seja bem vindo!");
        
       new Cadastro().setVisible(true);
       
    }
}
