package staticExample;

public class Main {
    public static void main(String[] args) {
//      Human rishi = new Human(21,"Rishikesh",30000,false);
//      Human KK = new Human(27,"kk",70000,true);

        Main obj = new Main();
        obj.fun2();



    }

    static void fun(){
//        fun2();
    }

    void fun2(){
        greet();
        System.out.println("fun2");
    }

    void greet(){
        System.out.println("greet");
    }

}
