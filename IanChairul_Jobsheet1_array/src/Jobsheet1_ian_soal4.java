import java.util.Scanner;
public class Jobsheet1_ian_soal4 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" input string !  ");
    String strInput = input.nextLine();
        char[]charInput = strInput.toCharArray();  
    for (int j=1;  j<= charInput.length; j++) {
        System.out.print(charInput[charInput.length-j]);
    }
     System.out.println(" ");
    }
}
