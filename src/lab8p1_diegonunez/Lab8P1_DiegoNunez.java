/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_diegonunez;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author nunez
 */
public class Lab8P1_DiegoNunez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fila = 0;
        int columna = 0;
      SecureRandom random = new SecureRandom(); 
      Scanner entrada = new Scanner(System.in);
        System.out.println("0) Salir");
        System.out.println("1) Escape de Unitec");
        System.out.print("Ingrese su seleccion:");
        int ejercicio = entrada.nextInt();
      if (ejercicio == 1) {
      
      char[][]tablero = new char[5][5];
        int r = random.nextInt(1,6);
        int u = random.nextInt(1,10);
        Generartablero(tablero);
        char puntero = tablero[0][0];
        while (u<60) {
            Imprimirtablero(tablero);
            
           
                if (columna + r >4) {
                    tablero[fila][columna] = ' ';
                    if (fila+1<5){
                    fila ++;
                    } else {
                        
                        System.out.println("El juego termino");
                        break;
                    }
                    columna = columna + r -5;
                    puntero = tablero[fila][columna];
                    tablero[fila][columna] = 'E';
            }   else if (columna + r <5) {
                    tablero[fila][columna] = ' ';
                    columna = columna + r;
                    puntero = tablero[fila][columna];
                    tablero[fila][columna] = 'E';
            }
                
            System.out.println(u);
            System.out.println("Numero al azar" +r);
            u = u+ random.nextInt(1,10);
            r = random.nextInt(1,5);
                    System.out.println("");
        
    }
      }
    }
    public static void Imprimirtablero(char[][]tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print("["+tablero[i][j] +"]");
            }
            System.out.println("");
        }
    }
    public static char[][] Generartablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = ' ';
                
            }

        }
        tablero[0][0] = 'E';
        tablero[0][1] = 'M';
        tablero[0][2] = 'M';
        tablero[1][4] = 'L';
        tablero[2][4] = 'D';
        tablero[4][0] = 'M';
        tablero[4][1] = 'D';
        tablero[3][3] = 'D';
        tablero[4][3] = 'L';
        tablero[3][4] = 'L';
        return tablero;
    }
}
