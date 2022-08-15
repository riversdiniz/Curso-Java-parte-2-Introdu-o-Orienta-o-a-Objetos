public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        // System.out.println("O saldo da primeira conta é: " + "R$" + primeiraConta.saldo);
        primeiraConta.saldo += 100;
        // System.out.println("O saldo da primeira conta é: " + "R$" + primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        segundaConta.agencia = 146;

        System.out.println("A primeira conta tem: " + "R$" + primeiraConta.saldo);
        System.out.println("A sgunda conta tem: " + "R$" + segundaConta.saldo);
        System.out.println("Agência da segunda conta é: " + segundaConta.agencia);

        if(primeiraConta == segundaConta){
            System.out.println("mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }

        System.out.println(primeiraConta); // referencia objeto tipo conta.
        System.out.println(segundaConta); // referencia objeto tipo conta.
    }
}
