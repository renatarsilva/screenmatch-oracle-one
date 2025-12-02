package contaBancaria;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumeroConta(123);
        conta1.setSaldo(1000);
        conta1.titular = "Maki";

        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: R$" + conta1.getSaldo());
        System.out.println("Titular: " + conta1.titular);



    }
}
