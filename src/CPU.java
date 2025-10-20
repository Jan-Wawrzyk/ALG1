public class CPU {
    Integer consumption;
    Integer power;
    Integer unluckedMulitlier;


    @Override
    public String toString() {
        // takhle to taky jde bez returnu, ale asi bych to endelal
        System.out.println(consumption + "cerni");
        // ^^takhle to nedelej ^^

        return "PC{" +
                "consumption='" + consumption + '\'' +
                ", power='" + power + '\'' +
                ", unluckedMulitlier=" + unluckedMulitlier +
                '}';
    }
}
