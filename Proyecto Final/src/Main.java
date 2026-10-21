
public class Main {
    public static void main(String[] args) {
        ProcesadorDePagos procesador = new ProcesadorDePagos();
        double total = 15500.50;

        System.out.println("--- Compra con MP ---");
        // Se inyecta la estrategia de Mercado Pago
        procesador.setEstrategiaPago(new PagoMercadoPago("correo@mail.com"));
        procesador.realizarPago(total);

        System.out.println("\n--- Cambio dinámico a Tarjeta ---");
        // El cliente cambia de opinión en tiempo de ejecución
        procesador.setEstrategiaPago(new PagoTarjetaCredito("4555..."));
        procesador.realizarPago(total);

        System.out.println("\n--- Pago por Transferencia (Ejercicio Anexo) ---");
        // Se inyecta la estrategia del Anexo con descuento
        procesador.setEstrategiaPago(new PagoTransferencia());
        procesador.realizarPago(10000);
    }
}