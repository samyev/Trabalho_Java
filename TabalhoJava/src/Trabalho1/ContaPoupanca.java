package Trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author samyev
 */
class ContaPoupanca extends ContaComum {
    
    private String nomePoupanca;
    private int numeropoupanca;
    private double saldopoupanca;
    private double depositar;
    private double sacar;
    private String tipoConta;
    private double tranferir;
    private double reajustar;
    public int flag;

    public String getNomePoupanca() {
        return nomePoupanca;
    }

    public void setNomePoupanca(String nomePoupanca) {
        this.nomePoupanca = nomePoupanca;
    }

    public int getNumeropoupanca() {
        return numeropoupanca;
    }

    public void setNumeropoupanca(int numeropoupanca) {
        this.numeropoupanca = numeropoupanca;
    }

    public double getSaldopoupanca() {
        return saldopoupanca;
    }

    public void setSaldopoupanca(double saldopoupanca) {
        this.saldopoupanca += saldopoupanca;
    }

    @Override
    public double getDepositar() {
        return depositar;
    }

    @Override
    public void setDepositar(double depositar) {
        flag = 0;
        if( depositar < 0)
        {
            JOptionPane.showMessageDialog(null, "Depósito nao efetuado");
        }else{
            this.saldopoupanca += depositar;
            flag = 1;
        }
    }

    @Override
    public double getSacar() {
        return sacar;
    }

    @Override
    public void setSacar(double sacar) {
        this.flag = 0;
        
        if(sacar>saldopoupanca)
        {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        }
        if(sacar < 0)
        {
            JOptionPane.showMessageDialog(null, "O saque nao pode ser efetuado!");
        }
        if(sacar < saldopoupanca && sacar >0)
        {
            this.flag = 1;
            this.saldopoupanca -= sacar;
        }
    }

    @Override
    public String getTipoConta() {
        tipoConta = "Poupança";
        return tipoConta;
    }

    @Override
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public double getTranferir() {
        return tranferir;
    }

    @Override
    public void setTranferir(double tranferir) {
        this.tranferir = tranferir;
    }

    public double getReajustar() {
        return reajustar;
    }

    public void setReajustar(double reajustar) {
        
        this.saldopoupanca += ((reajustar/100)*saldopoupanca);
    }
}
