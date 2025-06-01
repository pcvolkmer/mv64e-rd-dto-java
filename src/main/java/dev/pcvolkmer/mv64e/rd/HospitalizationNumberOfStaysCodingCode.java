package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum HospitalizationNumberOfStaysCodingCode {
    NONE, OVER_FIFTEEN, UNKNOWN, UP_TO_FIFTEEN, UP_TO_FIVE, UP_TO_TEN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NONE: return "none";
            case OVER_FIFTEEN: return "over-fifteen";
            case UNKNOWN: return "unknown";
            case UP_TO_FIFTEEN: return "up-to-fifteen";
            case UP_TO_FIVE: return "up-to-five";
            case UP_TO_TEN: return "up-to-ten";
        }
        return null;
    }

    @JsonCreator
    public static HospitalizationNumberOfStaysCodingCode forValue(String value) throws IOException {
        if (value.equals("none")) return NONE;
        if (value.equals("over-fifteen")) return OVER_FIFTEEN;
        if (value.equals("unknown")) return UNKNOWN;
        if (value.equals("up-to-fifteen")) return UP_TO_FIFTEEN;
        if (value.equals("up-to-five")) return UP_TO_FIVE;
        if (value.equals("up-to-ten")) return UP_TO_TEN;
        throw new IOException("Cannot deserialize HospitalizationNumberOfStaysCodingCode");
    }
}
