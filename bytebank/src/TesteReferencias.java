public class TesteReferencias {
    public static void main(String[] args) {
        
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        Conta segundaConta = primeiraConta;

        segundaConta.saldo += 100;

        if(primeiraConta == segundaConta){
            System.out.println("São as mesmissima conta");
        }

        System.out.println("Deposito " + segundaConta.saldo);
        System.out.println("Saldo da primeira conta " + primeiraConta.saldo);
        System.out.println("saldo da segunda conta " + segundaConta.saldo);

    }
}
