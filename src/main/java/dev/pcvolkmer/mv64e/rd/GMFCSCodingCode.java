package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum GMFCSCodingCode {
    I, II, III, IV, V;

    @JsonValue
    public String toValue() {
        switch (this) {
            case I: return "I";
            case II: return "II";
            case III: return "III";
            case IV: return "IV";
            case V: return "V";
        }
        return null;
    }

    @JsonCreator
    public static GMFCSCodingCode forValue(String value) throws IOException {
        if (value.equals("I")) return I;
        if (value.equals("II")) return II;
        if (value.equals("III")) return III;
        if (value.equals("IV")) return IV;
        if (value.equals("V")) return V;
        throw new IOException("Cannot deserialize GMFCSCodingCode");
    }
}
