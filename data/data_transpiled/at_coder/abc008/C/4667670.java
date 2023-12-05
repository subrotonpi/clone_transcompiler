public static int [ ] getDigit ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int e = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int divisor = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i != j && c [ i ] % c [ j ] == 0 ) {
        divisor ++ ;
      }
    }
    if ( divisor % 2 == 0 ) {
      e += ( divisor / 2 + 1 ) / ( divisor + 1 ) ;
    }
    else {
      e += 1 / 2 ;
    }
  }
  System . out . println ( e ) ;
  return c ;
}
