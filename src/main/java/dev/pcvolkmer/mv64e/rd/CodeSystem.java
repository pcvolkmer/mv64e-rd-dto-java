package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CodeSystem {
    BFARM_DE_DE_KODIERSYSTEME_TERMINOLOGIEN_ALPHA_ID_SE, ORPHA_NET, FHIR_DE_CODE_SYSTEM_BFARM_ICD_10_GM;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BFARM_DE_DE_KODIERSYSTEME_TERMINOLOGIEN_ALPHA_ID_SE: return "https://www.bfarm.de/DE/Kodiersysteme/Terminologien/Alpha-ID-SE";
            case ORPHA_NET: return "https://www.orpha.net";
            case FHIR_DE_CODE_SYSTEM_BFARM_ICD_10_GM: return "http://fhir.de/CodeSystem/bfarm/icd-10-gm";
        }
        return null;
    }

    @JsonCreator
    public static CodeSystem forValue(String value) throws IOException {
        if (value.equals("https://www.bfarm.de/DE/Kodiersysteme/Terminologien/Alpha-ID-SE")) return BFARM_DE_DE_KODIERSYSTEME_TERMINOLOGIEN_ALPHA_ID_SE;
        if (value.equals("https://www.orpha.net")) return ORPHA_NET;
        if (value.equals("http://fhir.de/CodeSystem/bfarm/icd-10-gm")) return FHIR_DE_CODE_SYSTEM_BFARM_ICD_10_GM;
        throw new IOException("Cannot deserialize CodeSystem");
    }
}
