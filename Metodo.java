import java.util.Scanner;
import java.sql.SQLOutput;

public class Metodo {
    Scanner sc= new Scanner(System.in);


    ATM pichincha = new ATM();
    String cedula,cuentaa;
    double cantidad,totalDinero=0,retiro,saldo;
    public void Depositar(){
        System.out.println("DEPOSITAR");
        System.out.println("Proceso para despositar.....");
        System.out.print("Ingrese su número de cedula : ");
        cedula= sc.next();
        System.out.print("Ingrese el numero de cuenta : ");
        cuentaa=sc.next();
        System.out.print("Ingrese la cantidad a depositar : ");
        cantidad=sc.nextDouble();
        totalDinero=totalDinero+cantidad;
    }

    public void Retirar(){
        System.out.println("RETIRAR");
        System.out.print("Ingrese la cantidad a retirar de la cuenta : ");
        retiro=sc.nextDouble();

        if (retiro > totalDinero){
            System.out.println("NO CUENTA UN SALDO SUFICIENTE");
        }
        else {
            // System.out.print("Ingrese la cantidad a retirar de la cuenta : ");
            //retiro=sc.nextDouble();
            saldo=totalDinero-retiro;
            System.out.println("Su saldo en la cuenta es : "+saldo);
        }
    }
}