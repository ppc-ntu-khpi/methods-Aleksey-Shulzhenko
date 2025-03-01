package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        System.out.println("Evil numbers in range [" + start + ", " + end + "]: " + Exercise.Calculate(start, end));
    }
}
