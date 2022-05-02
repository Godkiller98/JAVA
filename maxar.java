
//maximum in the array
class t{
  public static void main(String[] args) {
    int arr[]={1,2,5,4,3};
    int max=0;
    for (int i=0;i<5 ;i++ ) {
      if (max<arr[i]) {
        max=arr[i];
      }

    }System.out.println(max);
  }
}