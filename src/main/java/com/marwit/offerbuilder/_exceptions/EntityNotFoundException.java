package com.marwit.offerbuilder._exceptions;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String entityType, String entityId) {
        super("Could not find "+ entityType + " with id=" + entityId);
    }
}
