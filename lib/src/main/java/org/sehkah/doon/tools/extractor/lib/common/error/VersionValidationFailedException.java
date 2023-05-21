package org.sehkah.doon.tools.extractor.lib.common.error;

import org.sehkah.doon.tools.extractor.lib.logic.ClientResourceFile;

public class VersionValidationFailedException extends TechnicalException {
    public VersionValidationFailedException() {
    }

    public VersionValidationFailedException(long encounteredVersion, long expectedVersion) {
        super("Encountered version '%s' does not equal expected '%s'.".formatted(encounteredVersion, expectedVersion));
    }

    public VersionValidationFailedException(ClientResourceFile clientResourceFile) {
        super("Version validation failed for client resource '%s'.".formatted(clientResourceFile));
    }

    public VersionValidationFailedException(String message) {
        super(message);
    }

    public VersionValidationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public VersionValidationFailedException(Throwable cause) {
        super(cause);
    }

    public VersionValidationFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
