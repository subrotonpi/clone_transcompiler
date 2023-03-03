public static int [ ] getDigits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( h ) ;
  int min = 10 * 9 ;
  for ( int i = 0 ;
  i < N - K ;
  i ++ ) {
    if ( h [ i + K - 1 ] - h [ i ] < min ) {
      min = h [ i + K - 1 ] - h [ i ] ;
    }
  }
  System . out . println ( min ) ;
  return h ;
}
