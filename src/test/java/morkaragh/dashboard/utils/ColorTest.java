package morkaragh.dashboard.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorTest {


    @Test
    public void hexJson() throws JsonProcessingException {
        Color color = new Color(255, 255, 255);
        assertEquals("\"#ffffff\"",new ObjectMapper().writeValueAsString(color));
    }

}