public class LigarCommand implements Command {
    private final Aparelho aparelho;
    public LigarCommand(Aparelho aparelho) { this.aparelho = aparelho; }

    public void execute() { aparelho.ligar(); }
    public void undo()    { aparelho.desligar(); }
}

public class DesligarCommand implements Command {
    private final Aparelho aparelho;
    public DesligarCommand(Aparelho aparelho) { this.aparelho = aparelho; }

    public void execute() { aparelho.desligar(); }
    public void undo()    { aparelho.ligar(); }
}