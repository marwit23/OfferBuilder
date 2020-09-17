package com.marwit.offerbuilder._constants;

public enum ValueScope {

    PLUS_MINUS("+/-");

    private final String displayValue;

    ValueScope(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
