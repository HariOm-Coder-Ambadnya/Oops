package Abstaraction;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("daughter career");
    }

    @Override
    void partner() {
        System.out.println("daughter partner");

    }
}
