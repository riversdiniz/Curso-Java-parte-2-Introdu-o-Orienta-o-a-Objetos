public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente river = new Cliente();
        river.setNome("River Diniz");

        conta.setTitular(river);

        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Programador");
    }
}
