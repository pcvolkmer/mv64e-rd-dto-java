package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RDDiagnosisFamilyControlLevelCodingCode {
    DUO_GENOME, SINGLE_GENOME, TRIO_GENOME;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DUO_GENOME: return "duo-genome";
            case SINGLE_GENOME: return "single-genome";
            case TRIO_GENOME: return "trio-genome";
        }
        return null;
    }

    @JsonCreator
    public static RDDiagnosisFamilyControlLevelCodingCode forValue(String value) throws IOException {
        if (value.equals("duo-genome")) return DUO_GENOME;
        if (value.equals("single-genome")) return SINGLE_GENOME;
        if (value.equals("trio-genome")) return TRIO_GENOME;
        throw new IOException("Cannot deserialize RDDiagnosisFamilyControlLevelCodingCode");
    }
}
