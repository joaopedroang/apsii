public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        Conta joao = new ContaBancaria("Joao", 100);
        Conta maria = new ContaBancaria("Maria", 50);

        caixa.executar(new DepositarCommand(joao, 200));
        caixa.executar(new SacarCommand(joao, 80));
        caixa.executar(new TransferirCommand(joao, maria, 120));
        caixa.executar(new SacarCommand(maria, 1000)); // falha, nao entra no historico

        System.out.println("Saldo Joao: " + joao.getSaldo() + " | Maria: " + maria.getSaldo());

        System.out.println("--- desfazendo ---");
        caixa.desfazer();
        caixa.desfazer();
        caixa.desfazer();
        caixa.desfazer(); // historico vazio

        System.out.println("Saldo Joao: " + joao.getSaldo() + " | Maria: " + maria.getSaldo());
    }
}