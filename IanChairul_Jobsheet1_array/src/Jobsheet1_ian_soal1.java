
import java.util.Scanner;

public class Jobsheet1_ian_soal1 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
  System.out.print("Masukkan Panjang array: ");
  int panjangArray = input.nextInt();
  int[] x = new int [panjangArray];
  for (int j=0; j<panjangArray;j++) {
  System.out.print("Masukkan Indeks Array ke-"+j+": ");
  x[j]= input.nextInt();
  }
  int Jum = 0;
  System.out.print ("Nilai array: "); 
  for (int isiArray:x){
      System.out.print ( isiArray+", ");
      Jum = Jum + isiArray ; 
  }
  System.out.println ();
  System.out.print ("Total: "+Jum);
  System.out.println ();
  System.out.print("Rata-rata : "+(double)Jum/x.length);
  System.out.println ();
  }
}    
    
   

