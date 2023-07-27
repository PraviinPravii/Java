package Class2constructor.Constructor.Deepcopy;

public class Point {
    int x;
    int y;
    Point(){
     this(0,0);
    }
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    Point(Point p){
//        this.x=p.x;
//        this.y=p.y;
        this(p.x, p.y);
    }
}
