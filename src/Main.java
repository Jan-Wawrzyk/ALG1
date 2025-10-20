import Podminky.Point;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//
//
//        PC computer = new PC();
//        computer.cpu = new CPU();
//        computer.gpu = new GPU();
//        computer.hdd = new HDD();
//
//        computer.cpu.power = 110;
//        computer.cpu.consumption = 30;
//        computer.cpu.unluckedMulitlier = 2;
//
//        computer.gpu.power = 300;
//
//        System.out.println(computer.cpu.toString());
//        System.out.println(computer.cpu.power);
//
//        System.out.println(computer);
        // ^^1. Hodina pak chtěl dělat podmínky ^^

        Point p = new Point();
        p.x = 2;
        p.y = 1;

        if(p.x == p.y) {
            System.out.println("uspech");
        } else if (p.x != p.y) {
            System.out.println("elsif");
        } else if (p.x > p.y) {
            System.out.println("elsif x > y");
        } else {
            System.out.println("nope");
        }
        // ternarni operator -> nevnořovat

        int greaterNumber = (p.x >= p.y) ?
                p.x :
                p.y;

        System.out.println(
                p.y == p.x ?
                "uspech" : "nope"
        );
        // switch
        // totalni prasarna pouzivat jenom pro enumy

        switch (greaterNumber) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
                // mužeš i nemusiš to wrapovat do {}
            case 3: {
                System.out.println("3");
                break;
            }

            default: {
                System.out.println("nope");
            }
        }


    }
}