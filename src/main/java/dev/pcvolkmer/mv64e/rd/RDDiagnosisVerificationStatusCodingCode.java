package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RDDiagnosisVerificationStatusCodingCode {
    CONFIRMED, PARTIAL, PROVISIONAL, UNCONFIRMED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CONFIRMED: return "confirmed";
            case PARTIAL: return "partial";
            case PROVISIONAL: return "provisional";
            case UNCONFIRMED: return "unconfirmed";
        }
        return null;
    }

    @JsonCreator
    public static RDDiagnosisVerificationStatusCodingCode forValue(String value) throws IOException {
        if (value.equals("confirmed")) return CONFIRMED;
        if (value.equals("partial")) return PARTIAL;
        if (value.equals("provisional")) return PROVISIONAL;
        if (value.equals("unconfirmed")) return UNCONFIRMED;
        throw new IOException("Cannot deserialize RDDiagnosisVerificationStatusCodingCode");
    }
}
