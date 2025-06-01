package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum VariantModeOfInheritanceCodingCode {
    DOMINANT, MITOCHONDRIAL, RECESSIVE, UNCLEAR, X_LINKED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DOMINANT: return "dominant";
            case MITOCHONDRIAL: return "mitochondrial";
            case RECESSIVE: return "recessive";
            case UNCLEAR: return "unclear";
            case X_LINKED: return "X-linked";
        }
        return null;
    }

    @JsonCreator
    public static VariantModeOfInheritanceCodingCode forValue(String value) throws IOException {
        if (value.equals("dominant")) return DOMINANT;
        if (value.equals("mitochondrial")) return MITOCHONDRIAL;
        if (value.equals("recessive")) return RECESSIVE;
        if (value.equals("unclear")) return UNCLEAR;
        if (value.equals("X-linked")) return X_LINKED;
        throw new IOException("Cannot deserialize VariantModeOfInheritanceCodingCode");
    }
}
