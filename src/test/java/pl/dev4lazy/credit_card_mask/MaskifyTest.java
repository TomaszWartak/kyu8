package pl.dev4lazy.credit_card_mask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaskifyTest {
    @Test
    public void testSolution() {
        assertEquals("############5616", Maskify.maskify("4556364607935616"));
        assertEquals("#######5616",      Maskify.maskify(     "64607935616"));
        assertEquals("1",                Maskify.maskify(               "1"));
        assertEquals("",                 Maskify.maskify(                ""));

        // "What was the name of your first pet?"
        assertEquals("##ippy",                                    Maskify.maskify("Skippy")                                  );
        assertEquals("####################################man!",  Maskify.maskify("Nananananananananananananananana Batman!"));
    }

    @Test
    void maskify() {
        assertEquals("####1234", Maskify.maskify("12341234"));
    }
}