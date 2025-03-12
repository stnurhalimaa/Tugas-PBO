import java.util.Scanner;

public class SubProgram {

    public static int maxab(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static int[] tukar(int a, int b) { 
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};  
    }

    public static void main(String[] args) {
        int a, b;
        Scanner masukan = new Scanner(System.in);

        System.out.println("Maksimum dua bilangan");
        System.out.print("Ketikkan dua bilangan, pisahkan dengan ENTER: ");

        a = masukan.nextInt();
        b = masukan.nextInt();

        System.out.println("Ke dua bilangan: a = " + a + " b = " + b);
        System.out.println("Maksimum = " + maxab(a, b));

        System.out.println("Tukar kedua bilangan...");
        int[] swapped = tukar(a, b); 
        System.out.println("Ke dua bilangan setelah tukar: a = " + swapped[0] + " b = " + swapped[1]);
        
        masukan.close();
    }
}
