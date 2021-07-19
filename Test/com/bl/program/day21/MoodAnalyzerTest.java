package com.bl.program.day21;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyzerTest {
    public static enum moodType{NULL, EMPTY,}

    @Test
    public void analyzeMood() {
        try {
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
            assertEquals("Happy", moodAnalyzer.analyzeMood());
        } catch (CustomException e) {System.out.println(e.getMessage());}
    }

    @Test
    void analyzeSadMoodTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        try {
            assertEquals("SAD", moodAnalyzer.analyzeMood());
        } catch (CustomException e) {System.out.println(e.getMessage());}
    }

    @Test
    void analyzeNullMoodTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try {
            assertEquals("SAD", moodAnalyzer.analyzeMood());
        } catch (CustomException e) {System.out.println(e.getMessage());}
    }

    @Test
    void analyzeEmptyMoodTest() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try {
            assertEquals("SAD", moodAnalyzer.analyzeMood());
        } catch (CustomException e) {System.out.println(e.getMessage());}
    }

}
