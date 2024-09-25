package atividades;

public class contaCorrente {

    double saldo;
    String titular;
    double limite;
    double valor;

    public  void sacar(){

       if (valor<=saldo && valor<=limite){
           System.out.println("saque  autorizado");



           } else if (valor<=saldo && valor<=limite)
           System.out.println("saque não autorizado");
           {

       }
    }

        }


