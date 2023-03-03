static final int factorial ( ) {
  final int d = 1 ;
  int e = 0 ;
  int f = 0 ;
  final int [ ] t = new int [ 10001 ] ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    t [ ( int ) i ] ++ ;
  }
  for ( int i = 1 ;
  i < 10001 ;
  i ++ ) {
    final int s = t [ i ] ;
    if ( s > 0 ) {
      d *= Math . factorial ( s ) ;
      e += i * ( s * ( s + 1 ) / 2 ) + f * s ;
      f += i * s ;
    }
  }
  System . out . println ( e ) ;
  System . out . println ( d % ( 10 * 9 + 7 ) ) ;
}
