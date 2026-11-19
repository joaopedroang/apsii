public class DesligarCommand implements Command {
    private final Aparelho aparelho;

    public DesligarCommand(Aparelho aparelho) {
        this.aparelho = aparelho;
    }

    public void execute() {
        aparelho.desligar();
    }

    public void undo() {
        aparelho.ligar();
    }
}