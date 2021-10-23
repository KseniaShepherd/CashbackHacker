package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        assertEquals(actual, expected);
    }
}