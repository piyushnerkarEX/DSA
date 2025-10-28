class SelectionSort {
public static void main(String[] args) {
int[] arr = {12,43,43,23,89,87,45,65};

for ( int i = 0; i<arr.length-1; i++){
int minIndex = i;
for( int j = i+1; j<arr.length; j++){
if( arr[j] < arr[minIndex]){
minIndex = j;
}
}
int temp = arr[minIndex];
arr[minIndex] = arr[i];
arr[i] = temp;
}
System.out.println("Sorted Array -> ");
for( int nums : arr ){
System.out.print(nums+ " ");
}
}
}
