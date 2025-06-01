package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum HospitalizationNumberOfDaysCodingCode {
    NONE, OVER_FIFTY, UNKNOWN, UP_TO_FIFTY, UP_TO_FIVE, UP_TO_FIFTEEN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NONE: return "none";
            case OVER_FIFTY: return "over-fifty";
            case UNKNOWN: return "unknown";
            case UP_TO_FIFTY: return "up-to-fifty";
            case UP_TO_FIVE: return "up-to-five";
            case UP_TO_FIFTEEN: return "up-to-fifteen";
        }
        return null;
    }

    @JsonCreator
    public static HospitalizationNumberOfDaysCodingCode forValue(String value) throws IOException {
        if (value.equals("none")) return NONE;
        if (value.equals("over-fifty")) return OVER_FIFTY;
        if (value.equals("unknown")) return UNKNOWN;
        if (value.equals("up-to-fifty")) return UP_TO_FIFTY;
        if (value.equals("up-to-five")) return UP_TO_FIVE;
        if (value.equals("up-to-fifteen")) return UP_TO_FIFTEEN;
        throw new IOException("Cannot deserialize HospitalizationNumberOfDaysCodingCode");
    }
}
