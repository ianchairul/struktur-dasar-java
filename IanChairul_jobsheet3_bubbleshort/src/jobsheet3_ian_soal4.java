/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian chairul
 */
public class jobsheet3_ian_soal4 {
     public static void main(String[] args){
        int[] A={12,15,7,10,25,2,17,25,5,20};
        
        for(int i=0; i<A.length; i++)
            System.out.print(A[i] + " ");
        
        System.out.println();
        for(int i=0; i<A.length-1; i++){
            for(int j=0; j<A.length-1; j++){
                if(A[j]>A[j+1]){
                    int tampung = A[j];
                    A[j] = A[j+1];
                    A[j+1] = tampung;
                }
            }
        }
        
        for (int i=0; i<A.length;i++)
            System.out.print(A[i] + " ");
        
        System.out.println();
    }
}
