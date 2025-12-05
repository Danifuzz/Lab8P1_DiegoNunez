/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
        boolean victoria = false;
         System.out.println(victoria);
        int columna = 0;
      SecureRandom random = new SecureRandom(); 
      Scanner entrada = new Scanner(System.in);
        System.out.println("0) Salir");
        System.out.println("1) Escape de Unitec");
        System.out.print("Ingrese su seleccion:");
        int ejercicio = entrada.nextInt();
      if (ejercicio == 1) {
      
      char[][]tablero = new char[5][5];
        int movimiento = random.nextInt(1,6);
        int acum = random.nextInt(1,10);
        Generartablero(tablero);
        char puntero = tablero[fila][columna];
        while (acum<60) {
            if (fila>4) {
                System.out.println("Lograste llegar a la parada de buses a tiempo");

                System.out.println("Felicidades! Escapo del laboratorio!");
                break;
            }
            Imprimirtablero(tablero);
            int columnao = columna;
            tablero[fila][columna] = ' ';
            columna = columna + movimiento;
            if (tablero[4][4] == 'E') {
                System.out.println("Lograste llegar a la parada de buses a tiempo");

                System.out.println("Felicidades! Escapo del laboratorio.");
                break;
            }
            if (columna>4) {
                fila++;
                columna=ValidarColumna(columna);
            }
            if (tablero[fila][columna] == ('D')) {
                System.out.println("Tu profesor te da miedo... regresaste a donde estabas.");
                columna = columnao; 
            } else if (tablero[fila][columna] == ('L')) {
                System.out.println("Tu companero de programacion te ayudo a avanzar 3 casillas!");
                columna = columna + 3;
                if (columna > 4) {
                    columna=ValidarColumna(columna);
                    if (fila+1>4 || tablero[4][4] == 'E') {
                        tablero[4][4] = 'E';
                        fila =4;
                        System.out.println("Lograste llegar a la parada de buses a tiempo");

                System.out.println("Felicidades! Escapo del laboratorio!");
                break;
                    } else {
                    fila++;
                    }
                    if (fila+1>4 || tablero[4][4] == 'E') {
                        tablero[4][4] = 'E';
                        System.out.println("Lograste llegar a la parada de buses a tiempo");

                System.out.println("Felicidades! Escapo del laboratorio!");
                break;
                    }
                }
                if (fila+1>4 || tablero[4][4] == 'E') {
                    fila=4;
                    tablero[4][4] = 'E';
                    System.out.println("Lograste llegar a la parada de buses a tiempo");

                System.out.println("Felicidades! Escapo del laboratorio!");
                break;
                    }
            } else if (tablero[fila][columna] == ('M')) {
                System.out.println("Tu companero de matematicas te ayudo avanzar una casilla!");
                columna++;
                if (columna > 4) {
                    fila++;
                    columna=ValidarColumna(columna);
                    if (fila>4) {
                        fila =4;
                        tablero[4][4] = 'E';
                        System.out.println("Lograste llegar a la parada de buses a tiempo");

                System.out.println("Felicidades! Escapo del laboratorio!");
                break;
            }
                }
                
                
            } else {
                if (columna>4) {
                    if (fila>4) {
                        fila =4;
                        tablero[4][4] = 'E';
                        System.out.println("Lograste llegar a la parada de buses a tiempo");

                System.out.println("Felicidades! Escapo del laboratorio!");
                break;
            }
                    fila++;
                    columna=ValidarColumna(columna);
                }
                
            }
            
            if (fila>4){
                fila = 4;
                System.out.println("Lograste llegar a la parada de buses a tiempo");

                System.out.println("Escapaste del laboratorio");
                tablero[4][4] = 'E';
                break;
            } else {
                tablero[fila][columna] = 'E';
            }
            
            System.out.println("");

            System.out.println("Tiempo transcurrido:" +acum +"minutos");
            System.out.println("Movimientos realizados:" +movimiento);
            acum = acum+ random.nextInt(1,10);
            movimiento = random.nextInt(1,5);
                    System.out.println("");
            if (tablero[4][4]=='E'){
                System.out.println("Lograste llegar a la parada de buses a tiempo");
                System.out.println("Escapaste del Laboratorio!");
                break;
            }
                    if (acum>=60) {
                        System.out.println("Se acabo el tiempo! no escapaste del laboratorio");
                    } 
                    
        
    }
          System.out.println("");
        Imprimirtablero(tablero);
          
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
    public static int ValidarColumna(int columna) {
        while (columna > 4) {
        if(columna >= 5) {
            columna = columna-5;
        }
        }
    return (columna);   
    }
}

