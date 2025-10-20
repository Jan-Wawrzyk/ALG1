public class CPU {
    Integer consumption;
    Integer power;
    Integer unluckedMulitlier;


    @Override
    public String toString() {
        System.out.println(consumption + "negři");

        return "PC{" +
                "consumption='" + consumption + '\'' +
                ", power='" + power + '\'' +
                ", unluckedMulitlier=" + unluckedMulitlier +
                '}';
    }
}
