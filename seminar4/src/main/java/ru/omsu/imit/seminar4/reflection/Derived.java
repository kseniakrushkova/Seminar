package ru.omsu.imit.seminar4.reflection;

import java.io.Serializable;
import java.util.Objects;

public class Derived  extends Base implements Serializable {
    private String additionalDescription;

    public Derived(String description, String additionalDescription) {
        super(description);
        this.additionalDescription = additionalDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Derived derived = (Derived) o;
        return Objects.equals(additionalDescription, derived.additionalDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), additionalDescription);
    }

    public String getAdditionalDescription() {
        return additionalDescription;
    }

    public void setAdditionalDescription(String additionalDescription) {
        this.additionalDescription = additionalDescription;
    }
}
