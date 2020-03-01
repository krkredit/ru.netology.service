package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

//    @Test
//    void chouldReturn100IfAmount900() {
//        CashbackHackService service = new CashbackHackService();
//        int amount = 900;
//
//        int actual = service.remain(amount);
//        int expected = 100;
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    void chouldReturnZeroIfAmount1000() {
//        CashbackHackService service = new CashbackHackService();
//        int amount = 1000;
//
//        int actual = service.remain(amount);
//        int expected = 0;
//
//        assertEquals(actual, expected);
//    }
//
//    @Test
//    void chouldReturn800IfAmount1200() {
//        CashbackHackService service = new CashbackHackService();
//        int amount = 1200;
//
//        int actual = service.remain(amount);
//        int expected = 800;
//
//        assertEquals(actual, expected);
//    }

    @ParameterizedTest // вместо @Test
    @CsvFileSource(resources = "/CashbackHackServiceTest.csv", numLinesToSkip = 1)
    void shouldCalculateBonus(int amount, int expected, String message) {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual, message);
    }
}