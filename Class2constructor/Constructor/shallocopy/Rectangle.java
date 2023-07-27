package Class2constructor.Constructor.shallocopy;

public class Rectangle {
    Point topleft;
    Point bottomright;

    Rectangle(Point topleft,Point bottomright){
        this.topleft=topleft;
        this.bottomright=bottomright;

    }

    void display(){
        System.out.println(this.topleft.x+" "+this.topleft.y);
        System.out.println(this.bottomright.x+" "+this.bottomright.y);
    }
}
