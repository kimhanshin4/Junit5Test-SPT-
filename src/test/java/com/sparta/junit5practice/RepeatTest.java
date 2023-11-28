package com.sparta.junit5practice;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class RepeatTest {
    @RepeatedTest(value = 5, name = "반복 테스트 {currentRepetition} / {totalRepetitions}")
    void repeatTest(RepetitionInfo info) {
        System.out.println("테스트 반복 : " + info.getCurrentRepetition() + " / " + info.getTotalRepetitions());
    }
    @DisplayName("파라미터 값 활용하여 테스트 하기")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    void parameterTest(int num) {
        System.out.println("5 * num = " + 5 * num);
    }
}
