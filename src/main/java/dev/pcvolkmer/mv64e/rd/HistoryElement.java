package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;
import java.util.List;

public class HistoryElement {
    private Reference basedOn;
    private RDTherapyCategoryCoding category;
    private String id;
    private List<Coding> medication;
    private List<String> notes;
    private Reference patient;
    private PeriodDate period;
    private Date recordedOn;
    private RDTherapyCoding type;

    @JsonProperty("basedOn")
    public Reference getBasedOn() { return basedOn; }
    @JsonProperty("basedOn")
    public void setBasedOn(Reference value) { this.basedOn = value; }

    @JsonProperty("category")
    public RDTherapyCategoryCoding getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(RDTherapyCategoryCoding value) { this.category = value; }

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("medication")
    public List<Coding> getMedication() { return medication; }
    @JsonProperty("medication")
    public void setMedication(List<Coding> value) { this.medication = value; }

    @JsonProperty("notes")
    public List<String> getNotes() { return notes; }
    @JsonProperty("notes")
    public void setNotes(List<String> value) { this.notes = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("period")
    public PeriodDate getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(PeriodDate value) { this.period = value; }

    @JsonProperty("recordedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getRecordedOn() { return recordedOn; }
    @JsonProperty("recordedOn")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setRecordedOn(Date value) { this.recordedOn = value; }

    @JsonProperty("type")
    public RDTherapyCoding getType() { return type; }
    @JsonProperty("type")
    public void setType(RDTherapyCoding value) { this.type = value; }
}
