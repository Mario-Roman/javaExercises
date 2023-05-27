public class Fibonacci {

    public static void main(String[] args) {

        int numero1=0;
        int numero2=1;
        int suma=1;


        System.out.println(numero1);

        for(int i=0;i<15;i++) {
            System.out.println(suma);

            suma=numero1+numero2;
            numero1=numero2;
            numero2=suma;
        }
    }
}