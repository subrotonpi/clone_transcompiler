public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  Arrays . sort ( a ) ;
  Arrays . sort ( a ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( b [ n / 2 ] <= a [ i ] ) {
      System . out . println ( b [ n / 2 - 1 ] ) ;
    }
    else {
      System . out . println ( b [ n / 2 ] ) ;
    }
  }
}
