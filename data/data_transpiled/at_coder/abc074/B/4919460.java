public static void print ( int n ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int [ ] x = new int [ n ] ;
  for ( String num : input ( ) . split ( " " ) ) {
    x [ i ] = Integer . parseInt ( num ) ;
  }
  long l = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( x [ i ] <= k - x [ i ] ) {
      l += 2 * x [ i ] ;
    }
    else {
      l += 2 * ( k - x [ i ] ) ;
    }
  }
  System . out . println ( l ) ;
}
