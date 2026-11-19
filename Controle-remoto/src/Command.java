public interface Command {
    void execute();
    void undo();
}

public interface Aparelho {
    void ligar();
    void desligar();
}