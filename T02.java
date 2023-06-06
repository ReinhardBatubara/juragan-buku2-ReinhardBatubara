// 12S22012 - Reinhard Batubara.
// 12S22038 - Ade Yohana Azeka Siahaan.

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        String judul;
        String penulis;
        
        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        String tahunterbit;
        
        tahunterbit = input.nextLine();
        String penerbit;
        String formatbuku;
        
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        double hargapembelian;
        double minimummargin;
        
        hargapembelian = input.nextDouble();
        minimummargin = input.nextDouble();
        int stok;
        
        stok = input.nextInt();
        double rating;
        
        rating = input.nextDouble();
        String kategori;
        
        kategori = " ";
        if (rating >= 4.7) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kategori = "Average";
                    } else {
                        if (rating < 3.0) {
                            kategori = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori);
    }
}
