import java.util.Scanner;

public class ReMal {
    public static void main(String[] args) throws Exception {
        Scanner Venta = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String Nombrevendedor = Venta.nextLine();

        System.out.println("Cantidad de productos vendidos:");
        int productos = Venta.nextInt();

        System.out.println("Ingrese valor producto 1:");
        double Producto1 = Venta.nextDouble();

        System.out.println("Ingrese valor producto 2:");
        double Producto2 = Venta.nextDouble();

        System.out.println("Ingrese valor producto 3:");
        double Producto3 = Venta.nextDouble();

        System.out.println("Ingrese valor producto 4:");
        double Producto4 = Venta.nextDouble();

        System.out.println("Ingrese valor producto 5:");
        double Producto5 = Venta.nextDouble();

        System.out.println("Ingrese valor producto 6:");
        double Producto6 = Venta.nextDouble();

        System.out.println("Ingrese valor producto 7:");
        double Producto7 = Venta.nextDouble();

        double Salario = 0;

        if (Producto1 >= 100000) {
            Salario = Salario + (Producto1 * 0.10);
        } else {
            Salario = Salario + (Producto1 * 0.05);
        }

        if (Producto2 >= 100000) {
            Salario = Salario + (Producto2 * 0.10);
        } else {
            Salario = Salario + (Producto2 * 0.05);
        }

        if (Producto3 >= 100000) {
            Salario = Salario + (Producto3 * 0.10);
        } else {
            Salario = Salario + (Producto3 * 0.05);
        }

        if (Producto4 >= 100000) {
            Salario = Salario + (Producto4 * 0.10);
        } else {
            Salario = Salario + (Producto4 * 0.05);
        }

        if (Producto5 >= 100000) {
            Salario = Salario + (Producto5 * 0.10);
        } else {
            Salario = Salario + (Producto5 * 0.05);
        }

        if (Producto6 >= 100000) {
            Salario = Salario + (Producto6 * 0.10);
        } else {
            Salario = Salario + (Producto6 * 0.05);
        }

        if (Producto7 >= 100000) {
            Salario = Salario + (Producto7 * 0.10);
        } else {
            Salario = Salario + (Producto7 * 0.05);
        }

        double totalventas = Producto1 + Producto2 + Producto3 + Producto4 + Producto5 + Producto6 + Producto7;
        double salariototal = (double) (Salario + 1000000);

        System.out.println("Vendedor: " + Nombrevendedor);
        System.out.println("Total ventas: " + (int) totalventas);
        System.out.println("Comisiones: " + (int) Salario);
        System.out.println("Salario total: " + (int) salariototal);
    }
}
