package main.model;

public class IIIDPex extends IIIDP {

    public IIIDPex() {
    }

    String first = "You will start with: ";
    String next1 = "Now you are on: ";
    String next2 = "Next up: ";
    String next3 = "You will be doing: ";

    public void day1(int c, int a) {
        System.out.println(first);
        super.exC1(c);
        System.out.println(next1);
        super.exC6(a);

        System.out.println(next2);
        super.exD1(a);
        System.out.println(next3);
        super.exD2(a);

        System.out.println(next1);
        super.exD3(a);
        System.out.println(next2);
        super.exD4(a);
    }

    public void day2(int c, int a){
        System.out.println(first);
        super.exC4(c);
        System.out.println(next1);
        super.exD5(a);

        System.out.println(next2);
        super.exD6(a);
        System.out.println(next3);
        super.exC6(a);
        System.out.println(next1);
        super.exC8(a);

        System.out.println(next2);
        super.exC7(a);
        System.out.println(next3);
        super.exD7(a);
    }

    public void day3(int c, int a){
        System.out.println(first);
        super.exC3(c);
        System.out.println(next1);
        super.exC2(a);

        System.out.println(next2);
        super.exC5(a);
        System.out.println(next3);
        super.exD8(a);
        System.out.println(next1);
        super.exD9(a);

        System.out.println(next2);
        super.exD10(a);
        System.out.println(next3);
        super.exEXTRA1(a);
    }

}
