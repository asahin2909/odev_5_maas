package org.example;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MaasHesaplamaTest {

    public static void main(String[] args) {
        try {
            // Yapılandırma dosyasını yükle
            Properties config = loadConfig("config.properties");

            // Çalışan gün sayısını yapılandırmadan al
            int calisanGun = Integer.parseInt(config.getProperty("calisan_gun"));

            // Testi yap
            testMaasHesaplama(calisanGun);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testMaasHesaplama(int calisanGun) {
        // Test mesajı
        System.out.println("Test: " + calisanGun + " gün için maaş hesaplanıyor...");

        // Maaş hesapla
        int maas = MaasHesaplama.maasHesapla(calisanGun);

        // Sonucu ekrana yazdır
        System.out.println("Toplam maaş: " + maas + " TL");
    }

    public static Properties loadConfig(String filePath) throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(filePath);
        properties.load(fis);
        fis.close();
        return properties;
    }
}
