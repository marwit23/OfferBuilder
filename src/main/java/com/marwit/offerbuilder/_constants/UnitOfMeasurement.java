package com.marwit.offerbuilder._constants;

public enum UnitOfMeasurement {

    MILIMETRE("mm"),
    METRE("m"),
    TON9("t"),
    METERS_PER_MINUTE("m/min");

    private final String displayValue;

    UnitOfMeasurement(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
