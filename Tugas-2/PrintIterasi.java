import java.util.Scanner;

public class PrintIterasi {

    public static void main(String[] args) {

        int N;
        int i;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Nilai N > 0 = "); // Inisialisasi
        N = masukan.nextInt();
        i = 1; 

        System.out.println("Print i dengan ITERATE: ");
        for (;;) {
            System.out.println(i);
            if (i == N) {
                break; 
            } else {
                i++; 
            }
        }

        masukan.close(); // Menutup Scanner
    }
}
