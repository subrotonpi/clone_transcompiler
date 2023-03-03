public static int a = Integer . parseInt ( input ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = ( int ) ( 2 * 1e12 ) ;
  if ( k == 0 ) {
    System . out . println ( c - a ) ;
  }
  else {
    int p = 0 ;
    while ( a < c ) {
      a ++ + a * k ;
      p ++ ;
    }
    System . out . println ( p ) ;
  }
  return c ;
}
