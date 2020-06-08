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

        System.out.printf("xÁÂÇ¥: ");
        int x = input.nextInt();

        System.out.printf("yÁÂÇ¥: ");
        int y = input.nextInt();

        System.out.printf("°¡·Î: ");
        int width = input.nextInt();

        System.out.printf("¼¼·Î: ");
        int height = input.nextInt();

        Rectangle rect = new Rectangle(x, y, width, height);

        System.out.printf("xÁÂÇ¥: %d", rect.getshowx());
        System.out.printf("yÁÂÇ¥: %d", rect.getshowy());
        System.out.printf("³ÐÀÌ´Â %dÀÔ´Ï´Ù.", rect.getsquare());
    }
}