package cn.shaojiel.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilTest {

    @Test
    void isOdd() {
        assertFalse(NumberUtil.isOdd(0));
        assertTrue(NumberUtil.isOdd(1));
        assertTrue(NumberUtil.isOdd(-1));
        assertFalse(NumberUtil.isOdd(2));
        assertFalse(NumberUtil.isOdd(-2));
    }

    @Test
    void isOdd_Better() {
        assertFalse(NumberUtil.isOdd_Better(0));
        assertTrue(NumberUtil.isOdd_Better(1));
        assertTrue(NumberUtil.isOdd_Better(-1));
        assertFalse(NumberUtil.isOdd_Better(2));
        assertFalse(NumberUtil.isOdd_Better(-2));
    }
}