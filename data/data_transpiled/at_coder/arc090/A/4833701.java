public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] [ ] a = new String [ 2 ] [ ] ;
  a [ 0 ] = Lists . newArrayList ( Integer . parseInt ( input ) ) ;
  a [ 1 ] = Lists . newArrayList ( Integer . parseInt ( input ) ) ;
  int [ ] [ ] dp = new int [ 2 ] [ ] ;
  dp [ 0 ] [ 0 ] = a [ 0 ] [ 0 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == 0 ) {
      dp [ 1 ] [ i ] = dp [ 0 ] [ i ] + a [ 1 ] [ i ] ;
    }
    else {
      dp [ 0 ] [ i ] = dp [ 0 ] [ i - 1 ] + a [ 0 ] [ i ] ;
      dp [ 1 ] [ i ] = Math . max ( dp [ 0 ] [ i ] , dp [ 1 ] [ i - 1 ] ) + a [ 1 ] [ i ] ;
    }
  }
  System . out . println ( dp [ 1 ] [ n - 1 ] ) ;
}
