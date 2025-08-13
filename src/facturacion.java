public class facturacion {
    public static double calcularCompra(float total, int cantidad, String membresia ){
        if (membresia.equalsIgnoreCase("si")) {
            total *= 0.9;
            if (cantidad > 10) {
                total *= 0.95;
            }
        } else if (cantidad > 10) {
            total *= 0.95;
        }
        return total;

    }

}
