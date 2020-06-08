import java.util.*;
class Rectangle{
    
    private int x, y, width, height;

    Rectangle(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    int getsquare()
    {
        return width*height;
    }

    int getshowx()
    {
        return x;
    }
    int getshowy()
    {
        return y;
    }
}

public class ljh060804{
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in);

        System.out.printf("x��ǥ: ");
        int x = input.nextInt();

        System.out.printf("y��ǥ: ");
        int y = input.nextInt();

        System.out.printf("����: ");
        int width = input.nextInt();

        System.out.printf("����: ");
        int height = input.nextInt();

        Rectangle rect = new Rectangle(x, y, width, height);

        System.out.printf("x��ǥ: %d", rect.getshowx());
        System.out.printf("y��ǥ: %d", rect.getshowy());
        System.out.printf("���̴� %d�Դϴ�.", rect.getsquare());
    }
}