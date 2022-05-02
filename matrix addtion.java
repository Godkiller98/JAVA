
//matrix addition
class t{
  public static void main(String[] args) {
  int arr[][]={{1,3,4},{2,4,3},{3,4,5}};
  int arr2[][]={{1,3,4},{2,4,3},{1,2,4}};
  int[][] arr3=new int[3][3];
  int row=arr.length;
  int col=arr[0].length;

for (int i=0;i<row ;i++ ) {
  for (int j=0;j<col ;j++ ) {
    arr3[i][j]=arr[i][j]+arr2[i][j];
  }
}
for (int i=0;i<row ;i++ ) {
  for (int j=0;j<col ;j++ ) {
    System.out.println(arr3[i][j]);
  }
}
  }
}
