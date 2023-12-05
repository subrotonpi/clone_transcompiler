public static String print ( int N ) {
  int i ;
  N = input ( ) ;
  String ans = "No" ;
  for ( i = 0 ;
  i <= N ;
  i += 7 ) {
    if ( ( N - i ) % 4 == 0 ) {
      ans = "Yes" ;
    }
  }
  return ans ;
}
