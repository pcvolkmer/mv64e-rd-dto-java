package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ClinicalManagementRecommendationCodingCode {
    DISEASE_SPECIFIC_AMBULATORY_CARE, GP, LOCAL_CRD, OTHER_AMBULATORY_CARE, OTHER_CRD, SPECIALIST, UNIVERSITY_AMBULATORY_CARE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DISEASE_SPECIFIC_AMBULATORY_CARE: return "disease-specific-ambulatory-care";
            case GP: return "gp";
            case LOCAL_CRD: return "local-crd";
            case OTHER_AMBULATORY_CARE: return "other-ambulatory-care";
            case OTHER_CRD: return "other-crd";
            case SPECIALIST: return "specialist";
            case UNIVERSITY_AMBULATORY_CARE: return "university-ambulatory-care";
        }
        return null;
    }

    @JsonCreator
    public static ClinicalManagementRecommendationCodingCode forValue(String value) throws IOException {
        if (value.equals("disease-specific-ambulatory-care")) return DISEASE_SPECIFIC_AMBULATORY_CARE;
        if (value.equals("gp")) return GP;
        if (value.equals("local-crd")) return LOCAL_CRD;
        if (value.equals("other-ambulatory-care")) return OTHER_AMBULATORY_CARE;
        if (value.equals("other-crd")) return OTHER_CRD;
        if (value.equals("specialist")) return SPECIALIST;
        if (value.equals("university-ambulatory-care")) return UNIVERSITY_AMBULATORY_CARE;
        throw new IOException("Cannot deserialize ClinicalManagementRecommendationCodingCode");
    }
}
