package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.Date;

public class HPOTermStatus {
    private Date date;
    private HPOTermStatusCoding status;

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDate() { return date; }
    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setDate(Date value) { this.date = value; }

    @JsonProperty("status")
    public HPOTermStatusCoding getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(HPOTermStatusCoding value) { this.status = value; }
}
