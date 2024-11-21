import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce dos números para sumar:");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Resultado: " + sumar(a, b));
                    break;
                case 2:
                    System.out.println("Introduce dos números para restar:");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + restar(a, b));
                    break;
                case 3:
                    System.out.println("Introduce la base y el exponente para calcular la potencia:");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println("Resultado: " + potencia(a, b));
                    break;
                case 4:
                    System.out.println("Introduce dos números para dividir:");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    if (b != 0) {
                        System.out.println("Resultado: " + dividir(a, b));
                    } else {
                        System.out.println("Error: El divisor no puede ser cero.");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese un número para calcular su factorial:");
                    a = scanner.nextInt();
                    if (a >= 0) {
                        System.out.println("Resultado: " + factorial(a));
                    } else {
                        System.out.println("Error: El número debe ser positivo.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nMenú de Calculadora:");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Calcular la potencia de un número");
        System.out.println("4. Dividir dos números");
        System.out.println("5. Calcular el factorial de un número");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static double dividir(int a, int b) {
        return (double) a / b;
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
