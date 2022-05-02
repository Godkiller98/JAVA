// //compare given two array and get the same array and if a number is repeated in the array print it again
class t{
  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int arr2[]={2,3,5,6,7,2};
    int n=arr.length;
    int s=arr2.length;
    for (int i=0;i<n ;i++ ) {
      for (int j=0; j<s;j++ ) {
        if (arr[i]==arr2[j]) {
          System.out.println("it number which has same value" + arr2[j] +"\n and the index of the same value is"+ j);
        }
      }
    }
    for (int i=0;i<s ;i++ ) {
      for (int j=0; j<i;j++ ) {
        if (arr2[i]==arr2[j]) {
          System.out.println("This number is repeated again" + arr2[j]);
        }
      }
    }
  }
}
