public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaTres = new Conta();
        System.out.println(contaTres.saldo);

        contaTres.titular = new Cliente();
        System.out.println(contaTres.titular);

        contaTres.titular.nome = "Marcela";
        System.out.println(contaTres.titular.nome);
    }
}
