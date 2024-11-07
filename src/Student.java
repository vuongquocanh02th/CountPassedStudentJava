import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter size: ");
            size = sc.nextInt();
            if (size <= 0 || size > 30) {
                System.out.println("Size must be between 1 and 30! Again!");
            }
        } while (size <= 0 || size > 30);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter mark for student "+(i+1)+": ");
            array[i] = sc.nextInt();
            i++;
        }
        //In danh sach diem
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
            if(array[j] >=5 && array[j] <=10) {
                count++;
            }
        }
        System.out.println();
        System.out.print("Number of students passed: "+count);
    }
}
