package com.martin.springboot_functions_v1_xp_simulations;

public class Cities {
    private Calculators calculators;

    public void findCityInformation(String city) {
        findCityMuseums(city);
        findCityHotels(city);
    }

    public void findCityMuseums(String city) {

    }

    public void findCityHotels(String city) {

    }

    public void calculateCityNameData(String city) {
        calculators.calculateStringLength(city);
        calculators.calculateStringInitialCharacter(city);
    }
}
