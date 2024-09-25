package conta;

public class principal {
    public static void main(String[] args) {
        conta c1=new conta();
        //c1.saldo =300;
        c1.setSaldo(300);
        c1.sacar(100);
        System.out.println("Saldo="+c1.getSaldo());
    }

    }

