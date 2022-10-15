import java.util.Scanner;
public class Example11 {
    public static void main(String[] argv) {
        int a,b;
        Scanner inputValue;
        System.out.print("Introduce dos valores:");
        inputValue = new Scanner(System.in);
        a= inputValue.nextInt();
        b= inputValue.nextInt();

        if (a<b) {
            System.out.print("Orden ascendente: " + b + "  " + a);
        } else {
            System.out.print("Orden ascendente: " + a + "  " + b);
        }
    }
}
