package dev.pcvolkmer.mv64e.rd;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Therapy {
    private List<HistoryElement> history;

    @JsonProperty("history")
    public List<HistoryElement> getHistory() { return history; }
    @JsonProperty("history")
    public void setHistory(List<HistoryElement> value) { this.history = value; }
}
