package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Results {
    private Autozygosity autozygosity;
    private List<CopyNumberVariant> copyNumberVariants;
    private List<SmallVariant> smallVariants;
    private List<StructuralVariant> structuralVariants;

    @JsonProperty("autozygosity")
    public Autozygosity getAutozygosity() { return autozygosity; }
    @JsonProperty("autozygosity")
    public void setAutozygosity(Autozygosity value) { this.autozygosity = value; }

    @JsonProperty("copyNumberVariants")
    public List<CopyNumberVariant> getCopyNumberVariants() { return copyNumberVariants; }
    @JsonProperty("copyNumberVariants")
    public void setCopyNumberVariants(List<CopyNumberVariant> value) { this.copyNumberVariants = value; }

    @JsonProperty("smallVariants")
    public List<SmallVariant> getSmallVariants() { return smallVariants; }
    @JsonProperty("smallVariants")
    public void setSmallVariants(List<SmallVariant> value) { this.smallVariants = value; }

    @JsonProperty("structuralVariants")
    public List<StructuralVariant> getStructuralVariants() { return structuralVariants; }
    @JsonProperty("structuralVariants")
    public void setStructuralVariants(List<StructuralVariant> value) { this.structuralVariants = value; }
}
