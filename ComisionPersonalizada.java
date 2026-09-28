public class ComisionPersonalizada implements EstrategiaComision {
    private static final String PRIMER_NOMBRE = "José";

    @Override
    public double calcularComision(double montoVenta) {
        int n = PRIMER_NOMBRE.length();
        return montoVenta * (5 + n) / 100.0;
    }
}