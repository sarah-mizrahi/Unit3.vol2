import java.util.Scanner;
public class Example28 {
    public static void main(String[] argv) {
        Scanner inputvalue;
        int a,b,producto=0;
        inputvalue= new Scanner(System.in);
        System.out.println("Introduce dos valores:");
        a= inputvalue.nextInt();
        b= inputvalue.nextInt();

        while (b!=0) {
            producto=producto+a;
            b=b-1;
        }
        System.out.println("El producto es:" +producto);
    }
}
