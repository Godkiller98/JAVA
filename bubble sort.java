class t{
  static boolean k(int n){
    for (int i=2;i<n ;i++ ) {
      if(n%i==0){
        return false;
      }else {
        continue;
      }
  }return true;
  }
  public static void main(String[] args) {
    int s=10;
  for (int i=2;i<=s;i++ ) {
    if (k(i)) {
      System.out.println(i);
    }
  }
}
}