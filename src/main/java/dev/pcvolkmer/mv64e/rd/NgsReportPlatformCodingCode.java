package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NgsReportPlatformCodingCode {
    ILLU, MGI, ONT, OTHER, PACB, CODE_10_XG, UG;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ILLU: return "illu";
            case MGI: return "mgi";
            case ONT: return "ont";
            case OTHER: return "other";
            case PACB: return "pacb";
            case CODE_10_XG: return "10xg";
            case UG: return "ug";
        }
        return null;
    }

    @JsonCreator
    public static NgsReportPlatformCodingCode forValue(String value) throws IOException {
        if (value.equals("illu")) return ILLU;
        if (value.equals("mgi")) return MGI;
        if (value.equals("ont")) return ONT;
        if (value.equals("other")) return OTHER;
        if (value.equals("pacb")) return PACB;
        if (value.equals("10xg")) return CODE_10_XG;
        if (value.equals("ug")) return UG;
        throw new IOException("Cannot deserialize NgsReportPlatformCodingCode");
    }
}
