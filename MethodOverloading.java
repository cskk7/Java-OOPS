public class MethodOverloading {
    public static void main(String[] args) {
       Addition obj = new Addition();
       obj.add(2,4);
       obj.add(2,4,6);
       obj.add(10,20,30,40);
       obj.add(5,5);
    }
}
class Addition{
    public static void add(int a, int b){ // only can add two
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){ // only can add three
        System.out.println(a+b+c);
    }
    public static void add(int a, int b, int c, int e){ // only can add three
        System.out.println(a+b+c+e);
    }
}
