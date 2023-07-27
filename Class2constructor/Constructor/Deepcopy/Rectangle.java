package Class2constructor.Constructor.Deepcopy;

public class Rectangle {
    Point topleft;
    Point bottomright;

    Rectangle(Point topleft, Point bottomright){
        this.topleft=new Point(topleft);
        this.bottomright=new Point(bottomright);
    }

    void display(){
        System.out.println(this.topleft.x+" "+this.topleft.y);
        System.out.println(this.bottomright.x+" "+this.bottomright.y);
    }
}
