import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmMhs];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int lulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }

        System.out.println("Rata-rata nilai lulus : " + (lulus > 0 ? totalLulus / lulus : 0.0));
        System.out.println("Rata-rata nilai tidak lulus : " + ((nilaiMhs.length - lulus) > 0 ? totalTidakLulus / (nilaiMhs.length - lulus) : 0.0));
        System.out.println("Jumlah mahasiswa yang lulus = " + lulus);
    }
}
    
