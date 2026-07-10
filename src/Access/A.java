package Access;

public class A {
    protected int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public A(String name, int num) {
        this.arr = new int[num];
        this.name = name;
        this.num = num;

    }

}
