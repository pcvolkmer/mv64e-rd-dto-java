package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class CopyNumberVariant {
    private ACMGClassCoding acmgClass;
    private List<CopyNumberVariantAcmgCriterion> acmgCriteria;
    private String cDnaChange;
    private Chromosome chromosome;
    private long endPosition;
    private List<CopyNumberVariantExternalId> externalIds;
    private String gDnaChange;
    private List<Coding> genes;
    private String id;
    private List<BaseVariantLocalizationCoding> localization;
    private VariantModeOfInheritanceCoding modeOfInheritance;
    private Reference patient;
    private String proteinChange;
    private List<PublicationReference> publications;
    private VariantSegregationAnalysisCoding segregationAnalysis;
    private VariantSignificanceCoding significance;
    private long startPosition;
    private CopyNumberVariantCoding type;
    private VariantZygosityCoding zygosity;

    @JsonProperty("acmgClass")
    public ACMGClassCoding getAcmgClass() { return acmgClass; }
    @JsonProperty("acmgClass")
    public void setAcmgClass(ACMGClassCoding value) { this.acmgClass = value; }

    @JsonProperty("acmgCriteria")
    public List<CopyNumberVariantAcmgCriterion> getAcmgCriteria() { return acmgCriteria; }
    @JsonProperty("acmgCriteria")
    public void setAcmgCriteria(List<CopyNumberVariantAcmgCriterion> value) { this.acmgCriteria = value; }

    @JsonProperty("cDNAChange")
    public String getCDnaChange() { return cDnaChange; }
    @JsonProperty("cDNAChange")
    public void setCDnaChange(String value) { this.cDnaChange = value; }

    @JsonProperty("chromosome")
    public Chromosome getChromosome() { return chromosome; }
    @JsonProperty("chromosome")
    public void setChromosome(Chromosome value) { this.chromosome = value; }

    @JsonProperty("endPosition")
    public long getEndPosition() { return endPosition; }
    @JsonProperty("endPosition")
    public void setEndPosition(long value) { this.endPosition = value; }

    @JsonProperty("externalIds")
    public List<CopyNumberVariantExternalId> getExternalIds() { return externalIds; }
    @JsonProperty("externalIds")
    public void setExternalIds(List<CopyNumberVariantExternalId> value) { this.externalIds = value; }

    @JsonProperty("gDNAChange")
    public String getGDnaChange() { return gDnaChange; }
    @JsonProperty("gDNAChange")
    public void setGDnaChange(String value) { this.gDnaChange = value; }

    @JsonProperty("genes")
    public List<Coding> getGenes() { return genes; }
    @JsonProperty("genes")
    public void setGenes(List<Coding> value) { this.genes = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("localization")
    public List<BaseVariantLocalizationCoding> getLocalization() { return localization; }
    @JsonProperty("localization")
    public void setLocalization(List<BaseVariantLocalizationCoding> value) { this.localization = value; }

    @JsonProperty("modeOfInheritance")
    public VariantModeOfInheritanceCoding getModeOfInheritance() { return modeOfInheritance; }
    @JsonProperty("modeOfInheritance")
    public void setModeOfInheritance(VariantModeOfInheritanceCoding value) { this.modeOfInheritance = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("proteinChange")
    public String getProteinChange() { return proteinChange; }
    @JsonProperty("proteinChange")
    public void setProteinChange(String value) { this.proteinChange = value; }

    @JsonProperty("publications")
    public List<PublicationReference> getPublications() { return publications; }
    @JsonProperty("publications")
    public void setPublications(List<PublicationReference> value) { this.publications = value; }

    @JsonProperty("segregationAnalysis")
    public VariantSegregationAnalysisCoding getSegregationAnalysis() { return segregationAnalysis; }
    @JsonProperty("segregationAnalysis")
    public void setSegregationAnalysis(VariantSegregationAnalysisCoding value) { this.segregationAnalysis = value; }

    @JsonProperty("significance")
    public VariantSignificanceCoding getSignificance() { return significance; }
    @JsonProperty("significance")
    public void setSignificance(VariantSignificanceCoding value) { this.significance = value; }

    @JsonProperty("startPosition")
    public long getStartPosition() { return startPosition; }
    @JsonProperty("startPosition")
    public void setStartPosition(long value) { this.startPosition = value; }

    @JsonProperty("type")
    public CopyNumberVariantCoding getType() { return type; }
    @JsonProperty("type")
    public void setType(CopyNumberVariantCoding value) { this.type = value; }

    @JsonProperty("zygosity")
    public VariantZygosityCoding getZygosity() { return zygosity; }
    @JsonProperty("zygosity")
    public void setZygosity(VariantZygosityCoding value) { this.zygosity = value; }
}
