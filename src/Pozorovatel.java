public class Pozorovatel {
    private String name;
    private String surname;
    private Experience experience;

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setExperience(Experience experience) {
        this.experience = experience;
    }
    public String getName (){
        return this.name;
    }
    public String getSurname (){
        return this.surname;
    }
    public Experience getExperience (){
        return this.experience;
    }

    public String getWholeName (){
        return this.name + " " + this.surname;
    }
    Pozorovatel (String name, String surname, Experience experience) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
    }
}
