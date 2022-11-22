import java.util.Scanner;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int menu,op;
        Scanner sc= new Scanner(System.in);
        Metodo sci= new Metodo();

        do{
            System.out.println("\n ATM");
            System.out.println(" ==================== ");
            System.out.println("|1.  RETIRO          |");
            System.out.println("|2.  DEPOSITO        |");
            System.out.println("|0.  SALIR           |");
            System.out.println(" ===================== ");
            System.out.print("Digita la opcion a realizar: ");
            menu = sc.nextInt();

            while (menu<0||menu> 2){
                System.out.println("Ingrese una opcion valida : ");
                menu= sc.nextInt();
            }

            switch (menu){
                case 1:
                    System.out.println("1");
                    sci.Depositar();
                    break;
                case 2:
                    System.out.println("2");
                    sci.Retirar();
                    break;
            }
            System.out.print("Desea salir del programa 1 --> SI :");
            op=sc.nextInt();
        }while(op!=1);

    }
}

