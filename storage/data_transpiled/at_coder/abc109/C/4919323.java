public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] array = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    array [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( array ) ;
  int [ ] diff = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    diff [ i ] = array [ i + 1 ] - array [ i ] ;
  }
  /* Compute gcd */
  if ( ( N == 0 ) && ( N == 1 ) ) {
    return diff [ 0 ] ;
  }
  else {
    /* Compute gcd */
    BigInteger ans = diff [ 0 ] ;
    for ( int i = 1 ;
    i < diff . length ;
    i ++ ) {
      ans = gcd ( ans , diff [ i ] ) ;
    }
    System . out . println ( ans ) ;
  }
  if ( getClass ( ) . equals ( Main . class ) ) {
    Main . main ( args ) ;
  }
}
