/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian chairul
 */
public class jobsheet3_ian_soal1 {
     public static void main(String[] args) {
        int[] A={12,15,7,10,25,2,17,25,5,20};
        int max=A[0];
        int jmlmax=0;
        String posisiindeks="";
        for (int i=0; i<A.length;i++){
            if (max<A[i])
                max=A[i];
        }
        for (int i=0; i<A.length;i++){
            if (max==A[i]){
                jmlmax++;
                posisiindeks=posisiindeks+"["+i+"]";            
            }
        }
        System.out.println("nilai Max          = "+max);
        System.out.println("jumlah             = "+jmlmax);
        System.out.println("terletak di Indeks = "+posisiindeks);
    }
}
