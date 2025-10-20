public class PC {
    HDD hdd;
    CPU cpu;
    GPU gpu;

    @Override
    public String toString() {
        return "PC{" +
                "hdd=" + hdd.toString()+
                ", cpu=" + cpu.toString() +
                ", gpu=" + gpu.toString() +
                '}';
    }
}
