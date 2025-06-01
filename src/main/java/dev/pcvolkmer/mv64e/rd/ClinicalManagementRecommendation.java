package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class ClinicalManagementRecommendation {
    private String id;
    private Date issuedOn;
    private List<String> notes;
    private Reference patient;
    private ClinicalManagementRecommendationCoding type;

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

    @JsonProperty("notes")
    public List<String> getNotes() { return notes; }
    @JsonProperty("notes")
    public void setNotes(List<String> value) { this.notes = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("type")
    public ClinicalManagementRecommendationCoding getType() { return type; }
    @JsonProperty("type")
    public void setType(ClinicalManagementRecommendationCoding value) { this.type = value; }
}
