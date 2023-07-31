package Class4.Polymorphism;

public class Student {
    int a;
    int c;

    void func(int x,int y){
        System.out.println("func(int x,int y)");
        System.out.println(x+y);
    }
    void func(String x,String y){
        System.out.println("func(String x,String y)");
        System.out.println(x+y);
    }
    void func(String x,int y){
        System.out.println("func(String x,int y)");
        System.out.println(x+y);
    }
    void func(int x,String y){
        System.out.println("func(int x,String y)");
        System.out.println(x+y);
    }
    double func(double x,double y){
        System.out.println("func(double x,double y)");
        System.out.println(x+y);
        return x+y;
    }
    int func(int x,double y){
        System.out.println("int func(int x,double y)");
        System.out.println(x+y);

        return (int) (x+y);
    }
}
