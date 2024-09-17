import java.util.Random;

public class Assignment1{
    
    public static void main (String[] args){
        Random rand = new Random();
        CCanvas canvas = new CCanvas();

        for(int i = 0; i < 10; i++){
            int grabnum = rand.nextInt(4);
            // if SQUARE is selected
            if(grabnum == 0){
                canvas.shapeList[i] = new CSquare(rand.nextInt(99) + 1);
                canvas.shapeList[i].setID(i + 1);
            }
            // if RECTANGLE is selected
            if(grabnum == 1){
                canvas.shapeList[i] = new CRectangle(rand.nextInt(99) + 1, rand.nextInt(99) + 1);
                canvas.shapeList[i].setID(i + 1);
            }
            // if CIRCLE is selected
            if(grabnum == 2){
                canvas.shapeList[i] = new CCircle(rand.nextInt(99) + 1);
                canvas.shapeList[i].setID(i + 1);
            }
            // if OVAL is selected
            if(grabnum == 3){
                canvas.shapeList[i] = new COval(rand.nextInt(99) + 1, rand.nextInt(99) + 1);
                canvas.shapeList[i].setID(i + 1);
            }
            System.out.println((i+1) + ". Is zees your card? --> " + canvas.shapeList[i]);
            System.out.println("==========================================");
        }

        for(int i = 0; i < 10; i++){
            System.out.println(canvas.shapeList[i].getClass());

            // calculate SQUARE's dimensions for area
            if(canvas.shapeList[i].getClass().getName() == "CSquare"){
                System.out.println("The dimensions of this SQUARE are: " + canvas.shapeList[i].getWidth());
                canvas.shapeList[i].setArea(canvas.shapeList[i].getWidth());
                System.out.println("The area is equal to: " + canvas.shapeList[i].getArea());
            }
            // calculate RECTANGLE's dimensions for area
            else if(canvas.shapeList[i].getClass().getName() == "CRectangle"){
                System.out.println("The dimensions of this RECTANGLE are: " + canvas.shapeList[i].getWidth() + " x " + canvas.shapeList[i].getLength());
                canvas.shapeList[i].setArea(canvas.shapeList[i].getWidth() * canvas.shapeList[i].getLength());
                System.out.println("The area is equal to: " + canvas.shapeList[i].getArea());
            }
            // calculate CIRCLE's dimensions for area
            if(canvas.shapeList[i].getClass().getName() == "CCircle"){
                System.out.println("The dimensions of this OVAL are: " + canvas.shapeList[i].getRadius());
                canvas.shapeList[i].setArea(canvas.shapeList[i].getRadius());
                System.out.println("The area is equal to: " + canvas.shapeList[i].getArea());
            }
            // calculate OVAL's dimensions for area
            else if(canvas.shapeList[i].getClass().getName() == "COval"){
                System.out.println("The dimensions of this OVAL are: " + canvas.shapeList[i].getHRadius() + " x " + canvas.shapeList[i].getVRadius());
                canvas.shapeList[i].setArea(canvas.shapeList[i].getHRadius() * canvas.shapeList[i].getVRadius());
                System.out.println("The area is equal to: " + canvas.shapeList[i].getArea());
            }
            
        }

    }
}
