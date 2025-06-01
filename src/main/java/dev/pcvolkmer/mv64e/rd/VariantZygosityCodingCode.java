package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum VariantZygosityCodingCode {
    COMP_HET, HEMI, HETEROPLASMIC, HETEROZYGOUS, HOMOPLASMIC, HOMOZYGOUS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMP_HET: return "comp-het";
            case HEMI: return "hemi";
            case HETEROPLASMIC: return "heteroplasmic";
            case HETEROZYGOUS: return "heterozygous";
            case HOMOPLASMIC: return "homoplasmic";
            case HOMOZYGOUS: return "homozygous";
        }
        return null;
    }

    @JsonCreator
    public static VariantZygosityCodingCode forValue(String value) throws IOException {
        if (value.equals("comp-het")) return COMP_HET;
        if (value.equals("hemi")) return HEMI;
        if (value.equals("heteroplasmic")) return HETEROPLASMIC;
        if (value.equals("heterozygous")) return HETEROZYGOUS;
        if (value.equals("homoplasmic")) return HOMOPLASMIC;
        if (value.equals("homozygous")) return HOMOZYGOUS;
        throw new IOException("Cannot deserialize VariantZygosityCodingCode");
    }
}
