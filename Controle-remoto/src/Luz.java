public class Luz implements Aparelho {
    private final String local;

    public Luz(String local) {
        this.local = local;
    }

    public void ligar() {
        System.out.println("Luz da " + local + " ligada");
    }

    public void desligar() {
        System.out.println("Luz da " + local + " desligada");
    }
}