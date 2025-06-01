package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;

public class SequencingInfo {
    private String kit;
    private NgsReportPlatformCoding platform;

    @JsonProperty("kit")
    public String getKit() { return kit; }
    @JsonProperty("kit")
    public void setKit(String value) { this.kit = value; }

    @JsonProperty("platform")
    public NgsReportPlatformCoding getPlatform() { return platform; }
    @JsonProperty("platform")
    public void setPlatform(NgsReportPlatformCoding value) { this.platform = value; }
}
