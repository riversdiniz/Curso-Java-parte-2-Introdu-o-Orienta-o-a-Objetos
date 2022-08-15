public class TestaBanco {
    public static void main(String[] args) {
        Cliente river = new Cliente();
        river.nome = "River Diniz";
        river.cpf = "222.222.222-22";
        river.profissao = "programador";

        Conta contaDoRiver = new Conta();
        contaDoRiver.deposita(100);

        // ASSOCIO CLIENTE A CONTA RIVER
        contaDoRiver.titular = river;
        System.out.println(contaDoRiver.titular.nome);
        System.out.println(contaDoRiver.titular);
    }
}
