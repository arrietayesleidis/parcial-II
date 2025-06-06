 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial;

import java.util.Scanner;

/**
 *
 * @author yesleidis y jaider
 */
public class Main {

    static String[] array = new String[10];  
    static String[][] matriz = new String[4][4]; 
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        int opcion = 0;

        while (opcion != 8) {
            System.out.println("\nMENU PRINCIPAL ");
            System.out.println("1. Calcular Area Circulo");
            System.out.println("2 Ingresar Datos Arreglo");
            System.out.println("3 Listar Datos Arreglo");
            System.out.println("4 Listar Dato Especifico Arreglo");
            System.out.println("5 Ingresar Datos Matriz");
            System.out.println("6 Listar Datos Matriz");
            System.out.println("7 Listar Dato Especifico Matriz");
            System.out.println("8 Salir");
            System.out.print("elija una opcion ");

            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1 -> calcularAreaCirculo();
                case 2 -> ingresarDatosArreglo();
                case 3 -> listarDatosArreglo();
                case 4 -> listarDatoEspecificoArreglo();
                case 5 -> ingresarDatosMatriz();
                case 6 -> listarDatosMatriz();
                case 7 -> listarDatoEspecificoMatriz();
                case 8 -> System.out.println("bye bye");
                default -> System.out.println(" Vuelva a intentarlo");
            }
        }
    }

    public static void calcularAreaCirculo() {
        System.out.print("Digite el radio del circulo: ");
        double radio = scanner.nextDouble();
        double area = 3.1416 * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }

    public static void ingresarDatosArreglo() {
        System.out.println("\nIntroduzca datos para el arreglo (10 elementos):");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Posicion %d: ", i);
            array[i] = scanner.nextLine();
        }
        System.out.println("Datos actualizados");
    }

    public static void listarDatosArreglo() {
        System.out.println("\nDatos del arreglo:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("[%d]: %s%n", i, array[i]);
        }
    }

    public static void listarDatoEspecificoArreglo() {
        System.out.print("\nDigite la posicion a consultar (0-9): ");
        int pos = scanner.nextInt();
        if (pos >= 0 && pos < 10) {
            System.out.printf("Valor en [%d]: %s%n", pos, array[pos]);
        } else {
            System.out.println("Entrada no valida");
        }
    }

    public static void ingresarDatosMatriz() {
        System.out.println("\nIntroduzca datos para la matriz (4x4):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("[%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextLine();
            }
        }
        System.out.println("Matriz completada.");
    }

    public static void listarDatosMatriz() {
        System.out.println("\nMatriz completa:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void listarDatoEspecificoMatriz() {
        System.out.print("\nIntroduzca fila (0-3): ");
        int fila = scanner.nextInt();
        System.out.print("Intoduzca columna (0-3): ");
        int columna = scanner.nextInt();

        if (fila >= 0 && fila < 4 && columna >= 0 && columna < 4) {
            System.out.printf("Valor en [%d][%d]: %s%n", fila, columna, matriz[fila][columna]);
        } else {
            System.out.println("Ubicación no valida");
        }
    }
}
  

