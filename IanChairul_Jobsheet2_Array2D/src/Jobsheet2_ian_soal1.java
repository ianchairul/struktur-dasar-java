import java.util.Random;
 
public class Jobsheet2_ian_soal1{
    public static void main(String[] args){
        for (int i=0; i<10; i++){
            for (int j=0;j<10; j++){
                Random r = new Random();
                //Proses mengacak huruf dengan cara random 26 huruf A=65
                char huruf = (char) (r.nextInt(26)+'A');
                System.out.print(huruf+" ");
            }
            System.out.println();
        }
    }
}