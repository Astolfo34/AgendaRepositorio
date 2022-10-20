package proyectoAgendaApplication;

import proyectoAgendaModel.Contacto;


public class test {

    private static int [][] matriz= new int[3][3];


    public static  void main (String Args[]){
// matriz regular

        matriz[0][0]=1;
        matriz[0][1]=2;
        matriz[0][2]=3;
        matriz[1][0]=4;
        matriz[1][1]=5;
        matriz[1][2]=6;
        matriz[2][0]=7;
        matriz[2][1]=8;
        matriz[2][2]=9;
        // matriz i
        // rregular
       // int [][] matriz= new int[3][];
        //matriz .lenght da el tamaño o cantidad de las filas, por ende para recorrer columnas se usa matriz[i].length
        mostrarMatrizForma1(matriz);
        System.out.println();
        mostarMatrizForma2(matriz);
        System.out.println();
        mostrarMatrizForma3(matriz);
        System.out.println();
        mostrarMatrizForma4(matriz);
        System.out.println();
       // mostrarMatrizRecursivamente(matriz,0,0);
        mostrar_matriz(0,0,3,3);


    }
    /**
     * TAREA PROGRAMACION
     */
    public static void mostrarMatrizForma1(int matriz[][]){

        for (int i = 0; i < matriz.length ; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }
    public static void mostarMatrizForma2(int matriz[][]){
        for (int i = matriz.length-1; i >=0 ; i--) {

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static  void  mostrarMatrizForma3(int matriz[][]){
        for (int i = matriz.length-1; i >=0  ; i--) {
            for (int j = matriz[i].length-1; j>=0 ; j--) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static void mostrarMatrizForma4(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length-1; j >=0 ; j--) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static void mostrarMatrizRecursivamente(int matriz[][],int i, int j){
        if(i != matriz.length-1){
            System.out.print(matriz[i][j]);
            i++;
            if(j != matriz[0].length-1){
                j++;
                mostrarMatrizRecursivamente(matriz,i,j);
            }

        }
    }
    public  static void mostrar_matriz(int i, int j, int filas, int columnas) {
int sw1=0;

        if (sw1 == 0) {
            if (i < filas) {

                if (j < columnas) {
                    System.out.println("- " + i + " " + j);
                    System.out.println(matriz[i][j]);
                    mostrar_matriz(i, j + 1, filas, columnas);
                }

                if (j == columnas) {
                    System.out.println("-----------------------------------");
                    mostrar_matriz(i + 1, 0, filas, columnas);

                }
            } else {
                sw1 = 1;
            }
        }

    }

}
