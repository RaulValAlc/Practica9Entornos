package com.mycompany.hanoi;

import java.util.Scanner;

public class Hanoi {

    public static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }

        // Paso 1: mover n-1 de origen a auxiliar
        hanoi(n - 1, origen, auxiliar, destino);

        // Paso 2: mover el grande de origen a destino
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        // Paso 3: mover n-1 de auxiliar a destino
        hanoi(n - 1, auxiliar, destino, origen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // número de discos
        hanoi(n, 'A', 'C', 'B');  // de A a C, usando B
    }
}
