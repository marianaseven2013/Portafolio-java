package calculadora;
import java.util.Scanner;
public class Mate {

    public static void programa(){

        System.out.println("Disponibles: ");
        System.out.println();
        String[] operaciones = {"Sumar","Restar","Multiplicar","Dividir"};


        for (int i = 0; i < operaciones.length; i++){
            System.out.printf("[%d] %s ",i+1,operaciones[i]);

            for (int j = 0; j < (12 - operaciones[i].length()); j++){
                System.out.print(" ");
            }

            if ((i+1)%2==0){  //CANTIDAD DE COLUMNAS
                System.out.println("");
            }

        }

        System.out.println();

         Scanner opcionAelegir = new Scanner(System.in);
            System.out.print("?: ");
        int opcion = opcionAelegir.nextInt();

        System.out.println();
        switch (opcion){
            case 1:
                Scanner iNum = new Scanner(System.in);
                System.out.print("Num1: ");
                int num1 = iNum.nextInt();
                System.out.print("Num2: ");
                int num2 = iNum.nextInt();

                System.out.println("Resultado: " + suma(num1, num2));
                break;
            case 2:
                Scanner iNum2 = new Scanner(System.in);
                    System.out.print("Num1: ");
                    int num3 = iNum2.nextInt();
                System.out.print("Num2: ");
                int num4 = iNum2.nextInt();

                System.out.println("Resultado: "+resta(num3, num4));
                break;
            case 3:
                Scanner iNum3 = new Scanner(System.in);
                System.out.print("Num1: ");
                 int num5 = iNum3.nextInt();
                System.out.print("Num2: ");
                int num6 = iNum3.nextInt();

                System.out.println("Resultado: "+multiplicar(num5, num6));
                break;
            case 4:
                Scanner iNum4 = new Scanner(System.in);
                System.out.print("Num1: ");
                 int num7 = iNum4.nextInt();
                System.out.print("Num2: ");
                int num8 = iNum4.nextInt();

                System.out.print("Resultado: "+dividir(num7, num8));
                break;


        }


    }



         public static int suma(int num1, int num2){

        int sumar = num1+num2;

        return sumar;
    }
    public static int resta(int num1, int num2){
        int restar = num1-num2;

        return restar;
    }

     public static double dividir(double num1, double num2){
        double dividir = num1/num2;

        return dividir;
    }

     public static int multiplicar(int num1, int num2){

        int multiplicar = num1 * num2;

        return multiplicar;
    }

}