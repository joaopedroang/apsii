import java.util.ArrayDeque;
import java.util.Deque;

public class ControleRemoto {
    private final Deque<Command> historico = new ArrayDeque<>();

    public void pressionar(Command comando) {
        comando.execute();
        historico.push(comando);
    }

    public void desfazer() {
        if (historico.isEmpty()) {
            System.out.println("Nada para desfazer");
            return;
        }
        historico.pop().undo();
    }
}