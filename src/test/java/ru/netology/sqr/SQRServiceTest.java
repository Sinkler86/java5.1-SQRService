package ru.netology.sqr;

import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    public int shouldNumberOfSQR(int minRange, int maxRange) {
        int sqrtNumber = 0;
        for (int i = 10; i <= 99; i++) {
            if (minRange <= i * i && i * i <= maxRange) {
                System.out.println("*** i= " + i + ", i**2 = " + i * i + "\n");
                sqrtNumber++;
            }
        }
        return sqrtNumber;
    }
}