static void print ( String s ) {
  final int t = Integer . parseInt ( s ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    final int d = Integer . parseInt ( s ) ;
    final int [ ] p = new int [ d ] ;
    for ( int k = 0 ;
    k < p . length ;
    k ++ ) p [ k ] = Integer . parseInt ( s ) ;
    int minm = max ( p ) ;
    int j = 1 ;
    while ( j < minm ) {
      int m = 0 ;
      for ( int k = 0 ;
      k < d ;
      k ++ ) m += ( p [ k ] + j - 1 ) / j - 1 ;
      minm = min ( m + j , minm ) ;
      j ++ ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + minm ) ;
  }
}
