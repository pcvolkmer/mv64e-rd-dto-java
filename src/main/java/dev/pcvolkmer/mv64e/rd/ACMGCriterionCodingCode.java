package dev.pcvolkmer.mv64e.rd;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ACMGCriterionCodingCode {
    BA1, BP1, BP2, BP3, BP4, BP5, BP6, BP7, BS1, BS2, BS3, BS4, PM1, PM2, PM3, PM4, PM5, PM6, PP1, PP2, PP3, PP4, PP5, PS1, PS2, PS3, PS4, PVS1;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BA1: return "BA1";
            case BP1: return "BP1";
            case BP2: return "BP2";
            case BP3: return "BP3";
            case BP4: return "BP4";
            case BP5: return "BP5";
            case BP6: return "BP6";
            case BP7: return "BP7";
            case BS1: return "BS1";
            case BS2: return "BS2";
            case BS3: return "BS3";
            case BS4: return "BS4";
            case PM1: return "PM1";
            case PM2: return "PM2";
            case PM3: return "PM3";
            case PM4: return "PM4";
            case PM5: return "PM5";
            case PM6: return "PM6";
            case PP1: return "PP1";
            case PP2: return "PP2";
            case PP3: return "PP3";
            case PP4: return "PP4";
            case PP5: return "PP5";
            case PS1: return "PS1";
            case PS2: return "PS2";
            case PS3: return "PS3";
            case PS4: return "PS4";
            case PVS1: return "PVS1";
        }
        return null;
    }

    @JsonCreator
    public static ACMGCriterionCodingCode forValue(String value) throws IOException {
        if (value.equals("BA1")) return BA1;
        if (value.equals("BP1")) return BP1;
        if (value.equals("BP2")) return BP2;
        if (value.equals("BP3")) return BP3;
        if (value.equals("BP4")) return BP4;
        if (value.equals("BP5")) return BP5;
        if (value.equals("BP6")) return BP6;
        if (value.equals("BP7")) return BP7;
        if (value.equals("BS1")) return BS1;
        if (value.equals("BS2")) return BS2;
        if (value.equals("BS3")) return BS3;
        if (value.equals("BS4")) return BS4;
        if (value.equals("PM1")) return PM1;
        if (value.equals("PM2")) return PM2;
        if (value.equals("PM3")) return PM3;
        if (value.equals("PM4")) return PM4;
        if (value.equals("PM5")) return PM5;
        if (value.equals("PM6")) return PM6;
        if (value.equals("PP1")) return PP1;
        if (value.equals("PP2")) return PP2;
        if (value.equals("PP3")) return PP3;
        if (value.equals("PP4")) return PP4;
        if (value.equals("PP5")) return PP5;
        if (value.equals("PS1")) return PS1;
        if (value.equals("PS2")) return PS2;
        if (value.equals("PS3")) return PS3;
        if (value.equals("PS4")) return PS4;
        if (value.equals("PVS1")) return PVS1;
        throw new IOException("Cannot deserialize ACMGCriterionCodingCode");
    }
}
