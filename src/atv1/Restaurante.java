package atv1;

public class Restaurante {
    public static void main(String[] args) {
        System.out.println("A cozinha abriu! (Thread Principal)");

        CozinheiroExtends beto = new CozinheiroExtends("Carbonara");
        beto.setName("Beto");

        CozinheiroExtends carla = new CozinheiroExtends("Lasanha");
        carla.setName("Carla");

        beto.start();
        carla.start();

        System.out.println("Pedidos enviados para a cozinha! (Thread Principal)");
    }
}