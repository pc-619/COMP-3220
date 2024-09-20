public class CShape{
    
    static int hradius;
    static int vradius;
    static int radius;
    static int width;
    static int length;
    static int area;

    static int uniquenum = 0;
    CShape(){
        uniquenum = 0;
    }

    public int getID(){
        return uniquenum;
    }

    public void setID(int unum){
        uniquenum = unum;
    }

    public int getHRadius(){
        return hradius;
    }

    public int getVRadius(){
        return vradius;
    }

    public void setHRadius(int num){
        hradius = num;
    }

    public void setVRadius(int num){
        hradius = num;
    }

    public int getRadius(){
        return radius;
    }

    public int getWidth(){
        return width;
    }
    
    public int getLength(){
        return length;
    }

    public int getArea(){
        return area;
    }

    public void setArea(int a){
        area = a;
    }

}



class CCanvas{
    CShape [] shapeList = new CShape [10];
}

class COval extends CShape{
    public String toString(){
        return "Oval (" + uniquenum + "), HRADIUS = " + hradius + ", VRADIUS = " + vradius;
    }

    COval(int valOne, int valTwo){
        hradius = valOne;
        vradius = valTwo;
    }
}

class CCircle extends COval{
    public String toString(){
        return "Circle (" + uniquenum + "), RADIUS = " + radius;
    }

    CCircle(int valOne){
        super(valOne, 0);
        radius = valOne;
    }
}

class CRectangle extends CShape{
    public String toString(){
        return "Rectangle (" + uniquenum + "), WIDTH = " + width + ", LENGTH = " + length;
    }

    CRectangle(int valOne, int valTwo){
        width = valOne;
        length = valTwo;
    }
}

class CSquare extends CRectangle{
    public String toString(){
        return "Oval (" + uniquenum + "), WIDTH = " + width + ", LENGTH = " + length;
    }

    CSquare(int valOne){
        super(valOne, 0);
        width = valOne;
    }
}
