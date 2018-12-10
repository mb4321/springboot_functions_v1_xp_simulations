package com.martin.springboot_functions_v1_xp_simulations;

import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CitiesTests {

    @InjectMocks
    private Cities cities;

    @Mock
    private Calculators calculators;

    public void findCityInformation_callsFindCityMuseums_InSameClass_withPassThroughArg() {
        String input = "FLorence";
        cities.findCityInformation(input);
        Cities citiesSpy = Mockito.spy(cities);

        citiesSpy.findCityInformation(input);

        verify(citiesSpy, times(1)).findCityMuseums(input);
    }

    @Test
    public void findCityInformation_callsFindCityHotels_InSameClass_withPassThroughArg() {
        String input = "FLorence";
        cities.findCityInformation(input);
        Cities citiesSpy = Mockito.spy(cities);

        citiesSpy.findCityInformation(input);

        verify(citiesSpy, times(1)).findCityHotels(input);
    }

    @Test
    public void calculateCityNameData_callsCalculateStringLength_InOtherClass_withPassThroughArg() {
        String input = "Athens";

        cities.calculateCityNameData(input);

        verify(calculators, times(1)).calculateStringLength(input);
    }

    @Test
    public void calculateCityNameData_callsCalculateStringInitialCharacter_InOtherClass_withPassThroughArg() {
        String input = "Paris";

        cities.calculateCityNameData(input);

        verify(calculators, times(1)).calculateStringInitialCharacter(input);
    }


}
