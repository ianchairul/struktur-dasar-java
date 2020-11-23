
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
public class jobsheet4_ian_soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         //int[] A={84,69,76,86,94,91};
        System.out.print("Masukkan jumlah data : ");
        int jml = input.nextInt();
   System.out.println();
        int[] A = new int [jml];     
        for (int i = 0; i < jml; i++){
            System.out.print("Masukkan data ["+(i+1)+"] : ");
            A [i]=input.nextInt();
        }
     
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
