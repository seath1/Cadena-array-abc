import java.sql.SQLOutput;
import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

public class cadenatoarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        String stexto;
        int sw;




        System.out.print("Ingrese el texto a analizar");
        stexto = scan.nextLine();
        do {
            if (stexto.equals("")) {
                sw = 0;
                System.out.println("Debe ingresar un dato");
                stexto = scan.nextLine();
            } else {
                sw = 1;
            }
        } while (sw != 1);
        n = stexto.length();
        //TOLOWERCASE PARA HACERLO  MINISCULA
        stexto = stexto.toLowerCase();
        System.out.println(stexto);
        char [] nuevo = stexto.toCharArray();
        for (int i = 0; i < nuevo.length; i++) {
            System.out.print(nuevo[i] + " " +"\n")
            ;
        }

        // DE 97 AL 122 ASCII

        char [] abc = new char[26];
        for (int i = 97; i < 123; i++){
            abc[i-97] = ((char) i);
            //indice     ASCII
        }

        //recorrer arreglo de comparacion
        for (int i = 0; i < 26 ; i++) { //valor maximo abc
            int contador = 0;

            for (int j = 0; j < nuevo.length; j++) { //valor maximo txt
                if (nuevo[j] == abc[i]){
                    contador++;
                }
            }
            System.out.println(abc[i] + " = " + contador);

        }










    }
}







