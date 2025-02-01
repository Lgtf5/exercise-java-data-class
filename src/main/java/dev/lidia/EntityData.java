package dev.lidia;

public class EntityData {
        
    public String name;
    public String lastName;
    public int numberDocId;
    public int birthDate;


    public EntityData(String name, String lastName, int numberDocId, int birthDate) {
        
        this.name = name;
        this.lastName = lastName;
        this.numberDocId = numberDocId;
        this.birthDate = birthDate;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getNumberDocId() {
        return numberDocId;
    }
    public void setNumberDocId(int numberDocId) {
        this.numberDocId = numberDocId;
    }


    public int getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }


}
