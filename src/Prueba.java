import java.util.Scanner;

public class Prueba{

public static void main(String[] args) {

        int x = 5;
        int y = 6;
        int suma= x+y;

    System.out.print("La suma de "+x+" y "+y+" es = "+suma);
    System.out.println();
    System.out.println();


    int a,b,sumar;
    Scanner sc = new Scanner(System.in);
    System.out.print ("Introduce valor de a: ");
    a = sc.nextInt();
    System.out.print ("Introduce valor de b: ");
    b = sc.nextInt();
    sumar = a+b;
    System.out.print ("El resultado de la suma es: " + sumar);
    }

}
