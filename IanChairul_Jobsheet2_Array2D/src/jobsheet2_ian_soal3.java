
import java.util.Scanner;

public class jobsheet2_ian_soal3 {
   public static void main (String[] args){
        
    Scanner input = new Scanner(System.in);    
    System.out.println("Matrik A");
    System.out.print("Jumlah Baris Matriks a : ");
    int barisA = input.nextInt();
    System.out.print("Jumlah kolom Matriks a : ");
    int kolomA = input.nextInt();
    System.out.println();
    System.out.println("Matrik B");
    System.out.print("Jumlah kolom Matriks b : ");
    int kolomB = input.nextInt();
    
    int[][] A = new int[barisA][kolomA];
    int[][] B = new int[kolomA][kolomB];
    
    System.out.println("Nilai Matriks A");
    System.out.println();
    for (int i = 0; i < A.length; i++) {
        for (int j=0; j<A[i].length; j++){
            System.out.print("Matrik indeks ke"+i+","+j+" : ");
            A[i][j] = input.nextInt();   
        }
    }    
    System.out.println("Nilai Matriks B");
    System.out.println();
    for (int i = 0; i < B.length; i++) {
        for (int j=0; j<B[i].length; j++){
            System.out.print("Matrik indeks ke"+i+","+j+" : ");
            B[i][j] = input.nextInt();   
        }
    }    
    System.out.println("Matriks A");
    for (int i = 0; i < A.length; i++) {
        for (int j=0; j<A[i].length; j++){
            System.out.print(A[i][j]+"\t");
        }
        System.out.println();
    }    
    
    System.out.println("Matriks B");
    for (int i = 0; i < B.length; i++) {
        for (int j=0; j<B[i].length; j++){
            System.out.print(B[i][j]+"\t");
        }
        System.out.println();
    } 
    
    int [][] hasil = new int[barisA][kolomB];
    
   for (int i=0; i<A.length; i++){
        for (int j=0; j<B[i].length; j++) {
            for (int k=0; k < A[i].length; k++){
               hasil[i][j] = hasil[i][j] + (A[i][k] * B[k][j]);
            }
        }
    } 
    System.out.println(" Matriks A x B");
    for (int i = 0; i < A.length; i++) {
        for (int j=0; j<B[i].length; j++){
            System.out.print(hasil[i][j]+"\t");
        }
        System.out.println();
    }
    
  }
}
 

