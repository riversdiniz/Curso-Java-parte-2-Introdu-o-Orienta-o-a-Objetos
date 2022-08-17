public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente river = new Cliente();
        river.setNome("River Diniz");

        conta.setTitular(river);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());

        //agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println(titularDaConta);
        System.out.println(river);
        System.out.println(conta.getTitular());
    }
}
