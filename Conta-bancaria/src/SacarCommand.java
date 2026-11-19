public class SacarCommand implements Command {
    private final Conta conta;
    private final double valor;

    public SacarCommand(Conta conta, double valor) {
        this.conta = conta;
        this.valor = valor;
    }

    public void execute() { conta.sacar(valor); }
    public void undo()    { conta.depositar(valor); }

    public String toString() { return "saque de R$ " + valor + " na conta de " + conta; }
}