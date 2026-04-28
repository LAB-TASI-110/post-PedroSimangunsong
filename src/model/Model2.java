package model;

public class Model2 {

    private int[] stok;

   
    public Model2(int[] stok) {
        this.stok = stok;
    }

    public int hitungTotalKategori(int kategori) {
        int total = 0;

        for (int i = 0; i < stok.length; i++) {
            int posisi = i + 1;

            if (kategori == 1 && posisi % 4 == 1) {
                total += stok[i];
            } else if (kategori == 2 && posisi % 4 == 2) {
                total += stok[i];
            } else if (kategori == 3 && posisi % 4 == 3) {
                total += stok[i];
            } else if (kategori == 4 && posisi % 4 == 0) {
                total += stok[i];
            }
        }

        return total;
    }
}