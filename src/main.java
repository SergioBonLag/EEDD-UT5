import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los valores introducidos por el usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar los valores de los lados del triángulo
        System.out.print("Introduce el valor del lado a: ");
        double a = scanner.nextDouble();

        System.out.print("Introduce el valor del lado b: ");
        double b = scanner.nextDouble();

        System.out.print("Introduce el valor del lado c: ");
        double c = scanner.nextDouble();

        // Calcular el semiperímetro (s)
        double s = (a + b + c) / 2;

        // Calcular el área usando la fórmula de Herón
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Mostrar el resultado
        System.out.println("El área del triángulo es: " + area);

        // Cerrar el escáner
        scanner.close();
    }
}
