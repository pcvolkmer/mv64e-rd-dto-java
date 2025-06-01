package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RDDiagnosisMissingCodeReasonCodingCode {
    NO_MATCHING_CODE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NO_MATCHING_CODE: return "no-matching-code";
        }
        return null;
    }

    @JsonCreator
    public static RDDiagnosisMissingCodeReasonCodingCode forValue(String value) throws IOException {
        if (value.equals("no-matching-code")) return NO_MATCHING_CODE;
        throw new IOException("Cannot deserialize RDDiagnosisMissingCodeReasonCodingCode");
    }
}
