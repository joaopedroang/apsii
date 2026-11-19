public class TransferirCommand implements Command {
    private final Command saque;
    private final Command deposito;

    public TransferirCommand(Conta origem, Conta destino, double valor) {
        this.saque = new SacarCommand(origem, valor);
        this.deposito = new DepositarCommand(destino, valor);
    }

    public void execute() {
        saque.execute();
        deposito.execute();
    }

    public void undo() {
        deposito.undo();
        saque.undo();
    }

    public String toString() {
        return "transferencia (" + saque + " / " + deposito + ")";
    }
}