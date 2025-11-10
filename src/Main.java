import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pozorovatel pozorovatel;
        Lokalita lokalita = new Lokalita();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("jmeno: ");
        String surname = sc.nextLine();
        System.out.print("prijmeni: ");
        String nazev = sc.nextLine();
        System.out.print("nazev plodiny: ");
        Integer height = Integer.parseInt(sc.nextLine());
        System.out.print("vyska plodiny: ");

        pozorovatel = new Pozorovatel(name, surname, Experience.EXPERT);// idk nevim jak se delaji nepovinne parmans

        Pozorovani pozorovani = new Pozorovani(new Date(),nazev, lokalita, Growth.BAD,pozorovatel);

        pozorovani.toString();

    }
}