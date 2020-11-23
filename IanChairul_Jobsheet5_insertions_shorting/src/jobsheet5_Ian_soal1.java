


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian chairul
 */
public class jobsheet5_Ian_soal1 {
    public static void main(String[] args) {
         System.out.println("nilai array = ");
         int a[]= {15,12,4,5,6,7,3,55,67,78,53};
          for (int j=0; j<a.length;j++) {
              System.out.print(a[j]+"\t");
          }System.out.println("\t");
              System.out.println("proses pengurutan data");System.out.println("\t");
   
          int n = a.length;
		for (int j = 1; j < n; j++) {
			int key = a[j];
			int i = j-1;
			while ( (i > -1) && ( a [i] > key ) ) {
				a [i+1] = a [i];
				i--;
			} 
                                            
			a[i+1] = key;
			for (i=0; i<a.length; i++)
                            System.out.print(a[i]+" ");
                        System.out.println("\t");
    }
    }
}
