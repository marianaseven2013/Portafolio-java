package Conversor_p;

import java.util.Scanner;

public class Converso_U {

    public static void coonversoor() {
        System.out.println("Cual desea?: ");
        System.out.println();
        String[] operaciones = {"Litros a Galones", "Galones a litro", "Kilometros a metors", "Metros a Kilometros"};

        for (int i = 0; i < operaciones.length; i++) {
            System.out.printf("[%d] %s ", i + 1, operaciones[i]);

            for (int j = 0; j < (12 - operaciones[i].length()); j++) {
                System.out.print(" ");
            }

            if ((i + 1) % 2 == 0) {  //CANTIDAD DE COLUMNAS
                System.out.println("");
            }

        }


        Scanner elegir = new Scanner(System.in);
        int opcion = elegir.nextInt();
        switch (opcion) {
            case 1:
                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese la cantidad de litros: ");
                double litros = sc.nextDouble();
                double galones = litros / 3.785;
                System.out.print("Usted tiene: " + galones + "galones");
                break;

            case 2:
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese la cantidad de galones: ");
                double galoones = scanner.nextDouble();
                double lit = galoones * 3.78541;
                System.out.println("Usted tiene: " + lit + " litros.");
                break;


            case 3:

                Scanner iNum = new Scanner(System.in);
                System.out.print("Ingrese los kilometros: ");
                double kilometro = 1000;
                double metro = kilometroAmetro(kilometro);
                System.out.println(kilometro + " kilometros son " +  metro);

                break;


            case 4:
                Scanner kilo0 = new Scanner(System.in);
                System.out.print("metros: ");
                double metros = 5000.0;
                double kilometr = metrosAKilometros(metros);
                System.out.println(metros + " metros son " + kilometr );
        }


    }

    public static double galones(double Litros, double galones) {

        double litros = Litros / 3.785;

        return litros;
    }

    public static double litro(double gal, double lit) {

        double  galoones = lit / 3.785;

        return gal;
    }

    public static double kilometroAmetro(double num1){
        double dividir = num1/1000;
        return dividir;
    }


    public static double metrosAKilometros(double metros) {
        final double METRO_A_KILOMETRO = 1000;
        return metros * METRO_A_KILOMETRO;
    }
}

