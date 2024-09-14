import java.util.Random;

public class Assignment1 {
    public static void main (String[] args) {
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            int grabnum = rand.nextInt(4);
            // if SQUARE is selected
            if(grabnum == 0){

            }
            // if RECTANGLE is selected
            if(grabnum == 1){

            }
            // if CIRCLE is selected
            if(grabnum == 2){

            }
            // if OVAL is selected
            if(grabnum == 3){

            }
            int randnum = rand.nextInt(99) + 1;
            System.out.println(randnum);
        }

        

    }
}