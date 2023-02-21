import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int celdas;
        double cantidad, resp, potencia;


        System.out.println("Bienvenido a la app localidades y dirreecciones de memoria");

        System.out.print("Ingrese cantidad de bits en memoria: ");
        cantidad = leer.nextFloat();
        System.out.print("Ingrese la potencia de esa cantidad: ");
        potencia = leer.nextDouble();
        System.out.print("Ingrese la cantidad de celdas: ");
        celdas = leer.nextInt();

        resp = cantidad * Math.pow(10, potencia) / celdas ;

        System.out.println("Las localidades de la memoria son: " +resp);

    }
}