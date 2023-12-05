public static String input ( ) {
  int a , b ;
  a = a == "H" ? 1 : - 1 ;
  b = b == "H" ? 1 : - 1 ;
  int c = a * b ;
  String ans ;
  if ( c == 1 ) {
    ans = "H" ;
  }
  else {
    ans = "D" ;
  }
  return ans ;
}
