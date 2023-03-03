@ VisibleForTesting static int [ ] [ ] solve ( ) {
  final int [ ] [ ] primes = new int [ 10 ] [ 8 ] ;
  final double INF = Double . MAX_VALUE ;
  final int mod = 10 * 9 + 7 ;
  final double eps = 10 * - 10 ;
  final char [ ] AtoZ = new char [ N ] ;
  for ( int i = 65 ;
  i < 65 + 26 ;
  i ++ ) {
    AtoZ [ i ] = ( char ) i ;
  }
  final char [ ] atoz = new char [ N ] ;
  for ( int i = 97 ;
  i < 97 + 26 ;
  i ++ ) {
    atoz [ i ] = ( char ) i ;
  }
  {
    final int [ ] inpl_int = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int mid = ( OK + NG ) / 2 ;
      if ( YUI ( mid ) > 0 ) {
        OK = mid ;
      }
      else {
        NG = mid ;
      }
    }
    System . out . println ( OK ) ;
  }
  {
    final int [ ] salt = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int w = wp [ i ] ;
      int p = wp [ i ] ;
      salt [ i ] = ( p - x ) * w * 0.01 ;
    }
    Arrays . sort ( salt , reverse = true ) ;
    return Arrays . binarySearch ( salt , 0 , K ) >= 0 ;
  }
  {
    final int [ ] table ;
    final int [ ] rank ;
    {
      final int x = new int [ N ] ;
      final int y = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int a = Integer . parseInt ( table [ i ] ) ;
        int b = Integer . parseInt ( table [ i ] ) ;
        int c = Integer . parseInt ( table [ i ] ) ;
        int t = Integer . parseInt ( table [ i ] ) ;
        int w = Integer . parseInt ( table [ i ] ) ;
        for ( int i = 0 ;
        i < w ;
        i ++ ) {
          int a = Integer . parseInt ( table [ i ] ) ;
          int b = Integer . parseInt ( table [ i ] ) ;
          int c = Integer . parseInt ( table [ i ] ) ;
          int t = Integer . parseInt ( table [ i ] ) ;
          if ( t > 0 ) {
            rank [ w ] ++ ;
          }
        }
      }
    }
  }
}
