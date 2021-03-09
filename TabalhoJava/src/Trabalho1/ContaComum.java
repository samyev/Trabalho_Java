/*
 *UNIVERSIDADE FEDERAL DO CEARÁ – UFC SOBRAL
 *TÉCNICAS DE PROGRAMAÇÃO – 2020.2 – PROF. WENDLEY
 *TRABALHO PRÁTICO INDIVIDUAL 01 - JAVA
 * Samyelle Sales - 489202
 */
package Trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author samyev
 */
class ContaComum {
    private String nomeContaC;
    private int numeroContaC;
    private double saldoContaC;
    private double depositar;
    private double sacar;
    private String tipoConta;
    private double tranferencia;
    public int flag;

    public String getNomeCorrente() {
        return nomeContaC;
    }

    public void setNomeCorrente(String nomeCorrente) {
        this.nomeContaC = nomeCorrente;
    }

    public int getNumeroCorrente() {
        return numeroContaC;
    }

    public void setNumeroCorrente(int numeroCorrente) {
        this.numeroContaC = numeroCorrente;
    }

    public double getSaldoCorrente() {
        return saldoContaC;
    }

    public void setSaldoCorrente(double saldoCorrente) {
        this.saldoContaC += saldoCorrente;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.flag = 0;
        
        if( depositar < 0)
        {
            JOptionPane.showMessageDialog(null, "Depósito não efetuado");
            
        }else{
            this.saldoContaC += depositar;
            this.flag = 1;
        }
        
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        
        flag = 0;
        
        if(sacar > saldoContaC)
        {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
        }
        else if(sacar <= 0)
        {
            JOptionPane.showMessageDialog(null, "Desculpe o saque não pode ser efetuado!");
        }
        else
        {
            flag = 1;
            this.saldoContaC = this.saldoContaC - sacar;
        }
        
    }

    public String getTipoConta() {
        tipoConta = "Comum";
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        String tipoConta1 = this.tipoConta;
        
    }

    public double getTranferir() {
        return tranferencia;
    }

    public void setTranferir(double tranferir) {
        this.tranferencia = tranferir;
    }
    
    
    
    
}
