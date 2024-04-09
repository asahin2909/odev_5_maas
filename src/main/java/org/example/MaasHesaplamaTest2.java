package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaasHesaplamaTest2 {

    @ParameterizedTest
    @MethodSource("veriKaynagi")
    public void testMaasHesaplama(int calisanGun, int expectedMaas) {
        int actualMaas = MaasHesaplama.maasHesapla(calisanGun);
        assertEquals(expectedMaas, actualMaas);
    }

    public static Stream<Arguments> veriKaynagi() {
        return Stream.of(
                Arguments.of(20, 20000),  // 20 gün için maaş: 20 * 1000 = 20000 TL
                Arguments.of(30, 35000),  // 30 gün için maaş: (25 * 1000) + (5 * 2000) = 35000 TL
                Arguments.of(40, 45000)   // 40 gün için maaş: (25 * 1000) + (15 * 2000) = 45000 TL
        );
    }
}
