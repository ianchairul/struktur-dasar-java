
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian chairul
 */
public class jobsheet3_ian_soal5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Banyak data : ");
        int banyak = input.nextInt();
        int[]A = new int[100];
        
        for(int i=0; i<banyak; i++){
            System.out.print("Array indeks ke-"+i+" : ");
            A[i] = input.nextInt();
        } 
        
        for(int i=0; i<banyak; i++)
            System.out.print(A[i] + " ");
        
        System.out.println();
        for(int i=0; i<banyak-1; i++){
            for(int j=0; j<banyak-1; j++){
                if(A[j]>A[j+1]){
                    int tampung = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tampung;
                }
            }
        }
        
        for (int i=0; i<banyak;i++)
            System.out.print(A[i] + " ");
        
        System.out.println();
    } 
}
