public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    //konstanta ig
    // staticka znamena ze nepotrebuju instanci tridy abych ji zavolla
    // final zanmena ze to je konstanta
    public static final int ADULT_TRESHOLD = 18;
    private static int ALCOHOL_TOLERANCE = 0;

    Person() {}

    Person(int ALCOHOL_TOLERANCE)
    {
        this.ALCOHOL_TOLERANCE = ALCOHOL_TOLERANCE;
    }
    // public - modifikátor přístupu
    // void <- co vrací
    // firstName <- Parametr, když to meotda má je parametrická

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age)
    {
        // dá se udělat i přes if ...
        boolean isInvalid = age < ADULT_TRESHOLD  ? true : false;

        this.age = isInvalid ? ADULT_TRESHOLD : age;

        System.out.print("invalid age ");
    }

    public int getAge() {
        return age;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
