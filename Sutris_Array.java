/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

import java.util.Scanner;

/**
 *
 * @author SUTRISNO
 */
public class Mentoringpcb {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matriksA[][] = {
            {1, 2}, {3, 4}
        };

        String matriksB[][] = {
            {"Hadi", "Deo", "Lanang"},
            {"Bimo", "Raju", "bambang"}

        };

        int matriksc[][] = new int[2][3];


//        perulangan digunakan utnuk menginputkan data pada array
        for (int i = 0; i < matriksc.length; i++) {
            for (int j = 0; j < matriksc.length; j++) {
                System.out.println("input data :");
                matriksc[i][j] = input.nextInt();
            }
        }
        System.out.println("==================================");
        
//        digunakan untuk menampilkan data pada array
        for (int k = 0; k < matriksc.length; k++) {
            for (int l = 0; l < matriksc.length; l++) {
                System.out.print("data " + k + l + matriksc[k][l]);
            }
            System.out.println("");
        }

    }
}
