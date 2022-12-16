package be.vdab.gastenboek;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Gastenboek implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private final List<GastenboekEntry> entriesLijst = new ArrayList<>();

    public void add(GastenboekEntry entry) {
        entriesLijst.add(entry);
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        for (var index = entriesLijst.size() -1; index >= 0; index--) {
            builder.append(entriesLijst.get(index)).append("\n");
        }
        return builder.toString();
    }
}
