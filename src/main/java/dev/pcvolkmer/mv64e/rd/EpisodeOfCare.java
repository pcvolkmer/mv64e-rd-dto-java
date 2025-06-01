package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;

public class EpisodeOfCare {
    private String id;
    private Reference patient;
    private PeriodDate period;

    @JsonProperty("id")
    public String getId() { return id; }
    @JsonProperty("id")
    public void setId(String value) { this.id = value; }

    @JsonProperty("patient")
    public Reference getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Reference value) { this.patient = value; }

    @JsonProperty("period")
    public PeriodDate getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(PeriodDate value) { this.period = value; }
}
