package driver;

import java.util.*;
import model.Model3;

public class Driver3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Model3> pesanan = new ArrayList<>();

        while (true) {
            String menu = sc.nextLine();

            if (menu.equals("END")) {
                break;
            }

            int jumlah = sc.nextInt();
            sc.nextLine();

            Model3 p = new Model3(menu, jumlah);
            pesanan.add(p);
        }

        int totalBayar = 0;

        System.out.println("===== STRUK KAFETARIA =====");

        for (Model3 p : pesanan) {
            System.out.println(p.getDetail());
            totalBayar += p.getTotal();
        }

        System.out.println("--------------------------");
        System.out.println("Total Bayar: " + totalBayar);
    }
}