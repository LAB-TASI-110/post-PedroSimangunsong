package driver;

import java.util.*;
import model.Model1;

public class Driver1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Model1> list = new ArrayList<>();

        while (true) {
            String kode = sc.nextLine();

            if (kode.equals("END")) {
                break;
            }

            double berat = sc.nextDouble();
            sc.nextLine();

            Model1 p = new Model1(kode, berat);
            list.add(p);
        }

        double totalButet = 0;
        double totalUcok = 0;
        double totalBerat = 0;
        double totalOngkir = 0;
        boolean adaLuarPulau = false;

        for (Model1 p : list) {
            totalButet += p.getBeratButet();
            totalUcok += p.getBeratUcok();
            totalBerat += p.getTotalBerat();
            totalOngkir += p.getTotalOngkir();

            if (p.isLuarPulau()) {
                adaLuarPulau = true;
            }
        }

        boolean dapatPromo = (totalBerat > 10) && adaLuarPulau;
        double diskon = dapatPromo ? 0.1 * totalOngkir : 0;
        double totalBayar = totalOngkir - diskon;

        // OUTPUT
        System.out.println("===== STRUK PEMBAYARAN =====");

        System.out.println("Kota tujuan:");
        for (Model1 p : list) {
            System.out.println("- " + p.getInfoKota());
        }

        System.out.println("Berat paket Butet: " + totalButet + " kg");
        System.out.println("Berat paket Ucok: " + totalUcok + " kg");
        System.out.println("Total berat: " + totalBerat + " kg");

        System.out.println("Total ongkos kirim: " + totalOngkir);

        if (dapatPromo) {
            System.out.println("Diskon: 10% (" + diskon + ")");
            System.out.println("Total bayar: " + totalBayar);
            System.out.println("Promo:");
            System.out.println("- Diskon 10%");
            System.out.println("- Asuransi gratis");
        } else {
            System.out.println("Total bayar: " + totalOngkir);
            System.out.println("Promo: Tidak ada");
        }
    }
}