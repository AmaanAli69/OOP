package week2;

public class Singer {
    private String name;
    private String gender;
    private String nationality;
    private Dates debutYear;

    Singer(String name, String gender, String nationality, Dates debutYear){
        this.debutYear = debutYear;
        setGender(gender);
        setName(name);
        setNationality(nationality);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Dates getDebutYear() {
        return debutYear;
    }

    public void setDebutYear(Dates debutYear) {
        this.debutYear = debutYear;
    }

    public String toString(){
        return String.format("\nName: %s\nGender: %s\nNationality: %s\nDebut Year: %s\n\n ",name,gender,nationality, debutYear);
    }
}
