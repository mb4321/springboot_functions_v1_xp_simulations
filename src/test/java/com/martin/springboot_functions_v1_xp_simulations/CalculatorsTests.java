package com.martin.springboot_functions_v1_xp_simulations;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorsTests {

    @InjectMocks
    private Calculators calculators;

    @Test
    public void addTwoNumbers_adds2and3() {
        int input1 = 2;
        int input2 = 3;
        int expected = 5;
        int actual = calculators.addTwoNumbers(input1, input2);
        assertEquals(expected, actual);
    }

    @Test
    public void addTwoNumbers_addsMinus10andPlus6() {
        int input1 = -10;
        int input2 = 6;
        int expected = -4;
        int actual = calculators.addTwoNumbers(input1, input2);
        assertEquals(expected, actual);
    }
}
