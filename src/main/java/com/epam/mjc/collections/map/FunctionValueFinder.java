package com.epam.mjc.collections.map;

import java.util.*;


//Implement the program which gets List<Integer> and required value as parameter,
// creates Map<Integer, Integer> and determines if required value is present among Map values.
//The key of Map - element from List<Integer>, value - value of function 5x+2 for element from List<Integer>

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        boolean presentValue = functionMap.containsValue(requiredValue);

        return presentValue;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> result = new LinkedHashMap<>();

        for (Integer element : sourceList) {
            result.put(element, 5 * element + 2);
        }
        return result;
    }


    public static void main(String[] args) {
        FunctionValueFinder fvf = new FunctionValueFinder();
        List<Integer> sourceList = Arrays.asList(-1, 5, 4, 8);
        int value = 27;

        fvf.isFunctionValuePresent(sourceList, value);
    }
}
