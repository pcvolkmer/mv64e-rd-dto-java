package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum HPOTermStatusCodingCode {
    ABATED, DEGRADED, IMPROVED, UNCHANGED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ABATED: return "abated";
            case DEGRADED: return "degraded";
            case IMPROVED: return "improved";
            case UNCHANGED: return "unchanged";
        }
        return null;
    }

    @JsonCreator
    public static HPOTermStatusCodingCode forValue(String value) throws IOException {
        if (value.equals("abated")) return ABATED;
        if (value.equals("degraded")) return DEGRADED;
        if (value.equals("improved")) return IMPROVED;
        if (value.equals("unchanged")) return UNCHANGED;
        throw new IOException("Cannot deserialize HPOTermStatusCodingCode");
    }
}
