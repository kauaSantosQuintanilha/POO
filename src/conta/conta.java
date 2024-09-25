package conta;

import java.util.Scanner;

public class conta {
    private double saldo;
    public void sacar(double valor) {
     if (saldo>=valor){
        this.saldo=this.saldo-valor;

     }else {
         System.out.println("saldo insuficiente.");
     }
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double valor){
        this.saldo = valor;
    }
}