public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    long [ ] l = Lists . newArrayList ( ) ;
    l [ 4 ] *= 110 / 900 ;
    int s = Arrays . stream ( l ) . reduce ( 0 , ( l [ 4 ] * l [ 4 ] ) ) ;
    if ( m < s ) m = s ;
  }
  System . out . println ( m ) ;
}
