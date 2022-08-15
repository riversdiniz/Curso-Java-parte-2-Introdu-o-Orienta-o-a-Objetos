public class TestaMetodo {
    
    public static void main(String[] args) {
        
        Conta contaUm = new Conta();
        contaUm.saldo = 100;
        contaUm.deposita(50);
        System.out.println("Valor Total é " + "R$ " + contaUm.saldo);

        boolean consegiuRetirar = contaUm.saca(20);
        System.out.println(contaUm.saldo);
        System.out.println(consegiuRetirar);

        Conta contaDois = new Conta();
        contaDois.deposita(1000);

        boolean sucessoTransferencia = contaDois.transfere(300, contaUm);
        if(sucessoTransferencia){
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("faltou dinheiro");
        }

        System.out.println(contaDois.saldo);
        System.out.println(contaUm.saldo);
    }
}
