import java.util.Scanner;
public class Example18 {
    public static void main(String[] argv) {

        int precioHora,horas,horasExtra;
        double salarioBruto,salarioNeto,tasa1,tasa2,impuestos;

        Scanner inputValue;
        inputValue=new Scanner(System.in);
        System.out.println("Precio por hora:");
        precioHora = inputValue.nextInt();
        System.out.println("Horas trabajadas:");
        horas = inputValue.nextInt();

        if (horas <= 35) {
            salarioBruto=horas*precioHora;
        } else {
            horasExtra=horas-35;
            salarioBruto=(35*precioHora)+(horasExtra*precioHora*1.5);
        }
        if (salarioBruto<=500) {
            salarioNeto=salarioBruto;
        } else if (salarioBruto>500 && salarioBruto<=900) {
            tasa1=salarioBruto-500;
            tasa1=salarioBruto*0.25;
            salarioNeto=salarioBruto-tasa1;
        } else if (salarioBruto>900) {
            tasa1=400;
            tasa2=salarioBruto-900;
            impuestos=tasa1*0.25;
            impuestos=tasa1+(tasa2*0.45);
            salarioNeto=salarioBruto-impuestos;
        }
        System.out.println("Salario bruto:");
        System.out.println("Tasas:");
        System.out.println("Salario neto:");
    }
}
