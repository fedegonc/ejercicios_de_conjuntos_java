package revision1;


import java.util.Arrays;

// 8. Crie um método que receba dois vetores de números inteiros como 
//parâmetros e retorne um novo vetor que contenha  apenas os elementos que
//sejam comuns aos dois vetores (ou seja, a intersecção dos vetores).
//Exemplo de entrada: [1,2,3,4,5], [1,2,9,5,10]
//Saída: [1,2,5]*
//*pueden contener pero no devolver elementos duplicados
public class interseccion {

    public static void main(String[] args) {
        //  int[] vect1 = {4, 3, 4, 3, 1, 3, 2, 3, 2, 4, 5, 3, 5, 5, 3, 5, 6};
        // int[] vect2 = {5, 4, 5, 5, 3, 5, 4, 5, 5, 5, 5, 5, 6}; //esto es para probar 
        int[] vect1 = {1, 2, 3, 4, 5};
        int[] vect2 = {1, 2, 9, 5, 10};
        System.out.println(Arrays.toString(intersecar(vect1, vect2)));
    }

    public static int[] intersecar(int[] v1, int[] v2) {

        int a, b, c, d, e;

        c = d = e = 0;

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1.length - 1; j++) {

                a = v1[j];
                b = v1[j + 1];

                if (a > b) {        //ordenar alguno de los arrays para evitar problemas

                    v1[j] = b;
                    v1[j + 1] = a;
                }
            }
        }

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {

                if (v1[i] == v2[j]) {
                    if (d != v1[i]) {
                        d = v1[i];
                        c++;            //esto es para determinar un length para interseccion
                    }
                }
            }
        }

        int[] interseccion = new int[c];

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {

                if (v1[i] == v2[j]) {
                    if (d != v1[i]) {
                        d = v1[i];
                        interseccion[e] = v1[i]; //aca lo mismo solo que ahora los guarda 
                        e++;
                    }
                }
            }
        }

        return interseccion;
    }
}
