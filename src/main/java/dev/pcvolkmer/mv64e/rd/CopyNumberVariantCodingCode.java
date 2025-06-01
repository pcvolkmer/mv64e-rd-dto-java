package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CopyNumberVariantCodingCode {
    GAIN, LOSS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case GAIN: return "gain";
            case LOSS: return "loss";
        }
        return null;
    }

    @JsonCreator
    public static CopyNumberVariantCodingCode forValue(String value) throws IOException {
        if (value.equals("gain")) return GAIN;
        if (value.equals("loss")) return LOSS;
        throw new IOException("Cannot deserialize CopyNumberVariantCodingCode");
    }
}
