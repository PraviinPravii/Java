package Class3.Staticmethod;

public class A {
    int nst=89;
    static  int st=992;
    void func(int x,int y){
        System.out.println(x+y);
        System.out.println(this.st);
        this.sfunc(3,4);
    }
    static void sfunc(int x,int y){
        System.out.println(x+y);
        System.out.println(st);
//        System.out.println(this.nst); cannot call


    }
}
