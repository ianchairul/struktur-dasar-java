/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian chairul
 */
public class jobsheet4_ian_soal1 {
     public static void main(String[] args) {
       int[] A={84,69,76,86,94,91};
         for (int i=0; i<A.length;i++){
            System.out.print(A[i] + " ");
        }
         
       for (int i=0; i<A.length-1;i++){
           for (int j=i+1; j<A.length;j++){
               if (A[j]>A[i]){
                   int tmp = A[i];
                   A[i]= A[j];
                   A[j] = tmp;
               }
           }
       }
            System.out.println();
        for (int i=0; i<A.length;i++){
            System.out.print(A[i] + " ");
        }
      }
}
