public static int N = Integer . parseInt ( input ) {
  if ( N == 0 ) {
    System . out . println ( 2 ) ;
  }
  else if ( N == 1 ) {
    System . out . println ( 1 ) ;
  }
  else {
    int a = 2 ;
    int b = 1 ;
    for ( int i = 2 ;
    i <= N ;
    i ++ ) {
      int c = b + a ;
      b = c ;
      a = b ;
    }
    System . out . println ( c ) ;
  }
  return N ;
}
