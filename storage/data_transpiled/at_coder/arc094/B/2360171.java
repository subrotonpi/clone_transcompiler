static final int n = Integer . parseInt ( input ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = a * b ;
    int r = ( int ) Math . sqrt ( c ) ;
    if ( a == b ) {
      System . out . println ( ( r - 1 ) * 2 ) ;
    }
    else if ( r * r == c ) {
      System . out . println ( ( r - 1 ) * 2 - 1 ) ;
    }
    else if ( r * ( r + 1 ) < c ) {
      System . out . println ( ( r * 2 - 1 ) ) ;
    }
    else {
      System . out . println ( ( r - 1 ) * 2 ) ;
    }
  }
  return n ;
}
