public class Plodina
{
    String nazev;
    TypeOfProduct typeOfProduct;
    Integer height;

    Plodina(String nazev, TypeOfProduct typeOfProduct, Integer height)
    {
        this.nazev = nazev;
        this.typeOfProduct = typeOfProduct;
        this.height = height;
    }
    public Boolean isInNorm () {
        if(this.height < 10){
            return true;
        }
        return false;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public void setTypeOfProduct(TypeOfProduct typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public Integer getHeight() {
        return height;
    }

    public String getNazev() {
        return nazev;
    }

    public TypeOfProduct getTypeOfProduct() {
        return typeOfProduct;
    }
}
