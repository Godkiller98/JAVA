// // palindrome
class t{
  public static void main(String[] args) {
    int k=14567;
    int sum=0;
    int res;
    int n=5;
    for (int i=0;i<n ;i++ ) {
      res=k%10;
      sum = (sum*10)+res;
      k=k/10;
    }
    System.out.println(sum);
  }
}
