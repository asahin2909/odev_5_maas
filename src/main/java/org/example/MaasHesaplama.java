package org.example;

import java.util.Scanner;

public class MaasHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int calisanGun;

        do {
            System.out.print("Personelin bu ay kaç gün çalıştığını giriniz: ");
            calisanGun = scanner.nextInt();

            if (calisanGun <= 31) {
                int maas = maasHesapla(calisanGun);
                System.out.println("Toplam maaş: " + maas + " TL");
            } else {
                System.out.println("1 ay içinde var olan gün sayısı 31'den büyük olamaz. Lütfen gün sayısını kontrol ediniz."); //Gün sayısı kontrolünü fazladan koydum hocam :)
            }
        } while (calisanGun > 31);
    }

    public static int maasHesapla(int calisanGun) {
        int maasGunluk = 1000; // Günlük maaş
        int toplamMaas = calisanGun * maasGunluk; // Toplam maaş

        if (calisanGun > 25) {
            int ekstraGunSayisi = calisanGun - 25; // Ekstra gün sayısı
            int ekstraPrim = ekstraGunSayisi * 1000; // Ekstra prim
            toplamMaas += ekstraPrim; // Toplam maaşa ekstra primi ekle
        }

        return toplamMaas;
    }
}