package model;

public class Model1 {

    private String kodeKota;
    private String namaKota;
    private double beratButet;
    private double beratUcok;
    private double totalBerat;
    private double ongkirPerKg;
    private double totalOngkir;
    private boolean luarPulau;

    
    public Model1(String kodeKota, double beratButet) {
        this.kodeKota = kodeKota;
        this.beratButet = beratButet;

        // hitung berat ucok
        this.beratUcok = (3.0 / 2.0) * beratButet;

        // tentukan kota
        switch (kodeKota) {
            case "MDN":
                namaKota = "Medan";
                ongkirPerKg = 8000;
                luarPulau = false;
                break;
            case "BLG":
                namaKota = "Balige";
                ongkirPerKg = 5000;
                luarPulau = false;
                break;
            case "JKT":
                namaKota = "Jakarta";
                ongkirPerKg = 12000;
                luarPulau = true;
                break;
            case "SBY":
                namaKota = "Surabaya";
                ongkirPerKg = 13000;
                luarPulau = true;
                break;
        }

        this.totalBerat = beratButet + beratUcok;
        this.totalOngkir = totalBerat * ongkirPerKg;
    }

    // getter
    public double getBeratButet() {
        return beratButet;
    }

    public double getBeratUcok() {
        return beratUcok;
    }

    public double getTotalBerat() {
        return totalBerat;
    }

    public double getTotalOngkir() {
        return totalOngkir;
    }

    public boolean isLuarPulau() {
        return luarPulau;
    }

    public String getInfoKota() {
        return kodeKota + " (" + namaKota + ")";
    }
}