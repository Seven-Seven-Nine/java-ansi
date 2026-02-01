package org.sevensevennine.console.ansi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit тест для библиотеки ANSI.
 */
public class ANSITest {
  @Test void testColoredWithValidParameters() {
        String result = ANSI.modify("Test", "green", "bold");
        
        assertTrue(result.startsWith("\033["));
        assertTrue(result.contains("Test"));
        assertTrue(result.endsWith("\033[0m"));
    }

    @Test void testColoredWithInvalidColor() {
        String result = ANSI.modify("Test", "invalid", "bold");
        assertEquals("Test", result);
    }

    @Test void testColoredWithInvalidStyle() {
        String result = ANSI.modify("Test", "green", "invalid");
        assertEquals("Test", result);
    }
}
