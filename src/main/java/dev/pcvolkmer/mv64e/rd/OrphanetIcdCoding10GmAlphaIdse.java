package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;

public class OrphanetIcdCoding10GmAlphaIdse {
    private String code;
    private String display;
    private CodeSystem system;
    private String version;

    @JsonProperty("code")
    public String getCode() { return code; }
    @JsonProperty("code")
    public void setCode(String value) { this.code = value; }

    @JsonProperty("display")
    public String getDisplay() { return display; }
    @JsonProperty("display")
    public void setDisplay(String value) { this.display = value; }

    @JsonProperty("system")
    public CodeSystem getSystem() { return system; }
    @JsonProperty("system")
    public void setSystem(CodeSystem value) { this.system = value; }

    @JsonProperty("version")
    public String getVersion() { return version; }
    @JsonProperty("version")
    public void setVersion(String value) { this.version = value; }
}
