public static int N ( Scanner input ) {
  int a = 0 ;
  int b = 0 ;
  int c = 1 ;
  int d = 0 ;
  if ( N < 3 ) {
    System . out . println ( 0 ) ;
  }
  else if ( N == 3 ) {
    System . out . println ( 1 ) ;
  }
  else {
    for ( int i = 0 ;
    i < N - 3 ;
    i ++ ) {
      d = a ;
      a = b ;
      b = c ;
      c = ( a + b + d ) % ( 10 * 4 + 7 ) ;
    }
    System . out . println ( c ) ;
  }
  return a ;
}
