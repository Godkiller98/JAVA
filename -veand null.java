//negative numbers present in the array and number of zero present in the array;
class t{
  public static void main(String[] args) {
    int arr[]= {-1,-3,0,-4,-5,6,0,6,8,9,0,0};
    int n=arr.length;
    int count=0;
    for (int i=0;i<n ;i++ ) {
      if (arr[i]<0) {
        System.out.println("The Negative numbers in the array are "+ arr[i]);
      }
    }for (int i=0;i<n ;i++ ) {
      if (arr[i]==0) {
        count++;
      }
    }System.out.println("Number of zero present in the array is " + count);
  }
}
