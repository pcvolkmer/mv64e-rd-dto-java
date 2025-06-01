package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class CarePlan {
    private ClinicalManagementRecommendation clinicalManagementRecommendation;
    private Boolean geneticCounselingRecommended;
    private String id;
    private Date issuedOn;
    private CarePlanNoSequencingPerformedReasonCoding noSequencingPerformedReason;
    private List<String> notes;
    private Reference patient;
    private Boolean reevaluationRecommended;
    private List<StudyEnrollmentRecommendation> studyEnrollmentRecommendations;
    private List<TherapyRecommendation> therapyRecommendations;

    @JsonProperty("clinicalManagementRecommendation")
    public ClinicalManagementRecommendation getClinicalManagementRecommendation() { return clinicalManagementRecommendation; }
    @JsonProperty("clinicalManagementRecommendation")
    public void setClinicalManagementRecommendation(ClinicalManagementRecommendation value) { this.clinicalManagementRecommendation = value; }

    @JsonProperty("geneticCounselingRecommended")
    public Boolean getGeneticCounselingRecommended() { return geneticCounselingRecommended; }
    @JsonProperty("geneticCounselingRecommended")
    public void setGeneticCounselingRecommended(Boolean value) { this.geneticCounselingRecommended = value; }

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

    @JsonProperty("noSequencingPerformedReason")
    public CarePlanNoSequencingPerformedReasonCoding getNoSequencingPerformedReason() { return noSequencingPerformedReason; }
    @JsonProperty("noSequencingPerformedReason")
    public void setNoSequencingPerformedReason(CarePlanNoSequencingPerformedReasonCoding value) { this.noSequencingPerformedReason = value; }

    @JsonProperty("notes")
    public List<String> getNotes() { return notes; }
    @JsonProperty("notes")
    public void setNotes(List<String> value) { this.notes = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("reevaluationRecommended")
    public Boolean getReevaluationRecommended() { return reevaluationRecommended; }
    @JsonProperty("reevaluationRecommended")
    public void setReevaluationRecommended(Boolean value) { this.reevaluationRecommended = value; }

    @JsonProperty("studyEnrollmentRecommendations")
    public List<StudyEnrollmentRecommendation> getStudyEnrollmentRecommendations() { return studyEnrollmentRecommendations; }
    @JsonProperty("studyEnrollmentRecommendations")
    public void setStudyEnrollmentRecommendations(List<StudyEnrollmentRecommendation> value) { this.studyEnrollmentRecommendations = value; }

    @JsonProperty("therapyRecommendations")
    public List<TherapyRecommendation> getTherapyRecommendations() { return therapyRecommendations; }
    @JsonProperty("therapyRecommendations")
    public void setTherapyRecommendations(List<TherapyRecommendation> value) { this.therapyRecommendations = value; }
}
