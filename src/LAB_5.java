public class LAB_5 {

    public static void main(String[] args) {
        // Print the area of a rectangle with width 5 and height 8
        System.out.println("Площа прямокутника: " + getRectangleArea(5, 8));

        // Print the smallest of -5, 12, and 2
        System.out.printf("Найменше число: %s%n", findMin( 5, 12, 2));

        // Print an array
        int[] arr = {1, 2, 3, 4, 5, 6};
        printArray(arr);

        // Print the largest number in an array
        System.out.println("Найбільше число в масиві таке: " + findMax(arr));
    }


    public static double getRectangleArea(double width, double height) {
        return width * height;
    }


    public static String findMin(int num1, int num2, int num3) {
        int min = Math.min(num1, Math.min(num2, num3));
        System.out.println(min);
        return null;
    }


    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}