public class PagoTransferencia implements EstrategiaPago {
    @Override
    public void procesarPago(double monto) {
        double montoFinal = monto * 0.90;
        System.out.println("Aplicando descuento bancario...");
        System.out.println("A pagar: $" + montoFinal);
    }
}