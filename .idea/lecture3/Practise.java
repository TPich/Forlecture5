package lecture3;

public class Practise {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        if ((a <= 9) || (b >= 10)) {
            System.out.println("Your number is lower than 19");
        }
        boolean some = true;
        if (!some) {
            System.out.println("Boolean is true");
        }
        if (b != 10) {
            System.out.println("not equal 10");
        }
        int switchCaseVar = 15;
        switch (switchCaseVar) {
            case 10:
                System.out.println("10");
                break;
            case 11:
                System.out.println("11");
                break;
            case 13:
            case 12:
                System.out.println("12");
                break;
            default:
                System.out.println("What???");
        }

    }

}

