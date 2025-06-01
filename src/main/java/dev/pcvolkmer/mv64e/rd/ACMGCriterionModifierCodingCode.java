package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ACMGCriterionModifierCodingCode {
    BA, BM, BP, BS, PM, PP, PS, PVS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BA: return "ba";
            case BM: return "bm";
            case BP: return "bp";
            case BS: return "bs";
            case PM: return "pm";
            case PP: return "pp";
            case PS: return "ps";
            case PVS: return "pvs";
        }
        return null;
    }

    @JsonCreator
    public static ACMGCriterionModifierCodingCode forValue(String value) throws IOException {
        if (value.equals("ba")) return BA;
        if (value.equals("bm")) return BM;
        if (value.equals("bp")) return BP;
        if (value.equals("bs")) return BS;
        if (value.equals("pm")) return PM;
        if (value.equals("pp")) return PP;
        if (value.equals("ps")) return PS;
        if (value.equals("pvs")) return PVS;
        throw new IOException("Cannot deserialize ACMGCriterionModifierCodingCode");
    }
}
