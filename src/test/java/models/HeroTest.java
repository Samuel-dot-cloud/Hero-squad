package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void heroCreatesInstanceOfHero_true() throws Exception {
        Hero hero=setUpNewHero();
        assertEquals(true,hero instanceof Hero);
    }

    private Hero setUpNewHero() {
        return new Hero("Superman", 24, "strength", "kryptonite");
    }
}