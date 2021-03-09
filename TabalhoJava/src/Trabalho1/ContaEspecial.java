/*
 *UNIVERSIDADE FEDERAL DO CEARÁ – UFC SOBRAL
 *TÉCNICAS DE PROGRAMAÇÃO – 2020.2 – PROF. WENDLEY
 *TRABALHO PRÁTICO INDIVIDUAL 01 - JAVA
 * Samyelle Sales - 429802
 */
package Trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author samyev
 */
class ContaEspecial extends ContaComum {
    
    private String nomeContaE;
    private int numeroContaE;
    private double saldoContaE;
    private double depositar;
    private double sacar;
    private String tipoConta;
    private double transferencia;
    private double limite;
    private double descontar; 
    public static int flag;

    public double getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public double getDescontar() {
        return descontar;
    }

    public void setDescontar(double descontar) {
        this.descontar = descontar;
    }

    public String getNomeEspecial() {
        return nomeContaE;
    }

    public void setNomeEspecial(String nomeEspecial) {
        this.nomeContaE = nomeEspecial;
    }

    public int getNumeroEspecial() {
        return numeroContaE;
    }

    public void setNumeroEspecial(int numeroEspecial) {
        this.numeroContaE = numeroEspecial;
    }

    public double getSaldoEspecial() {
        return saldoContaE;
    }

    public void setSaldoEspecial(double saldoEspecial) {
        this.saldoContaE += saldoEspecial;
    }

    @Override
    public double getDepositar() {
        return depositar;
    }

    @Override
    public void setDepositar(double depositar) {
        this.flag = 0;
        if( depositar < 0)
        {
            JOptionPane.showMessageDialog(null, "Depósito nao efetuado");
        }else{
            this.saldoContaE += depositar;
            this.flag = 1;
        }
    }

    @Override
    public double getSacar() {
        return sacar;
    }

    @Override
    public void setSacar(double sacar) {
        double aux;
        
        this.flag = 0;
        if(sacar < 0)
        {
            
            JOptionPane.showMessageDialog(null, "O saque nao pode ser efetuado!");
            
        }
        if(sacar > (saldoContaE + limite))
        {
            
            JOptionPane.showMessageDialog(null, "O saque nao pode ser efetuado!");
            
        }
        else if(sacar <= saldoContaE && sacar > 0)
        {
            
            saldoContaE -= sacar;
            this.flag=1;
            
        }else
        {
            aux = sacar - saldoContaE;
            limite -= aux;
            saldoContaE += aux;
            saldoContaE -= sacar;
            limite += (limite*(this.descontar/100));
            saldoContaE = limite*(-1);
            this.flag=1;
            
        }
   
    }

    @Override
    public String getTipoConta() {
        tipoConta = "Especial";
        return tipoConta;
    }

    @Override
    public void setTipoConta(String tipoConta) {
        String tipoConta1 = this.tipoConta;
    }

    @Override
    public double getTranferir() {
        return transferencia;
    }

    @Override
    public void setTranferir(double tranferir) {
        this.transferencia = tranferir;
    }
    
}
