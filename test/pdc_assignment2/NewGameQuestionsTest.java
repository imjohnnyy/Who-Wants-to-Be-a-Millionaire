/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */

public class NewGameQuestionsTest {
    
    public NewGameQuestionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getQuestion method, of class NewGameQuestions.
     */
    @Test
    public void testGetQuestion() {
        System.out.println("getQuestion");
        int round = 0;
        NewGameQuestions instance = new NewGameQuestions();
        String expResult = "1. In the hisory of motor sport, which of these iconic races was held first? - D\"; tory of motor sport, which of these iconic races was held first? - D";
        String result = instance.getQuestion(round);
        assertEquals(expResult, result);

    }

    /**
     * Test of getAnswer method, of class NewGameQuestions.
     */
    @Test
    public void testGetAnswer() {
        System.out.println("getAnswer");
        int round = 0;
        NewGameQuestions instance = new NewGameQuestions();
        String expResult = "??";
        String result = instance.getAnswer(round);
        assertEquals(expResult, result);

    }

    /**
     * Test of ansOptionsA method, of class NewGameQuestions.
     */
    @Test
    public void testAnsOptionsA() {
        System.out.println("ansOptionsA");
        int round = 0;
        NewGameQuestions instance = new NewGameQuestions();
        String expResult = "A: Le Mans 24 Hours";
        String result = instance.ansOptionsA(round);
        assertEquals(expResult, result);

    }

    /**
     * Test of ansOptionsB method, of class NewGameQuestions.
     */
    @Test
    public void testAnsOptionsB() {
        System.out.println("ansOptionsB");
        int round = 0;
        NewGameQuestions instance = new NewGameQuestions();
        String expResult = "B: Monaco Grand Prix";
        String result = instance.ansOptionsB(round);
        assertEquals(expResult, result);

    }

    /**
     * Test of ansOptionsC method, of class NewGameQuestions.
     */
    @Test
    public void testAnsOptionsC() {
        System.out.println("ansOptionsC");
        int round = 0;
        NewGameQuestions instance = new NewGameQuestions();
        String expResult = "C: Indy 500";
        String result = instance.ansOptionsC(round);
        assertEquals(expResult, result);

    }

    /**
     * Test of ansOptionsD method, of class NewGameQuestions.
     */
    @Test
    public void testAnsOptionsD() {
        System.out.println("ansOptionsD");
        int round = 0;
        NewGameQuestions instance = new NewGameQuestions();
        String expResult = "D: Isle of Man TT";
        String result = instance.ansOptionsD(round);
        assertEquals(expResult, result);

    }

    /**
     * Test of resultAns method, of class NewGameQuestions.
     */
    @Test
    public void testResultAns() {
        System.out.println("resultAns");
        String input = "";
        int round = 0;
        NewGameQuestions instance = new NewGameQuestions();
        String expResult = "Incorrect";
        String result = instance.resultAns(input, round);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of resultBoolean method, of class NewGameQuestions.
     */
    @Test
    public void testResultBoolean() {
        System.out.println("resultBoolean");
        String input = "";
        int round = 0;
        NewGameQuestions instance = new NewGameQuestions();
        boolean expResult = false;
        boolean result = instance.resultBoolean(input, round);
        assertEquals(expResult, result);

    }
    
}
