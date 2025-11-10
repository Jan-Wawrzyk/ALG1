public class Lokalita {
    String nazev;
    String oblast;
    GroundType groundType;

    Lokalita() {}
    public String returnPopisLokality ()
    {
        return this.nazev + " " + this.oblast + " " + this.groundType;
    }
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setGroundType(GroundType groundType) {
        this.groundType = groundType;
    }

    public void setOblast(String oblast) {
        this.oblast = oblast;
    }

    public String getNazev() {
        return nazev;
    }

    public GroundType getGroundType() {
        return groundType;
    }

    public String getOblast() {
        return oblast;
    }
}
