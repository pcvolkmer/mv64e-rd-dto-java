package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class Diagnosis {
    private List<OrphanetIcdCoding10GmAlphaIdse> codes;
    private RDDiagnosisFamilyControlLevelCoding familyControlLevel;
    private String id;
    private RDDiagnosisMissingCodeReasonCoding missingCodeReason;
    private List<String> notes;
    private Date onsetDate;
    private Reference patient;
    private Date recordedOn;
    private RDDiagnosisVerificationStatusCoding verificationStatus;

    @JsonProperty("codes")
    public List<OrphanetIcdCoding10GmAlphaIdse> getCodes() { return codes; }
    @JsonProperty("codes")
    public void setCodes(List<OrphanetIcdCoding10GmAlphaIdse> value) { this.codes = value; }

    @JsonProperty("familyControlLevel")
    public RDDiagnosisFamilyControlLevelCoding getFamilyControlLevel() { return familyControlLevel; }
    @JsonProperty("familyControlLevel")
    public void setFamilyControlLevel(RDDiagnosisFamilyControlLevelCoding value) { this.familyControlLevel = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("missingCodeReason")
    public RDDiagnosisMissingCodeReasonCoding getMissingCodeReason() { return missingCodeReason; }
    @JsonProperty("missingCodeReason")
    public void setMissingCodeReason(RDDiagnosisMissingCodeReasonCoding value) { this.missingCodeReason = value; }

    @JsonProperty("notes")
    public List<String> getNotes() { return notes; }
    @JsonProperty("notes")
    public void setNotes(List<String> value) { this.notes = value; }

    @JsonProperty("onsetDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getOnsetDate() { return onsetDate; }
    @JsonProperty("onsetDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setOnsetDate(Date value) { this.onsetDate = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("recordedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getRecordedOn() { return recordedOn; }
    @JsonProperty("recordedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setRecordedOn(Date value) { this.recordedOn = value; }

    @JsonProperty("verificationStatus")
    public RDDiagnosisVerificationStatusCoding getVerificationStatus() { return verificationStatus; }
    @JsonProperty("verificationStatus")
    public void setVerificationStatus(RDDiagnosisVerificationStatusCoding value) { this.verificationStatus = value; }
}
