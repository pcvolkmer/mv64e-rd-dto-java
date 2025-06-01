package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class RD {
    private List<CarePlan> carePlans;
    private List<Diagnosis> diagnoses;
    private List<EpisodeOfCare> episodesOfCare;
    private List<FollowUp> followUps;
    private List<GMFCSStatus> gmfcsStatus;
    private Hospitalization hospitalization;
    private List<HPOTerm> hpoTerms;
    private MvhMetadata metadata;
    private List<NgsReport> ngsReports;
    private Patient patient;
    private List<Therapy> therapies;

    @JsonProperty("carePlans")
    public List<CarePlan> getCarePlans() { return carePlans; }
    @JsonProperty("carePlans")
    public void setCarePlans(List<CarePlan> value) { this.carePlans = value; }

    @JsonProperty("diagnoses")
    public List<Diagnosis> getDiagnoses() { return diagnoses; }
    @JsonProperty("diagnoses")
    public void setDiagnoses(List<Diagnosis> value) { this.diagnoses = value; }

    @JsonProperty("episodesOfCare")
    public List<EpisodeOfCare> getEpisodesOfCare() { return episodesOfCare; }
    @JsonProperty("episodesOfCare")
    public void setEpisodesOfCare(List<EpisodeOfCare> value) { this.episodesOfCare = value; }

    @JsonProperty("followUps")
    public List<FollowUp> getFollowUps() { return followUps; }
    @JsonProperty("followUps")
    public void setFollowUps(List<FollowUp> value) { this.followUps = value; }

    @JsonProperty("gmfcsStatus")
    public List<GMFCSStatus> getGmfcsStatus() { return gmfcsStatus; }
    @JsonProperty("gmfcsStatus")
    public void setGmfcsStatus(List<GMFCSStatus> value) { this.gmfcsStatus = value; }

    @JsonProperty("hospitalization")
    public Hospitalization getHospitalization() { return hospitalization; }
    @JsonProperty("hospitalization")
    public void setHospitalization(Hospitalization value) { this.hospitalization = value; }

    @JsonProperty("hpoTerms")
    public List<HPOTerm> getHpoTerms() { return hpoTerms; }
    @JsonProperty("hpoTerms")
    public void setHpoTerms(List<HPOTerm> value) { this.hpoTerms = value; }

    @JsonProperty("metadata")
    public MvhMetadata getMetadata() { return metadata; }
    @JsonProperty("metadata")
    public void setMetadata(MvhMetadata value) { this.metadata = value; }

    @JsonProperty("ngsReports")
    public List<NgsReport> getNgsReports() { return ngsReports; }
    @JsonProperty("ngsReports")
    public void setNgsReports(List<NgsReport> value) { this.ngsReports = value; }

    @JsonProperty("patient")
    public Patient getPatient() { return patient; }
    @JsonProperty("patient")
    public void setPatient(Patient value) { this.patient = value; }

    @JsonProperty("therapies")
    public List<Therapy> getTherapies() { return therapies; }
    @JsonProperty("therapies")
    public void setTherapies(List<Therapy> value) { this.therapies = value; }
}
