package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum VariantSegregationAnalysisCodingCode {
    DE_NOVO, FROM_FATHER, FROM_MOTHER, NOT_PERFORMED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DE_NOVO: return "de-novo";
            case FROM_FATHER: return "from-father";
            case FROM_MOTHER: return "from-mother";
            case NOT_PERFORMED: return "not-performed";
        }
        return null;
    }

    @JsonCreator
    public static VariantSegregationAnalysisCodingCode forValue(String value) throws IOException {
        if (value.equals("de-novo")) return DE_NOVO;
        if (value.equals("from-father")) return FROM_FATHER;
        if (value.equals("from-mother")) return FROM_MOTHER;
        if (value.equals("not-performed")) return NOT_PERFORMED;
        throw new IOException("Cannot deserialize VariantSegregationAnalysisCodingCode");
    }
}
