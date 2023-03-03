@ Sys public static void foo ( int K ) {
  BitSet bit = new BitSet ( xrange ( K + 1 ) ) ;
  int x = 1 ;
  for ( int i = 0 ;
  i < xrange ( K ) ;
  i ++ ) {
    System . out . println ( bit . get ( x ) ) ;
    if ( i + 1 == K ) break ;
    bit . -- ;
    x = ( x + i ) % ( K - i - 1 ) + 1 ;
  }
  int tno = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int j = 0 ;
  j < xrange ( tno ) ;
  j ++ ) {
    int K = Integer . parseInt ( System . console ( ) . readLine ( ) . trim ( ) ) ;
    int x = Integer . parseInt ( System . console ( ) . readLine ( ) . trim ( ) ) ;
    int [ ] t = new int [ K + 1 ] ;
    for ( int i = 0 ;
    i < x ;
    i ++ ) {
      t [ x ] = i + 1 ;
    }
    System . out . println ( "Case #" + ( j + 1 ) + ": " + Arrays . toString ( t [ xx ] ) ) ;
  }
}
