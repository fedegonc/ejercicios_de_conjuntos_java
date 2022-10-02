package revision1;

import java.util.Arrays;
//9. Crie um método que receba dois vetores de números inteiros como parâmetros 
//e retorne um novo vetor que contenha  a  união dos elementos dos dois vetores 
//(eliminando-se os elementos repetidos). 
//Exemplo de entrada: [1,2,3,4,5], [4,5,6,7,8]
//Saída: [1,2,3,4,5,6,7,8]

public class Union {

    public static void main(String[] args) {

        // int[] vect1 = {4, 3, 4, 3, 1, 3, 2, 3, 2, 4, 5, 3, 5, 5, 3, 5, 6};
        //int[] vect2 = {5, 4, 5, 5, 3, 5, 4, 5, 5, 5, 5, 5, 6}; //esto es para probar 
       int[] vect1 = {1, 2, 3, 4, 5};
        int[] vect2 = {4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(unir(vect1, vect2)));

    }

    public static int[] unir(int[] v1, int[] v2) {

        int a, b, c, d, e, g;
        c = d = e = g = 0;

        int[] concat = new int[v1.length + v2.length];

        for (int i = 0; i < v1.length + v2.length; i++) {

            if (i < v1.length) {
                concat[i] = v1[i];
                c++;

            }                                       //esto es para concatenarlos

            if (i >= c) {
                concat[i] = v2[i - c];

            }
        }

        for (int i = 0; i < concat.length; i++) {
            for (int j = 0; j < concat.length - 1; j++) {

                a = concat[j];
                b = concat[j + 1];

                if (a > b) {        //ordenar

                    concat[j] = b;
                    concat[j + 1] = a;
                }
            }
        }

        for (int i = 0; i < concat.length; i++) {
            if (d != concat[i]) {
                d = concat[i];
                g++;                //para definir un largo para union[]

            }

        }

        int[] union = new int[g];

        for (int i = 0; i < concat.length; i++) {
            if (d != concat[i]) {
                d = concat[i];
                union[e] = concat[i];       //agrego los que no se repiten
                e++;

            }

        }

        return union;
    }

}
