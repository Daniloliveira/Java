import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A, B;
        double MEDIA;
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        MEDIA = ((3.5 * A ) + (7.5 * B ))/11 ;
        System.out.printf("MEDIA = %.5f%n",MEDIA);
    }
}
    

 