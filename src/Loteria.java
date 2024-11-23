import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Loteria {
    public static void main (String[] args) {
        System.out.println("""
                Bienvenido a la Lotería.
                Por favor elige una opción:
                1- BonoLoto.
                2- Lotería.
                3- Salir.
                Elige Opción, por favor:
                """);

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        boolean menu = true;

        switch (a) {
                case 1:
                    bonoLoto();
                    break;
                case 2:
                    loteria();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.exit(0);
                    System.out.println("Opcion Incorrecta.");
            }
        }

    public static void bonoLoto() {
        Set<Integer> numeros = new HashSet<>();
        Random random = new Random();

        while (numeros.size() < 6) {
            int a = random.nextInt(49) + 1; // Números entre 1 y 49
            numeros.add(a);
        }

        System.out.print("BonoLoto: ");
        numeros.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    public static void loteria() {
        Set<Integer> numeros = new HashSet<>();
        Random random = new Random();

        while (numeros.size() < 5) {
            int a = random.nextInt(9) + 1; // Números entre 1 y 9
            numeros.add(a);
        }

        System.out.print("Lotería: ");
        numeros.forEach(System.out::print);
        System.out.println();
    }
    //Codigo antiguo que repetía numeros
    /*public void bonoLoto() {
        for(int i=1; i<=6; i++) {
            int a=((int) (Math.random()*(49-1+1)+1));
            System.out.print(a + " ");
        }
    }
    public void loteria(){
        for (int i=1; i<=5; i++) {
            int a=(int) (Math.random()*(9-1+1)+1);
            System.out.print(a);
        }
    }*/
}
