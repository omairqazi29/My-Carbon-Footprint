package model;

import org.json.JSONObject;
import persistence.Writable;

// Represents a footprint having a value (CO2 emissions) and category
public class Footprint implements Writable {
    private double value;
    private final String category;

    // EFFECTS: constructs a footprint with value set to 0 and with given category
    public Footprint(String category) {
        value = 0;
        this.category = category;
    }

    // EFFECTS: returns the value
    public double getValue() {
        return value;
    }

    // EFFECTS: returns the category
    public String getCategory() {
        return category;
    }

    // MODIFIES: this
    // EFFECTS: sets the value of the footprint to the given value
    public void setValue(double value) {
        this.value = value;
    }

    // MODIFIES: this
    // EFFECTS: adds the value of the footprint by the given value
    public void addValue(double value) {
        this.value += value;
    }

    // EFFECTS: returns this as a JSON object
    @Override
    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("category", category);
        json.put("value", value);
        return json;
    }
}
