import java.util.Scanner;
public class Example25 {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}