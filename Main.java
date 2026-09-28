public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("José", 2000, new ComisionPersonalizada());
        v.mostrarDetalle();
    }
}