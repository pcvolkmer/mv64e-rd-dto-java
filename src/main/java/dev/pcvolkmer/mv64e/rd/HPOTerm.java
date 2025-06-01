package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class HPOTerm {
    private String id;
    private Date onsetDate;
    private Reference patient;
    private Date recordedOn;
    private Status status;
    private Coding value;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("onsetDate")
    public Date getOnsetDate() { return onsetDate; }
    @JsonProperty("onsetDate")
    public void setOnsetDate(Date value) { this.onsetDate = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("recordedOn")
    public Date getRecordedOn() { return recordedOn; }
    @JsonProperty("recordedOn")
    public void setRecordedOn(Date value) { this.recordedOn = value; }

    @JsonProperty("status")
    public Status getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(Status value) { this.status = value; }

    @JsonProperty("value")
    public Coding getValue() { return value; }
    @JsonProperty("value")
    public void setValue(Coding value) { this.value = value; }
}
