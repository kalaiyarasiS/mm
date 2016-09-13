import java.util.Scanner;

public class Rectangle {

    int x1;
    int y1;
    int x2;
    int y2;
    int x3;
    int y3;
    int x4;
    int y4;
    
   
    Scanner sc = new Scanner(System.in);
    
    public static void main(String arg[]) {

        RectangleOverLap r = new RectangleOverLap();
        r.checkIntersect();
        
    }

    private void checkIntersect() {

        System.out.println("Enter Left Top x and y of 1st Rectangle");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter right Bottom x and y of 1st Rectangle");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("Enter Left Top x and y of 2nd Rectangle");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println("Enter Right Bottom x and y of 2nd Rectangle");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        
        if(x3 > x2 || x4 < x1 || y3 > y2 || y4 < y1)
            System.out.println("Does not intersect");
        else
            System.out.println("Intersect");
    }
}
