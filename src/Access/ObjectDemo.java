package Access;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num ==((ObjectDemo)obj).num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
public static void main(String[] args) {
    ObjectDemo ob1 = new ObjectDemo(4);
    ObjectDemo ob2 = new ObjectDemo(4);

    if (ob1 == ob2){ //It checks the value
        System.out.println("equesls");
    }
    if (ob1.equals(ob2)){ // After modifying the .equal above function we can checK nums
        System.out.println("equesls2");
    }

}

}
