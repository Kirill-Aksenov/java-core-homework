package com.company.lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainClassTest {

    private MainClass mainClass;

    @BeforeEach
    public void initial() {
        mainClass = new MainClass();
    }

    @ParameterizedTest
    @MethodSource("parameterizedTestOne")
    void getValuesAfterLastFour(int[] originalArray, int[] expectedResultArray) {
        int[] actualResultArray = mainClass.getsValueAfterFour(originalArray);
        Assertions.assertArrayEquals(expectedResultArray, actualResultArray);
    }

    private static Stream<Arguments> parameterizedTestOne() {
        List<Arguments> arguments = new ArrayList<Arguments>() {{
            add(Arguments.arguments(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[]{1, 7}));
            add(Arguments.arguments(new int[]{1, 2, 4}, new int[0]));
            add(Arguments.arguments(new int[]{4, 2, 6, 5, 0}, new int[]{2, 6, 5, 0}));
            add(Arguments.arguments(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[]{1, 7}));
        }};
        return arguments.stream();
    }

    @Test
    public void testGetsValueAfterFour() {
        Assertions.assertThrows(RuntimeException.class, () -> mainClass.getsValueAfterFour(new int[]{1, 2, 6, 5}));
    }

    @ParameterizedTest
    @MethodSource("parameterizedTestTwo")
    void findFourOrOneNumberInArray(int[] array, boolean expectedResult) {
        boolean actualResult = mainClass.checkOneAndFourInArray(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    private static Stream<Arguments> parameterizedTestTwo() {
        List<Arguments> arguments = new ArrayList<Arguments>() {{
            add(Arguments.arguments(new int[]{1, 1, 1, 4, 4, 1, 4, 4}, true));
            add(Arguments.arguments(new int[]{1, 1, 1, 1, 1, 1}, false));
            add(Arguments.arguments(new int[]{4, 4, 4, 4}, false));
            add(Arguments.arguments(new int[]{1, 4, 4, 1, 1, 4, 3}, false));
        }};
        return arguments.stream();
    }
}
