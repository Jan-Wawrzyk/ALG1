public class GPU {
    Integer power;
    String creator;
    Boolean supportRTX;

    @Override
    public String toString() {
        return "GPU{" +
                "power=" + power +
                ", creator='" + creator + '\'' +
                ", SupportRTX=" + supportRTX +
                '}';
    }
}
