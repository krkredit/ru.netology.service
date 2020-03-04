package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {


    @ParameterizedTest // вместо @Test
    @CsvFileSource(resources = "/CashbackHackServiceTest.csv", numLinesToSkip = 1)
    void shouldCalculateBonus(int amount, int expected, String message) {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual, message);
    }
}