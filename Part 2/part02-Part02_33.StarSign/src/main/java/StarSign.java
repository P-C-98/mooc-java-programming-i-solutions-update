public class StarSign {
 
    public static void main(String[] args) {
 
           
        printStars(5);
        printStars(3);
        printStars(9);
        printSquare(4);
        printRectangle(17, 3);
        printTriangle(4);
    }
 
    public static void printStars(int number) {
        int i =  0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
 
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
 
    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {    //outer loop
            for (int j = 0; j <= i; j++) {  // inter loop 
                System.out.print("*");      // prints one star for each iteration
            }
            System.out.println();           // move to the next line after printing w
        }
    }
}