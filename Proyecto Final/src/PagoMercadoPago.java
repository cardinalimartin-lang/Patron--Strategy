public class PagoMercadoPago implements EstrategiaPago {
    private String correo;

    public PagoMercadoPago(String correo) {
        this.correo = correo;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Conectando con API de MercadoPago para el usuario: " + correo);
        System.out.println("Cobro de $" + monto + " aprobado.");
    }
}