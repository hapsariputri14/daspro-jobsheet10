import java.util.Scanner;

public class BioskopWithScanner23 {

    public static void main(String[] args) {
        // Deklarasikan variabel Scanner
        Scanner sc = new Scanner(System.in);

        // Deklarasikan variable baris dan kolom bertipe int serta nama dan next bertipe String.
        int baris, kolom;
        String nama, next;

        // Buat array bertipe String dengan nama penonton dengan 4 baris dan 2 kolom
        String[][] penonton = new String[4][2];

        // Gunakan scanner untuk mengisi elemen pada array penonton
        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();

            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();

            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            // Masukkan nama penonton ke array
            penonton[baris - 1][kolom - 1] = nama;

            // Tampilkan pertanyaan apakah ingin menambahkan penonton lagi
            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            // Jika jawabannya "n", maka keluar dari loop
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
