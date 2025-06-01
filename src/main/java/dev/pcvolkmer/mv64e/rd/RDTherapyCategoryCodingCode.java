package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RDTherapyCategoryCodingCode {
    CAUSAL, SYMPTOMATIC;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CAUSAL: return "causal";
            case SYMPTOMATIC: return "symptomatic";
        }
        return null;
    }

    @JsonCreator
    public static RDTherapyCategoryCodingCode forValue(String value) throws IOException {
        if (value.equals("causal")) return CAUSAL;
        if (value.equals("symptomatic")) return SYMPTOMATIC;
        throw new IOException("Cannot deserialize RDTherapyCategoryCodingCode");
    }
}
