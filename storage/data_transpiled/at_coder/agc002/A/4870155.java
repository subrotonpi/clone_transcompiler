public static String print ( String input ) {
  int a = Integer . parseInt ( input ) , b = Integer . parseInt ( input ) ;
  String ans ;
  if ( a * b <= 0 ) {
    ans = "Zero" ;
  }
  else if ( a > 0 ) {
    ans = "Positive" ;
  }
  else {
    int n = b - a + 1 ;
    ans = ( n % 2 ) == 0 ? "Positive" : "Negative" ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
