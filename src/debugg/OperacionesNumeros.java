package debugg;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class OperacionesNumeros {
    private final static Logger LOGGER = Logger.getLogger(OperacionesNumeros.class.getName());

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int n = scanner.nextInt();
        OperacionesMatem o=new OperacionesMatem();
        configurarLog();
        LOGGER.info("Se calcula la suma de los "+ n+" primeros números.");
        int suma = o.calcularSuma(n);
        System.out.println("La suma de los primeros " + n + " números es: " + suma);
        LOGGER.info("La suma de los primeros " + n + " números es: " + suma);

        int[] arreglo = {3, 8, 1, 6, 4};
        LOGGER.info("Se calcula él máximo de los siguients números {3, 8, 1, 6, 4}");
        int maximo = o.encontrarMaximo(arreglo);
        System.out.println("El máximo del arreglo es: " + maximo);
        LOGGER.info("El máximo del arreglo es: " + maximo);
    }
    public static void configurarLog() throws SecurityException, IOException {

        // Creamos un manejador por consola que lo muestra todo
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        LOGGER.addHandler(consoleHandler);

        // El manejador a fichero a partir de INFO
        Handler fileTxt = new FileHandler("analizadorOperaciones.log");
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileTxt.setFormatter(simpleFormatter);
        fileTxt.setLevel(Level.INFO);
        LOGGER.addHandler(fileTxt);

        LOGGER.setLevel(Level.FINE);
    }

}