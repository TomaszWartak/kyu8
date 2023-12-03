package pl.dev4lazy.duplicate_encoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateEncoderTest {
    @Test
    public void encode() {
        assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }
}