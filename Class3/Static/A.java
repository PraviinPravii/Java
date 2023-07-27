package Class3.Static;

public class A {
    int x;
    int y;

    static  int z;

     void  display(){
        System.out.println(this.x+" "+this.y+" "+A.z);
    }
}
