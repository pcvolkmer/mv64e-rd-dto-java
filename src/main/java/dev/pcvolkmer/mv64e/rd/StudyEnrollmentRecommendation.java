package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class StudyEnrollmentRecommendation {
    private String id;
    private Date issuedOn;
    private Reference patient;
    private List<StudyReference> study;
    private List<GeneAlterationReference> supportingVariants;

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

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("study")
    public List<StudyReference> getStudy() { return study; }
    @JsonProperty("study")
    public void setStudy(List<StudyReference> value) { this.study = value; }

    @JsonProperty("supportingVariants")
    public List<GeneAlterationReference> getSupportingVariants() { return supportingVariants; }
    @JsonProperty("supportingVariants")
    public void setSupportingVariants(List<GeneAlterationReference> value) { this.supportingVariants = value; }
}
