package morkaragh.dashboard.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultColorTest {

    @Test
    void getNext() {
        DefaultColor color = new DefaultColor();
        boolean gotLast = false;
        for (int i = 0; i < DefaultColor.DEFAULT_COLORS.length*5; i++) {
            if (color.getNext().getHex().equals(DefaultColor.DEFAULT_COLORS[DefaultColor.DEFAULT_COLORS.length - 1])){
                gotLast = true;
            }
        }
        assertTrue(gotLast);
    }
}