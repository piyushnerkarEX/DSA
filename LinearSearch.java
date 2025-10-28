import java.util.Scanner;

public class LinearSearch {
public static int linearSearch(int[] arr, int key) {
for (int i = 0; i < arr.length; i++) {
if (arr[i] == key)
return i;
}
return -1;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] arr = {10, 20, 30, 40, 50};
System.out.print("Enter element to search: ");
int key = sc.nextInt();
int index = linearSearch(arr, key);
if (index != -1)
System.out.println("Element found at index " +
index);
else
System.out.println("Element not found");
sc.close();
}
}
