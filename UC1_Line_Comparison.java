import java.util.*;

public class UC1_Line_Comparison {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        double len = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println("Length of the given Line is : " + len + " units" );
    }
}