import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner inputValue;
        System.out.print("Introduce tu nota:");
        inputValue = new Scanner(System.in);

        double x;
        x=inputValue.nextDouble();

        if (x>=0 && x<3) {
            System.out.println("Muy Deficiente");
        } else if (x>3 && x<5) {
            System.out.println("Insuficiente");
        } else if (x>5 && x<6) {
            System.out.println("Suficiente");
        } else if (x>6 && x<7) {
            System.out.println("Bien");
        } else if (x>7 && x<9) {
            System.out.println("Notable");
        } else if (x>9 && x<=10) {
            System.out.println("Sobresaliente");
        }
    }
}