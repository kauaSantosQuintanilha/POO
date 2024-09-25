package ContaBancaria;

public class ContaBancaria {
    private double numeroConta;
    private double saldo;
    public String titular;

    public double getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
