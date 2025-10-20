import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);

        PC computer = new PC();
        computer.cpu = new CPU();
        computer.gpu = new GPU();
        computer.hdd = new HDD();

        computer.cpu.power = 110;
        computer.cpu.consumption = 30;
        computer.cpu.unluckedMulitlier = 2;

        computer.gpu.power = 300;

        System.out.println(computer.cpu.toString());
        System.out.println(computer.cpu.power);

        System.out.println(computer);

    }
}