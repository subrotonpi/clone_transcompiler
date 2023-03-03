public static void print ( int n ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] array = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    array [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  kyori = 0 ;
  for ( int i : array ) {
    if ( i <= Math . abs ( k - i ) ) {
      kyori += i * 2 ;
    }
    else {
      kyori += Math . abs ( k - i ) * 2 ;
    }
  }
  System . out . println ( kyori ) ;
}
