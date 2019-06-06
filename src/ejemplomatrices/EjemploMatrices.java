/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatrices;

import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class EjemploMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int numFilas=sc.nextInt();
        System.out.println("Ingrese el numero de Columnas: ");
        int numColumnas=sc.nextInt();
        int edades[][]=new int[numFilas][numColumnas];
        //leer elementos de la matriz
        for (int i = 0; i < numFilas; i++){
           for (int j = 0; j < numColumnas; j++){
            System.out.println("Ingrese el elemento "+i+","+j); 
            edades[i][j]=sc.nextInt();
           } 
        }
        //Imprimir
        System.out.println("la matriz es:");
        for (int i = 0; i < numFilas; i++){
           for (int j = 0; j < numColumnas; j++){
            //System.out.print("Elemento "+i+","+j+":"+edades[i][j]); 
            System.out.print(""+edades[i][j]+"\t");
                      } 
           System.out.println();  
        }
        //modificar elemento
        System.out.println("Ingrese la fila del elemeto a modificar: ");
        int fmod=sc.nextInt();
        System.out.println("Ingrese la columna del elemeto a modificar: ");
        int Cmod=sc.nextInt();
        System.out.println("Ingrese el nuevo valor: ");
        int NValor=sc.nextInt();
        edades[fmod][Cmod]=NValor;
//          for (int i = fmod; i < numFilas; i++){
//           for (int j = Cmod; j < numColumnas; j++){
//             edades[i][j]=NValor;
//           } 
//        }
          System.out.println("la matriz es:");
        for (int i = 0; i < numFilas; i++){
           for (int j = 0; j < numColumnas; j++){ 
            System.out.print(""+edades[i][j]+"\t");
                      } 
           System.out.println();  
        }
     /*int edades[][]=new int[2][2];
     edades[0][0]=35;
     edades[0][1]=78;
     edades[1][0]=27;
     edades[1][1]=90;
     System.out.print(""+edades[0][0]);
     System.out.print("\t"+edades[0][1]+"\n");
     System.out.print(""+edades[1][0]);
     System.out.print("\t"+edades[1][1]+"\n");*/
    }
    
}
