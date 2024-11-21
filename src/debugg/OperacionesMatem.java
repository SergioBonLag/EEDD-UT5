package debugg;

public class OperacionesMatem {

    public int calcularSuma(int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += i;
        }

        return suma;
    }



    public int encontrarMaximo(int[] arr){
            int maximo = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > maximo) {
                    maximo = num;
                }
            }
            return maximo;
    }

}
