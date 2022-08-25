package org.launchcode.techjobs.oo;

import org.junit.Test;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public int getId() {
        return id;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
            id = nextId;
            nextId++;
    }

    public Employer getEmployer() {
        return employer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job(String name1, Employer employer1, Location location1, PositionType positionType1, CoreCompetency coreCompetency1) {
        this();
         name = name1;
         employer = employer1;
         location = location1;
         positionType = positionType1;
         coreCompetency = coreCompetency1;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    public int hashCode() {
        return Objects.hash(getId());
    }

    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job career = (Job) o;
        return getId() == career.getId();
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
