package com.marwit.offerbuilder._constants;

public enum Operator {

    EQUALS("="),
    MORE_THAN(">"),
    LESS_THAN("<"),
    MORE_OR_EQUALS(">="),
    LESS_OR_EQUALS("<=");

    private final String displayValue;

    Operator(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
