package driver;

import java.util.*;
import model.Model2;

public class Driver2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input jumlah data
        int N = sc.nextInt();

        int[] stok = new int[N];

        // input stok
        for (int i = 0; i < N; i++) {
            stok[i] = sc.nextInt();
        }

        // input kategori
        int kategori = sc.nextInt();

        Model2 rak = new Model2(stok);

        int hasil = rak.hitungTotalKategori(kategori);

        System.out.println("Total stok kategori " + kategori + " = " + hasil);
    }
}