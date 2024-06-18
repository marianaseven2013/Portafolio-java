package lista;

import mis_metodos.ListaOpciones;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class ListaDeCompras {



    public static String[] opciones6 = {"Lista de compras","Salida"};

            public static void compras(){

            ListaOpciones.opciones(opciones6);

                Scanner opcion = new Scanner(System.in);
                System.out.println("[?]: ");
                int r = opcion.nextInt();

                switch (r){
                    case 1:
                        crearlista();
                        break;
                    case 2:
                        System.out.print("Salir");
                        break;
                }

            }

            public static void crearlista(){
                List<String> listaNombre = new ArrayList<>();
                List<Double> ListaPrecio = new ArrayList<>();

                String rP;
                double rPc;

                for (int i = 1; i<=3;i++){
                    Scanner item = new Scanner(System.in);
                    System.out.print("Producto: ");
                    rP = item.nextLine();
                    System.out.print("Precio: ");
                    rPc = item.nextDouble();

                    listaNombre.add(rP);
                    ListaPrecio.add(rPc);
                }
                System.out.println(listaNombre+"--"+ListaPrecio);

    }




    }


