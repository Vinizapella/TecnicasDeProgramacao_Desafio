package atv2;

public class Restaurante {
    public static void main(String[] args) {
        System.out.println("A cozinha abriu! (Thread Principal)");

        TarefaCozinhar tarefaCarbonara = new TarefaCozinhar("Carbonara");
        TarefaCozinhar tarefaLasanha = new TarefaCozinhar("Lasanha");

        Thread beto = new Thread(tarefaCarbonara, "Beto");
        Thread carla = new Thread(tarefaLasanha, "Carla");

        beto.start();
        carla.start();

        System.out.println("Pedidos enviados para a cozinha! (Thread Principal)");
    }
}