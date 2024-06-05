package lista;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class ListaDeCompras {



    public static String[] opciones = {"Lista de compras","Salida"};

            public static void compras(){

            ListaDeCompras.cargar(opciones);

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

                Scanner item = new Scanner(System.in);
                String rP;
                double rPc;



                for (int i = 1; i<=3;i++)
                    Scanner item = new Scanner(System.in);
                    System.out.println("Producto: ");
                    rP = item.nextLine();
                    System.out.println("Precio: ");
                    rPc = item.nextDouble();

                listaNombre.add(rP);
                ListaPrecio.add(rPc);

                System.out.println(listaNombre + "-->" + ListaPrecio);

    }


    }


