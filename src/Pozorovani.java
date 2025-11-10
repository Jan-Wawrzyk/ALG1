import java.util.Date;

public class Pozorovani {
   private Date datum;
   private String plodina;
   private Pozorovatel pozorovatel;
    private Lokalita lokalita;
    private Growth growth;
    Pozorovani(Date datum, String plodina, Lokalita lokalita,Growth growth, Pozorovatel pozorovatel ) {
        this.datum = datum;
        this.plodina = plodina;
        this.lokalita = lokalita;
        this.pozorovatel = pozorovatel;
        this.growth = growth;
    }
    public void getRecomendation() {

        switch (this.growth) {
            case BAD:
                System.out.println("recomendation bad");
                break;
            case MID:
                System.out.println("recomendation mid");
                break;
                case GOOD:
                System.out.println("recomendation good");
                break;
        }
    }
    public Date getDatum() {
        return datum;
    }

    public String getPlodina() {
        return plodina;
    }

    public Pozorovatel getPozorovatel() {
        return pozorovatel;
    }

    public Lokalita getLokalita() {
        return lokalita;
    }

    public Growth getGrowth() {
        return growth;
    }

    @Override
    public String toString() {
        return "Pozorovani{" +
                "datum=" + datum +
                ", plodina='" + plodina + '\'' +
                ", pozorovatel=" + pozorovatel +
                ", lokalita=" + lokalita +
                ", growth=" + growth +
                '}';
    }
}
