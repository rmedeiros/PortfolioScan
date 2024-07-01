package eus.onekin.portfolioscan.etl.model;

import java.time.Instant;

public class Version {
    Instant created;
    private String name;

    public Instant getCreated() {
        return created;
    }

    public String getName() {
        return this.name;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public void setName(String name) {
        this.name = name;
    }
}
