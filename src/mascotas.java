public class mascotas {
    public static void clasificarMascota(String tipoAnimal, int edad){
        switch (tipoAnimal){

            case "perro":
                System.out.println("Veterinario asignado (Doctor manitas)");
                if (edad > 5){
                    System.out.println("Se le recomienda vacuna adicional");
                }
                break;
            case "gato":
                System.out.println("Veterinario asignado (Doctor sapito)");
                if (edad > 5){
                    System.out.println("Se le recomienda vacuna adicional");
                }
                break;

            case "ave":
                System.out.println("Veterinario asignado (Doctor piojito)");
                break;

            default:
                System.out.println("Veterinario asignado (Doctor aguacoche)");







        }

    }


}
