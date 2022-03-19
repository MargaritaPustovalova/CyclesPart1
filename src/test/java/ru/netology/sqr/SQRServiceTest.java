package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqrCount() {
        SQRService service = new SQRService();
        int count  = 25;
        int expected = 3;

        int actual = service.sqrCount(count);

        assertEquals(expected, actual);
    }
    }
