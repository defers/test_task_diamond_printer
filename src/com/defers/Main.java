package com.defers;

import com.defers.enums.SizeType;
import com.defers.service.DiamondPrinter;
import com.defers.service.DiamondPrinterImpl;
import com.defers.util.ConsoleUtils;

public class Main {

    public static void main(String[] args) {
        int height = ConsoleUtils.getConsoleInput(SizeType.HEIGHT);
        int width = ConsoleUtils.getConsoleInput(SizeType.WIDTH);
        Main.printDiamond(height, width);
    }

    private static void printDiamond(int height, int width) {
        DiamondPrinter dm = new DiamondPrinterImpl(height, width);
        dm.print();
    }
}
