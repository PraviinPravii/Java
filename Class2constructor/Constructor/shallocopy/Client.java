package Class2constructor.Constructor.shallocopy;

public class Client {
    public static void main(String[] args) {
        Point p1=new Point(10,10);
        Point p2=new Point(5,5);

        Rectangle r=new Rectangle(p1,p2);
        p1.x=26;
        r.display();
        r.display();
    }


}