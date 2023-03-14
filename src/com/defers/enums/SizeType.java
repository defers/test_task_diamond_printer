package com.defers.enums;

public enum SizeType {
    HEIGHT("height"),
    WIDTH("width");

    private String value;

    SizeType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
