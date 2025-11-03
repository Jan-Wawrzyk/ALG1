import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Chce všude ať používáme getry a setry
        Person jakub = new Person(11);

        // tim že to je static nepotřebuje instanci
        System.out.println(Person.ADULT_TRESHOLD);

        //problemy s uživateli
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        jakub.setFirstName(sc.nextLine());
        System.out.print(jakub.getFirstName());

        System.out.print("Enter your age: ");

        jakub.setAge(sc.nextInt());
        System.out.println(jakub.getAge());
    }
}