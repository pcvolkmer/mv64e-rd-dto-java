package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;

public class Hospitalization {
    private HospitalizationNumberOfDaysCoding numberOfDays;
    private HospitalizationNumberOfStaysCoding numberOfStays;

    @JsonProperty("numberOfDays")
    public HospitalizationNumberOfDaysCoding getNumberOfDays() { return numberOfDays; }
    @JsonProperty("numberOfDays")
    public void setNumberOfDays(HospitalizationNumberOfDaysCoding value) { this.numberOfDays = value; }

    @JsonProperty("numberOfStays")
    public HospitalizationNumberOfStaysCoding getNumberOfStays() { return numberOfStays; }
    @JsonProperty("numberOfStays")
    public void setNumberOfStays(HospitalizationNumberOfStaysCoding value) { this.numberOfStays = value; }
}
