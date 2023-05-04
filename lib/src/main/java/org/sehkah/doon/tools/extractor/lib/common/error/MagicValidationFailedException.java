package org.sehkah.doon.tools.extractor.lib.common.error;

public class MagicValidationFailedException extends BusinessException {
    public MagicValidationFailedException() {
    }

    public MagicValidationFailedException(String encounteredMagic, String expectedMagic) {
        super("Encountered magic value '%s' does not equal expected '%s'.".formatted(encounteredMagic, expectedMagic));
    }

    public MagicValidationFailedException(String message) {
        super(message);
    }

    public MagicValidationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MagicValidationFailedException(Throwable cause) {
        super(cause);
    }

    public MagicValidationFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
