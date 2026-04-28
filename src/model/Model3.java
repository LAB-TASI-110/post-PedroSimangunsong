package model;

public class Model3 {

    private String namaMenu;
    private int jumlah;
    private int harga;
    private int total;

    public Model3(String namaMenu, int jumlah) {
        this.namaMenu = namaMenu;
        this.jumlah = jumlah;

        // tentukan harga
        switch (namaMenu.toLowerCase()) {
            case "kopi":
                harga = 5000;
                break;
            case "teh":
                harga = 4000;
                break;
            case "bakwan":
                harga = 2000;
                break;
            case "tempe":
                harga = 3000;
                break;
            case "tahu":
                harga = 2500;
                break;
            default:
                harga = 0;
        }

        this.total = harga * jumlah;
    }

    public int getTotal() {
        return total;
    }

    public String getDetail() {
        return namaMenu + " x" + jumlah + " = " + total;
    }
}