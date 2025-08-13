import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // primer punto
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el total de la compra: ");
        float total = sc.nextFloat();

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        System.out.print("¿Tiene membresía? (si/no): ");
        String membresia = sc.nextLine();

        double totalFinal = facturacion.calcularCompra(total, cantidad, membresia);

        System.out.println("El total a pagar es: $" + totalFinal);

        sc.close();

        // segundo punto
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese tipo de animal (perro, gato, ave): ");
        String tipoAnimal = sc.nextLine();

        System.out.print("Ingrese edad de la mascota: ");
        int edad = sc.nextInt();

        mascotas.clasificarMascota(tipoAnimal, edad);

        sc.close();


        // tercer punto
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese tipo de vehículo (auto, moto, bicicleta): ");
        String tipoVehiculo = sc.nextLine();

        System.out.print("Ingrese horas parqueado: ");
        int horas = sc.nextInt();

        parqueadero.pagarParqueo(tipoVehiculo, horas);

        sc.close();

        // ultimo punto
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tipo de prenda (camisa, pantalon, chaqueta): ");
        String tipoPrenda = sc.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();

        ropa.comprarPrenda(tipoPrenda, cantidad);

        sc.close();




    }
}