/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian chairul
 */
public class jobsheet3_ian_soal3 {
     public static void main(String[] args){
        int[] A={12,15,7,10,25,2,17,25,5,20};
        
        for(int i=0; i<A.length; i++)
            System.out.print(A[i] + " ");
        
        System.out.println();
        for(int i=0; i<A.length-1; i++){
            if(A[i]>A[i+1]){
                int tampung = A[i];
                A[i] = A[i+1];
                A[i+1] = tampung;
            }
        }
        
        for (int i=0; i<A.length;i++)
            System.out.print(A[i] + " ");
        
        System.out.println();
    }
}
