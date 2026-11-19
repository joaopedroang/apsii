public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        Aparelho luzSala = new Luz("sala");
        Aparelho ventilador = new Ventilador();

        controle.pressionar(new LigarCommand(luzSala));
        controle.pressionar(new LigarCommand(ventilador));
        controle.pressionar(new DesligarCommand(luzSala));

        System.out.println("--- desfazendo ---");
        controle.desfazer();
        controle.desfazer();
        controle.desfazer();
        controle.desfazer();
    }
}