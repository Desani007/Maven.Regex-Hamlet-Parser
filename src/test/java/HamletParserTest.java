import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        Assert.assertNotEquals(hamletText,hamletParser.replaceHamelt());

    }

    @Test
    public void testChangeHoratioToTariq() {
        Assert.assertNotEquals(hamletText,hamletParser.replaceTariq());


    }

    @Test
    public void testFindHoratio() {
        Assert.assertTrue(hamletParser.findHoratio());
        hamletParser.replaceTariq();
        Assert.assertFalse(hamletParser.findHoratio());

    }

    @Test
    public void testFindHamlet() {
        Assert.assertTrue(hamletParser.findHamlet());
        hamletParser.replaceHamelt();
        assertFalse(hamletParser.findHamlet());

    }
}