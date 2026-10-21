public class PagoTarjetaCredito implements EstrategiaPago {
    private String numeroTarjeta;

    public PagoTarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Validando fondos en tarjeta: " + numeroTarjeta);
        System.out.println("Cobro de $" + monto + " aprobado.");
    }
}