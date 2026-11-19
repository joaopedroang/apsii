public class DepositarCommand implements Command {
    private final Conta conta;
    private final double valor;

    public DepositarCommand(Conta conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    public void execute() { conta.depositar(valor); }
    public void undo()    { conta.sacar(valor); }

    public String toString() { return "deposito de R$ " + valor + " na conta de " + conta; }
}