// Traversing an array
package BASICS;
class _01Program{
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        // traverse each element of an array
        for(int i=0; i<arr.length; i++){
            System.out.println("element at index " + i + " is " + arr[i]);
        }
    }
}