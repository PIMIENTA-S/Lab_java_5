public class parqueadero {
    public static void pagarParqueo(String tipoVehiculo, int horaLlegada){
        float total = horaLlegada * 2350;
        switch (tipoVehiculo){
            case "auto":
                total = horaLlegada * 4350;
                if (horaLlegada > 20){
                    System.out.println("el total a pagar es de: " + (total + (total * 0.2)));
                }else{
                    System.out.println("El total es de: " + total);
                }
                break;
            case "moto":
                total = horaLlegada * 3350;
                if (horaLlegada > 20){
                    System.out.println("el total a pagar es de: " + (total + (total * 0.2)));
                }else{
                    System.out.println("El total es de: " + total);
                }
                break;

            case "bicicleta":
                total = horaLlegada * 1350;
                if (horaLlegada > 20){
                    System.out.println("el total a pagar es de: " + (total + (total * 0.2)));
                }else{
                    System.out.println("El total es de: " + total);
                }
                break;

        }
    }
}
