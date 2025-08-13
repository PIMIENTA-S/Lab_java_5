public class ropa {
    public static void comprarPrenda(String tipoPrenda,int cantidad){

        switch (tipoPrenda){
            case "camisa":
                float precio = 12000;
                if (cantidad > 5){
                    System.out.println("El total a pagar es de: " + ((precio * cantidad)*0.85));
                }else{
                    System.out.println("El total a pagar es de: " + (precio*cantidad));
                }
                break;
            case "pantalon":
                float precioP = 80000;
                if (cantidad > 5){
                    System.out.println("El total a pagar es de: " + ((precioP * cantidad)*0.85));
                }else{
                    System.out.println("El total a pagar es de: " + (precioP*cantidad));
                }
                break;

            case "chaqueta":
                float precioC = 95000;
                if (cantidad > 5){
                    System.out.println("El total a pagar es de: " + ((precioC * cantidad)*0.85));
                }else{
                    System.out.println("El total a pagar es de: " + (precioC*cantidad));
                }
                break;
        }

    }

}
