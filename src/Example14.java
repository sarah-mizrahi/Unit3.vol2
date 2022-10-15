import java.util.Scanner;
public class Example14 {
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

        if(a>b) {
            if(a>c) {
                if(b>c) {
                    System.out.println("Orden Ascendente: " + c + " " + b + " " + a);
                }else {
                    System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
                }
            }else {
                System.out.println("Orden Ascendente: " + b + " " + a + " " + c);
            }
        }else {
            if(b>c) {
                if(a>c) {
                    System.out.println("Orden Ascendente: " + c + " " + a + " " + b);
                }else {
                    System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
                }
            }else {
                System.out.println("Orden Ascendente: " + a + " " + b + " " + c);
            }
        }
    }
}