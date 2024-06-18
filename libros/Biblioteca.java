package libros;

import java.util.Scanner;

public class Biblioteca {

    //private String[] libros = {"Libro1 ","Libro 2"};

    public static void programa(){
        System.out.println("Biblioteca");

      Libro libro1 = new Libro("Libro 111","PEPE","1994");
      Libro libroo1 = new Libro("Harry Potter y el prisionero de Azkaban","J.K. Rowling","1999");
      Libro libro3 = new Libro("Die for you", "Jk87hybe", "2023" );
      Libro libro4 = new Libro("Boulevard","flormsalvador","2016");
      Libro libro5 = new Libro("Antes de Diciembre", "JoanaMarcus", "2023" );
      Libro libro6 = new Libro("La vuelta al mundo en 80 días","Jules Verne","1873");
      Libro libro7 = new Libro("La cabaña", "William Paul Young", "2007" );
      Libro libro8 = new Libro("Deaspues de Él","flormsalvador","2020");
      Libro libro9 = new Libro("Efecto Mariposa", "dayzaccardi", "2021" );
      Libro libro10 = new Libro("Sigue mi voz","Ariana_Godoy","2022");
      Libro libro11 = new Libro("HEIST", "Ariana_Godoy", "2018" );
      Scanner scr= new Scanner(System.in);

        System.out.println(libro1.getTitulo());
        System.out.println(libroo1.getTitulo());

        //AUTORES
        System.out.println(libro1.getAutor());
        System.out.println(libroo1.getAutor());


        //FECHA
        System.out.println(libro1.getFecha());
        System.out.println(libroo1.getFecha());
        System.out.println(libro1.toString());
        System.out.println(libroo1.otoString());
        System.out.println(libro3.serString());
        System.out.println(libro4.seraString());
        System.out.println(libro5.sereString());
        System.out.println(libro6.siriString());
        System.out.println(libro7.soroString());
        System.out.println(libro8.suruString());
        System.out.println(libro9.saraString());
        System.out.println(libro10.otosString());
        System.out.println(libro11.rotoString());

    }
}
