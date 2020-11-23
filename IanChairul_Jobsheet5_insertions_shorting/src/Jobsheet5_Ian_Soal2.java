
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
public class Jobsheet5_Ian_Soal2 {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         System.out.print("panjang array = ");
         int panjangArray=input.nextInt();
         System.out.println("input nilai array = ");
         int a[]= new int [panjangArray];
          for (int j=0; j<panjangArray;j++) {
      a[j]=input.nextInt();}System.out.println();
          int n = a.length;
		for (int j = 1; j < n; j++) {
			int key = a[j];
			int i = j-1;
			while ( (i > -1) && ( a [i] > key ) ) {
				a [i+1] = a [i];
				i--;
			} 
                        System.out.println("Proses pegurutan data "+j);
                       
			a[i+1] = key;
			for (i=0; i<a.length; i++)
                            System.out.print(a[i]+" ");
                        System.out.println("\t");
    }
    }
}
