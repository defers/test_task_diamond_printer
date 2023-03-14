package com.defers.util;

import com.defers.enums.SizeType;
import com.defers.exception.ValidValueException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUtils {

    private ConsoleUtils(){}

    public static int getConsoleInput(SizeType sizeType) {
        var scanner = new Scanner(System.in);
        System.out.println(String.format("Enter value of %s: ", sizeType));
        var value = 0;
        try {
            value = scanner.nextInt();
        } catch(InputMismatchException e) {
            throw new ValidValueException("Value must be >= 1 and <= 80");
        }
        validValue(value);

        return value;
    }

    private static void validValue(int value) {
        if (value < 1 || value > 80) {
            throw new ValidValueException("Value must be >= 1 and <= 80");
        }
    }
}
