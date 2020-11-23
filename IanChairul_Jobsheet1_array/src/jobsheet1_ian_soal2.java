import java.util.Scanner;
public class jobsheet1_ian_soal2 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(" input string !  ");
    String strInput = input.nextLine().toLowerCase();
    
    char[]charInput = strInput.toCharArray();
    int jmVokal = 0;
    int t =0;
    for ( char huruf:charInput){
        if(huruf=='a' || huruf=='i'|| huruf=='u'|| huruf=='e'|| huruf=='o'){
            jmVokal++; t =charInput.length - jmVokal;
        }
    } System.out.println(" jumlah huruf vokal  = " + jmVokal);
    System.out.println(" jumlah huruf konsonan =" +t);
}
}
