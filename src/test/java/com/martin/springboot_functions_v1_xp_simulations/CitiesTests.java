package com.martin.springboot_functions_v1_xp_simulations;

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

    @Test
    public void findCityInformation_callsFindCityMuseums_InSameClass_withPassThroughArg() {
        String input = "FLorence";
        String[] expected = new String[]{"Uffizi", "Galleria dell'Academia"};
        cities.findCityInformation(input);
        Cities citiesSpy = Mockito.spy(cities);

        citiesSpy.findCityInformation(input);

        verify(citiesSpy, times(1)).findCityMuseums(input);
    }

    @Test
    public void findCityInformation_callsFindCityHotels_InSameClass_withPassThroughArg() {
        String input = "FLorence";
        String[] expected = new String[]{"Hotel Uff Z", "Hotel Galleria C"};
        cities.findCityInformation(input);
        Cities citiesSpy = Mockito.spy(cities);

        citiesSpy.findCityInformation(input);

        verify(citiesSpy, times(1)).findCityHotels(input);
    }


}
