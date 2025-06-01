package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class NgsReport {
    private RDNgsReportConclusionCoding conclusion;
    private String id;
    private Date issuedOn;
    private Reference patient;
    private Results results;
    private SequencingInfo sequencingInfo;
    private NgsReportCoding type;

    @JsonProperty("conclusion")
    public RDNgsReportConclusionCoding getConclusion() { return conclusion; }
    @JsonProperty("conclusion")
    public void setConclusion(RDNgsReportConclusionCoding value) { this.conclusion = value; }

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

    @JsonProperty("results")
    public Results getResults() { return results; }
    @JsonProperty("results")
    public void setResults(Results value) { this.results = value; }

    @JsonProperty("sequencingInfo")
    public SequencingInfo getSequencingInfo() { return sequencingInfo; }
    @JsonProperty("sequencingInfo")
    public void setSequencingInfo(SequencingInfo value) { this.sequencingInfo = value; }

    @JsonProperty("type")
    public NgsReportCoding getType() { return type; }
    @JsonProperty("type")
    public void setType(NgsReportCoding value) { this.type = value; }
}
