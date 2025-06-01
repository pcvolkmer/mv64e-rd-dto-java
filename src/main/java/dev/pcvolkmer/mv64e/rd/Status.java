package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Status {
    private List<HPOTermStatus> history;

    @JsonProperty("history")
    public List<HPOTermStatus> getHistory() { return history; }
    @JsonProperty("history")
    public void setHistory(List<HPOTermStatus> value) { this.history = value; }
}
