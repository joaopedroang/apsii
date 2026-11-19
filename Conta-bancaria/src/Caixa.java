import java.util.ArrayDeque;
import java.util.Deque;

public class Caixa {
    private final Deque<Command> historico = new ArrayDeque<>();

    public void executar(Command comando) {
        try {
            comando.execute();
            historico.push(comando);
            System.out.println("Executado: " + comando);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Falhou: " + comando + " (" + e.getMessage() + ")");
        }
    }

    public void desfazer() {
        if (historico.isEmpty()) {
            System.out.println("Nada para desfazer");
            return;
        }
        Command comando = historico.pop();
        comando.undo();
        System.out.println("Desfeito: " + comando);
    }
}