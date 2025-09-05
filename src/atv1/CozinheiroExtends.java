package atv1;

class CozinheiroExtends extends Thread {

    private String nomePrato;

    public CozinheiroExtends(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " -> Começando a preparar: " + nomePrato);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Cozinheiro interrompido!");
        }
        System.out.println(Thread.currentThread().getName() + " -> Finalizou o prato: " + nomePrato);
    }
}
