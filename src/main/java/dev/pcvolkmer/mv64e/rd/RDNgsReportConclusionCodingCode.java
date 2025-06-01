package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RDNgsReportConclusionCodingCode {
    NO_PATHOGENIC_VARIANT_DETECTED, PARTIAL_PHENOTYPE, STRUCTURAL_VARIANT_WITH_UNCLEAR_BREAKPOINT, UNCLEAR_VARIANT_IN_DISEASE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NO_PATHOGENIC_VARIANT_DETECTED: return "no-pathogenic-variant-detected";
            case PARTIAL_PHENOTYPE: return "partial-phenotype";
            case STRUCTURAL_VARIANT_WITH_UNCLEAR_BREAKPOINT: return "structural-variant-with-unclear-breakpoint";
            case UNCLEAR_VARIANT_IN_DISEASE: return "unclear-variant-in-disease";
        }
        return null;
    }

    @JsonCreator
    public static RDNgsReportConclusionCodingCode forValue(String value) throws IOException {
        if (value.equals("no-pathogenic-variant-detected")) return NO_PATHOGENIC_VARIANT_DETECTED;
        if (value.equals("partial-phenotype")) return PARTIAL_PHENOTYPE;
        if (value.equals("structural-variant-with-unclear-breakpoint")) return STRUCTURAL_VARIANT_WITH_UNCLEAR_BREAKPOINT;
        if (value.equals("unclear-variant-in-disease")) return UNCLEAR_VARIANT_IN_DISEASE;
        throw new IOException("Cannot deserialize RDNgsReportConclusionCodingCode");
    }
}
