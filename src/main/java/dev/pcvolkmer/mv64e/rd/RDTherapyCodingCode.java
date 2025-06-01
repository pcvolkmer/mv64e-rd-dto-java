package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RDTherapyCodingCode {
    COMBINATION, EARLY_DETECTION, GENETIC, NUTRITION, OTHER, PREVENTION_MEDICATION, PROPHYLACTIC, SYSTEMIC_MEDICATION, TARGETED_MEDICATION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMBINATION: return "combination";
            case EARLY_DETECTION: return "early-detection";
            case GENETIC: return "genetic";
            case NUTRITION: return "nutrition";
            case OTHER: return "other";
            case PREVENTION_MEDICATION: return "prevention-medication";
            case PROPHYLACTIC: return "prophylactic";
            case SYSTEMIC_MEDICATION: return "systemic-medication";
            case TARGETED_MEDICATION: return "targeted-medication";
        }
        return null;
    }

    @JsonCreator
    public static RDTherapyCodingCode forValue(String value) throws IOException {
        if (value.equals("combination")) return COMBINATION;
        if (value.equals("early-detection")) return EARLY_DETECTION;
        if (value.equals("genetic")) return GENETIC;
        if (value.equals("nutrition")) return NUTRITION;
        if (value.equals("other")) return OTHER;
        if (value.equals("prevention-medication")) return PREVENTION_MEDICATION;
        if (value.equals("prophylactic")) return PROPHYLACTIC;
        if (value.equals("systemic-medication")) return SYSTEMIC_MEDICATION;
        if (value.equals("targeted-medication")) return TARGETED_MEDICATION;
        throw new IOException("Cannot deserialize RDTherapyCodingCode");
    }
}
