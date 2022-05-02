
 // showing even and odd number
class t{
  public static void main(String[] args) {
    for (int i=1;i<=10 ;i++ ) {
    if (i%2==0) {
      System.out.println("It is even number : "+ i);
    }else {
      continue;
    }
    }
    for (int i=1;i<=10 ;i++ ) {
    if (i%2!=0) {
      System.out.println("It is odd number : "+ i);
    }else {
      continue;
    }
    }
  }
}