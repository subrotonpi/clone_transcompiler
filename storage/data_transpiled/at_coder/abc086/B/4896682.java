public static void print ( String input ) {
  String [ ] a = input . split ( " " ) ;
  int s = ( int ) ( a [ 0 ] + a [ 1 ] ) ;
  int n = ( int ) ( s * 0.5 ) ;
  if ( n * n == s || ( n - 1 ) * n == s || ( n + 1 ) * n == s ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
