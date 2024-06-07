import Programas.IMC;
import interfaz_grafica.Banner;
import lista.ListaDeCompras;
import opciones.ListaOpciones;
import Matematicas.Mate;
import Sentigrados.ssentigrados;
import java.util.Scanner;
import Conversor_p.Converso_U;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {


                String[] ListaOpciones = {

                        "Calculadora", "IMC",
                        "Login", "Calcular edad",
                        "Grados", "Opción_6",
                        "Opción_7", "Opción_8",
                        "Opción_9", "Salir"
                };

        boolean programas = true;

        do {
            //
            Banner.mensaje();
            //PEDIR UNA OPCIÓN
            opciones.ListaOpciones.opciones(ListaOpciones);

            //PEDIR UNA OPCIÓN

            Scanner intOpcion = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = intOpcion.nextInt();
            System.out.println(" ------------------------------------------------------------------------------------");

            //CARGAR OPCIÓN DEL USUARIO
            switch (opcion){
                case 1:
                    Mate.programa();
                    break;

                case 2:
                    IMC.programaIMC();
                    break;

                case 3:
                    ssentigrados.programar();
                    break;

                case 4:
                    Converso_U.coonversoor();
                    break;

                case 5:
                    System.out.println("Opción 5");
                    break;

                case 6:
                        ListaDeCompras.compras();
                    break;

                case 7:
                    System.out.println("Opción 7");
                    break;

                case 8:
                    System.out.println("Opción 8");
                    break;

                case 9:
                    System.out.println("Opción 9");
                    break;

                case 10:
                    programas = false;
                    break;
            }


        } while (programas);

    }
}