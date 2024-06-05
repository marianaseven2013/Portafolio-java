package opciones;

import java.awt.font.FontRenderContext;

public class ListaOpciones {
    public static void listaOpciones() {
        String[] ListaOpciones = {

                "Calculadora", "IMC",
                "Login", "Calcular edad",
                "Grados", "Opción_6",
                "Opción_7", "Opción_8",
                "Opción_9", "Salir"
        };

        for (int i = 0; i < ListaOpciones.length; i++) {
            System.out.printf("[%d] %s ", i + 1, ListaOpciones[i]);

            for (int j = 0;j<(13-ListaOpciones[i].length());j++){
                System.out.print(" ");
            }


            if ((i + 1) % 2 == 0) {
                System.out.println("");

            }


        }


    }


}


