public class Insertion {
public static void main(String[] args) {
int[] arr = {45, 23, 11, 89, 77, 98, 4, 28, 65};

for (int i = 1; i < arr.length; i++) {
int key = arr[i];
int j = i - 1;

while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j--;
}
arr[j + 1] = key;
}
System.out.println("Sorted Array -> ");
for (int num : arr) {
System.out.print(num + " ");
}
}
}
