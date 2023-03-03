public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > s = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 10 * 5 + 1 ;
  i ++ ) {
    s . add ( i ) ;
  }
  int [ ] p = new int [ 10 * 5 + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = 0 ;
  }
  int l = 0 , r = 0 , m = 0 ;
  while ( r < n ) {
    if ( p [ s . get ( r ) ] == 0 ) {
      p [ s . get ( r ) ] ++ ;
      r ++ ;
    }
    else {
      p [ s . get ( l ) ] -- ;
      l ++ ;
    }
    m = Math . max ( m , r - l ) ;
  }
  System . out . println ( m ) ;
}
