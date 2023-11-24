import java.util.*;

public class UC2_Line_Comparison {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Co-ordinates of line 1 ");
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        Double len1 = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println();
        System.out.println("Enter the Co-ordinates of line 2 ");
        System.out.println("Enter the Co-ordinates of x3 and y3 : ");
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        System.out.println("Enter the Co-ordinates of x4 and y4 : ");
        int x4 = scan.nextInt();
        int y4 = scan.nextInt();
        Double len2 = Math.sqrt((x4 - x3) * (x4 - x3)  +  (y4 - y3) * (y4 - y3));
        System.out.println("Length of line 1 is : " + len1 + " units" );
        System.out.println("Length of the line 2 is : " + len2 + " units" );
        System.out.println();
         if(len1.compareTo(len2) == 1)
            System.out.println("Length of line 1 is greater than Line 2 ");
         else if (len1.compareTo(len2) == -1)
				 System.out.println("Length of line 1 is less than Line 2 ");
			else
            System.out.println("Both lines are equal in length");


    }
}