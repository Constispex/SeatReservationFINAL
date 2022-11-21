package de.medieninformatik.main;

import java.io.Serializable;

public class Sitzplatz implements Serializable {
    String name;
    boolean isValid;

    public void setName(String name) {
        this.name = name;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getName() {
        return name;
    }

    public boolean isValid() {
        return isValid;
    }


}
