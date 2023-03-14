package com.defers.service;

public class DiamondPrinterImpl implements DiamondPrinter {
    private int height;
    private int width;
    private int cursorLeft;
    private int cursorRight;
    private StringBuilder line;
    private static final String PATTERN = "#";
    private static final String SPACE_PATTERN = " ";

    public DiamondPrinterImpl(int height, int width) {
        this.height = height;
        this.width = width;
        this.line = new StringBuilder(SPACE_PATTERN.repeat(width));
    }

    @Override
    public void print() {
        var halfHeight = height / 2;
        var halfWidth = width / 2;
        cursorLeft = halfWidth + 1;
        cursorRight = halfWidth;
        var offset = 0;

        for (var i = 0; i < height; i++) {

            if (i == 0 || i == height - 1) printFirstAndLastLine(halfWidth);
            else printBodyLine(cursorLeft, cursorRight);

            offset = defineOffset(halfHeight, halfWidth, i);
            moveCursors(offset);
        }
    }

    private void moveCursors(int offset) {
        cursorLeft = Math.max(cursorLeft - offset, 1);
        cursorRight = Math.min(cursorRight + offset, width - 1);
    }

    private int defineOffset(int halfHeight, int halfWidth, int currentPosition) {
        var offset = 0;
        if (currentPosition > halfHeight - 1
                && (height - currentPosition) <= halfWidth + 1 ) {
            offset = -1;
        }
        else {
            offset = 1;
        }
        return offset;
    }

    private void printBodyLine(int cursorLeft, int cursorRight) {
        line.replace(cursorRight, cursorRight + 1, PATTERN);
        line.replace(cursorLeft - 1, cursorLeft, PATTERN);
        System.out.println(line);
        line.replace(cursorRight, cursorRight + 1, SPACE_PATTERN);
        line.replace(cursorLeft - 1, cursorLeft, SPACE_PATTERN);
    }

    private void printFirstAndLastLine(int position) {
        line.replace(position, position+1, PATTERN);
        System.out.println(line);
        line.replace(position, position+1, SPACE_PATTERN);
    }

}
