public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] d = new String [ b ] ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) d [ i ] = input . nextLine ( ) ;
  int k = Collections . singletonList ( "o" ) . indexOf ( "" ) ;
  for ( int i = b - 1 ;
  i >= 0 ;
  i -- ) {
    int c = 0 ;
    if ( k > 1 ) {
      if ( d [ i ] . charAt ( k - 1 ) == '-' ) {
        k -= 2 ;
        c = 1 ;
      }
    }
    if ( k < 2 * a - 2 ) {
    }
  }
  return k ;
}
