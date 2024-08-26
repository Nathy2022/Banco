public class Main {
     public static void main(String[] args) {

        banco meu_banco = new banco();
        conta conta1 = new conta;
        conta conta2 = new conta;

        meu_banco = banco("Banco Central");
        conta1 = meu_banco.criar_conta("Nathalia", saldo_inicial=1000);
        conta2 = meu_banco.criar_conta("Nicole", saldo_inicial=500);
        conta1.verificar_saldo();
        conta2.verificar_saldo();

        
     }
}
