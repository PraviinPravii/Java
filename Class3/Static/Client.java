package Class3.Static;

public class Client {
    public static void main(String[] args) {
        A o1=new A();
        A o2=new A();
        o1.x=10;
        o1.y=88;
        o1.z=10;
        o1.display();
        A.z=299;
        o1.display();
        o2.z=900;
        o2.display();
        A.z=855;
        o2.display();
        System.out.println(A.z);
    }
}
