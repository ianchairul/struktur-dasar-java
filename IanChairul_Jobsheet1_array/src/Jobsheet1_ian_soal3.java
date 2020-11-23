
  import java.util.Scanner;
public class Jobsheet1_ian_soal3 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(" input string !  ");
    String strInput = input.nextLine().toLowerCase();
    char[]charInput = strInput.toCharArray();
    int[] 
    JML = new int[5];
    for ( char huruf:charInput){
        if(huruf=='a') JML[0]++;
        if(huruf=='i') JML[1]++;
        if(huruf=='u') JML[2]++;
        if(huruf=='e') JML[3]++;
        if(huruf=='o') JML[4]++;
    } 
     System.out.println(" jumlah huruf A  = " + JML[0]);
 System.out.println(" jumlah huruf I  = " + JML[1]);
 System.out.println(" jumlah huruf U  = " + JML[2]);
 System.out.println(" jumlah huruf E  = " + JML[3]);
 System.out.println(" jumlah huruf P  = " + JML[4]);

}
   
}
