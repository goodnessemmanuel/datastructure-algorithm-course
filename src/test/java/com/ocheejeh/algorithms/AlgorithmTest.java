package com.ocheejeh.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {
    Algorithm algorithm;

    @BeforeEach
    void init(){
        algorithm  = new Algorithm();
    }

    @Test
    void bracketsPairShouldMatch() {
        assertAll(
                () -> assertEquals("valid", algorithm.matchingBrackets("[{}]")),
                () -> assertEquals("valid", algorithm.matchingBrackets("(()())")),
                () -> assertEquals("invalid", algorithm.matchingBrackets("[}")),
                () -> assertEquals("invalid", algorithm.matchingBrackets("[()]))()")),
                () -> assertEquals("valid", algorithm.matchingBrackets("[]{}({})"))
        );
    }

    @Test
    void shouldMatchBracketPairsUsingAStack() {
        assertAll(
                () -> assertEquals("valid", algorithm.matchingBracketsStack("[{}]")),
                () -> assertEquals("valid", algorithm.matchingBracketsStack("(()())")),
                () -> assertEquals("invalid", algorithm.matchingBracketsStack("[}")),
                () -> assertEquals("invalid", algorithm.matchingBracketsStack("[()]))()")),
                () -> assertEquals("valid", algorithm.matchingBracketsStack("[]{}({})"))
        );
    }
}