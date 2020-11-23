/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian chairul
 */
public class jobsheet3_ian_soal2 {
     public static void main(String[] args) {
        int[] A={12,15,7,10,25,2,17,25,5,20};
        
        for(int i=0; i<A.length; i++)
            System.out.print(A[i] + " ");
        
        System.out.println();
        int tampung = A[0];
        A[0] = A[1];
        A[1] = tampung;
        
        for (int i=0; i<A.length;i++)
            System.out.print(A[i] + " ");
        
        System.out.println();
    }
  
}
