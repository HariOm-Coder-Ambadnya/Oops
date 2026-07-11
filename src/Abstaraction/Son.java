package Abstaraction;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("son career");
    }

    @Override
    void partner() {
        System.out.println("son partner");

    }
}
