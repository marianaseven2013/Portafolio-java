package Colegio;

import java.util.Scanner;

public class Escuela {

    public static void programar(){
        System.out.println("Estudiantes de 1ro Primaria");
        System.out.print("\n");


        Estudiantes Estudiante1 = new Estudiantes("Estefane","estef/123@scl.edu.gt","1ro", "16 años",true);
        Estudiantes Estudiante2 = new Estudiantes("Lucas","Lucaschimolala@scl.edu.gt","1ro", "8años", true);
        Estudiantes Estudiante3 = new Estudiantes("Marco","marcoer@scl.edu.gt","1ro","8años",true);
        Estudiantes Estudiante4 = new Estudiantes("Jungkook","Bangtankook@scl.edu.gt","1ro","8años",true);
        Estudiantes Estudiante5 = new Estudiantes("Nayeon","Naytwice/@scl.edu.gt","1ro","8años",true);


        Scanner src = new Scanner(System.in);

        System.out.println(Estudiante1.getNombre() + ", " + Estudiante1.getCorreo());

        System.out.println(Estudiante2.getNombre() + ", " + Estudiante2.getCorreo());

        System.out.println(Estudiante3.getNombre() + ", " + Estudiante3.getCorreo());

        System.out.println(Estudiante4.getNombre() + ", " + Estudiante4.getCorreo());

        System.out.println(Estudiante5.getNombre() + ", " + Estudiante5.getCorreo());

        System.out.print("\n");
        System.out.println("CURSOS");
        System.out.print("\n");

        Cursos curso1 = new Cursos("Comunicación y Lenguaje","Lenguaje","Periodo1");
        Cursos curso2 = new Cursos("Expresión Artistica","Artes","periodo2");
        Cursos curso3 = new Cursos("Educación Fisica", "Deportes","periodo2");
        Cursos curso4 = new Cursos("Ingles","Lenguaje","periodo3");
        Scanner srrc = new Scanner(System.in);

        System.out.println(curso1.getNombre());
        System.out.println(curso2.getNombre());
        System.out.println(curso3.getNombre());
        System.out.println(curso4.getNombre());


    }

}
