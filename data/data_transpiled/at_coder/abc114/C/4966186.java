@ VisibleForTesting static void solve ( int N ) {
  final String s = Integer . toString ( N + 1 ) ;
  final int n = s . length ( ) ;
  final int [ ] [ ] [ ] dp = new int [ 2 ] [ n + 1 ] [ 2 ] ;
  dp [ 0 ] [ 0 ] [ 0 ] [ 0 ] [ 0 ] = 1 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    for ( int smaller = 0 ;
    smaller < 2 ;
    smaller ++ ) {
      for ( int started = 0 ;
      started < 2 ;
      started ++ ) {
        for ( int i1 = 0 ;
        i1 < 2 ;
        i1 ++ ) {
          for ( int i2 = 0 ;
          i2 < 2 ;
          i2 ++ ) {
            for ( int i3 = 0 ;
            i3 < 2 ;
            i3 ++ ) {
              for ( int nex = 0 ;
              nex < 3 ;
              nex ++ ) {
                if ( smaller == 0 && nex > Integer . parseInt ( s . substring ( i , i + 1 ) ) ) continue ;
                if ( started == 0 && nex == 0 ) continue ;
                dp [ i + 1 ] [ smaller || nex < Integer . parseInt ( s . substring ( i , i + 1 ) ) ] [ started || nex > 0 ? i1 : i2 : i2 : i3 : i3 : nex ;
              }
            }
          }
        }
      }
    }
  }
  final int ret = dp [ n ] [ 1 ] [ 1 ] [ 1 ] [ 1 ] ;
  System . out . println ( ret ) ;
  return ;
}
