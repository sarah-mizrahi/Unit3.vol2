import java.util.Scanner;
public class Example13 {
    public static void main(String[] argv) {
        Scanner inputValue;
        int a,b,c;
        inputValue = new Scanner(System.in);
        System.out.print("Introduce el primer valor: ");
        a= inputValue.nextInt();
        System.out.print("Introduce el segundo valor: ");
        b= inputValue.nextInt();
        System.out.print("Introduce el tercer valor: ");
        c= inputValue.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.print("El mayor es: "+ a);
            } else {
                System.out.print("El mayor es: "+ c);
            }
        } else if (b>c) {
            System.out.print("El mayor es: "+b);
        } else {
            System.out.print("El mayor es: "+c);
        }
    }
}