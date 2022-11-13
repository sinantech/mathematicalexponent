import java.util.Scanner;

public class KuvvetProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi Giriniz");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i *= 2){
            System.out.println(i);
        }
    }
}
