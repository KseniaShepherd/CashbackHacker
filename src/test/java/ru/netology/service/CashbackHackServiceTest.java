package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(9010);
        assertEquals(actual, expected);
    }
}