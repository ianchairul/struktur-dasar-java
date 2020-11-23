
import java.util.Scanner;

public class Jobsheet2_ian_soal2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
          System.out.print(" jml baris = ");
          int jmlba = input.nextInt();
          System.out.print(" jml kolom = ");
          int jmlko = input.nextInt();
        int [][] m1 = new int [jmlba][jmlko];
         int [][] m2 = new int [jmlba][jmlko];
        for (int i=0; i<jmlba; i++){
            for (int j=0; j<jmlko; j++){
                System.out.print(" masukan matriks ke 1 ["+i+"] ["+j+"] : ");
                m1[i][j]=input.nextInt();} System.out.println()           
        }; for (int i=0; i<jmlba; i++){
            for (int j=0; j<jmlko; j++){
                System.out.print(" masukan matriks ke 2 ["+i+"] ["+j+"] : ");
                 m2[i][j]=input.nextInt();    
            }
            System.out.println(" ");
        }
         System.out.println("matriks =");
            for (int i=0; i<m1.length; i++){
                for (int j=0; j<m1[i].length; j++){
                    System.out.print(m1[i][j]+ "\t");
            }
        System.out.println();
        
    }    
     System.out.println("matriks 2=");
            for (int i=0; i<m2.length; i++){
                for (int j=0; j<m2[i].length; j++){
                    System.out.print(m2[i][j]+ "\t");
            }
        System.out.println();
            }  
       System.out.println("jumlah matriks =");
            for (int i=0; i<m2.length; i++){
                for (int j=0; j<m2[i].length; j++){
                    System.out.print(m1[i][j]+m2[i][j]+ "\t");
            }
        System.out.println();
            }      
    }
}
