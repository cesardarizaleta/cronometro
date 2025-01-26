package Classes;

public class time extends Thread {

    private boolean corriendo;
    private long tiempoInicio;

    public void iniciar() {
        corriendo = true;
        tiempoInicio = System.currentTimeMillis();
        new Thread(() -> {
            while (corriendo) {
                long tiempoTranscurrido = System.currentTimeMillis() - tiempoInicio;
                System.out.printf("\rTiempo transcurrido: %d segundos", tiempoTranscurrido / 1000);
                try {
                    Thread.sleep(1000); // Esperar 1 segundo
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
    public void detener() {
        corriendo = false;
        System.out.println("\nCronómetro detenido.");
    }

}
