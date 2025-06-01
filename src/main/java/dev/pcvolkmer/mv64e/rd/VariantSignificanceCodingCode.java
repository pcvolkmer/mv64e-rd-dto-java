package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum VariantSignificanceCodingCode {
    CANDIDATE, INCIDENTAL, PRIMARY;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CANDIDATE: return "candidate";
            case INCIDENTAL: return "incidental";
            case PRIMARY: return "primary";
        }
        return null;
    }

    @JsonCreator
    public static VariantSignificanceCodingCode forValue(String value) throws IOException {
        if (value.equals("candidate")) return CANDIDATE;
        if (value.equals("incidental")) return INCIDENTAL;
        if (value.equals("primary")) return PRIMARY;
        throw new IOException("Cannot deserialize VariantSignificanceCodingCode");
    }
}
