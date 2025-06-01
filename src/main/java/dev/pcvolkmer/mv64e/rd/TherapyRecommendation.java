package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class TherapyRecommendation {
    private RDTherapyCategoryCoding category;
    private String id;
    private Date issuedOn;
    private List<Coding> medication;
    private Reference patient;
    private List<GeneAlterationReference> supportingVariants;
    private RDTherapyCoding type;

    @JsonProperty("category")
    public RDTherapyCategoryCoding getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(RDTherapyCategoryCoding value) { this.category = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("issuedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getIssuedOn() { return issuedOn; }
    @JsonProperty("issuedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setIssuedOn(Date value) { this.issuedOn = value; }

    @JsonProperty("medication")
    public List<Coding> getMedication() { return medication; }
    @JsonProperty("medication")
    public void setMedication(List<Coding> value) { this.medication = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("supportingVariants")
    public List<GeneAlterationReference> getSupportingVariants() { return supportingVariants; }
    @JsonProperty("supportingVariants")
    public void setSupportingVariants(List<GeneAlterationReference> value) { this.supportingVariants = value; }

    @JsonProperty("type")
    public RDTherapyCoding getType() { return type; }
    @JsonProperty("type")
    public void setType(RDTherapyCoding value) { this.type = value; }
}
