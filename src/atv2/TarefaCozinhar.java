package atv2;

public class TarefaCozinhar implements Runnable {

    private String nomePrato;

    public TarefaCozinhar(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " -> Começando a preparar: " + nomePrato);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Tarefa interrompida!");
        }
        System.out.println(Thread.currentThread().getName() + " -> Finalizou o prato: " + nomePrato);
    }
}