package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;

public class StructuralVariantAcmgCriterion {
    private ACMGCriterionModifierCoding modifier;
    private ACMGCriterionCoding value;

    @JsonProperty("modifier")
    public ACMGCriterionModifierCoding getModifier() { return modifier; }
    @JsonProperty("modifier")
    public void setModifier(ACMGCriterionModifierCoding value) { this.modifier = value; }

    @JsonProperty("value")
    public ACMGCriterionCoding getValue() { return value; }
    @JsonProperty("value")
    public void setValue(ACMGCriterionCoding value) { this.value = value; }
}
