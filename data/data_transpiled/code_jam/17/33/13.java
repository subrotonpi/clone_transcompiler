@ VisibleForTesting static double readDouble ( ) {
  final int cases = Integer . parseInt ( readLine ( ) ) ;
  for ( int c = 1 ;
  c <= cases ;
  c ++ ) {
    System . out . println ( "Case #" + c + ":" + "," ) ;
    final int n = Integer . parseInt ( readLine ( ) ) ;
    final int k = Integer . parseInt ( readLine ( ) ) ;
    final int usable = Integer . parseInt ( readLine ( ) . replace ( "." , "" ) ) ;
    final int [ ] cores = new int [ n ] ;
    for ( int i = 0 ;
    i < usable ;
    i ++ ) {
      cores [ i ] = Integer . parseInt ( readLine ( ) . replace ( "." , "" ) ) ;
    }
    while ( usable > 0 ) {
      final int [ ] lowest = new int [ ] {
        1000000 , - 1 }
        ;
        for ( int i = 0 ;
        i < cores . length ;
        i ++ ) {
          if ( cores [ i ] < lowest [ 0 ] ) {
            lowest [ 0 ] = new int [ ] {
              cores [ i ] , i }
            }
            ;
            usable -- ;
            cores [ lowest [ 1 ] ] ++ ;
          }
        }
        double ans = 1.0 ;
        for ( int i = 0 ;
        i < cores . length ;
        i ++ ) {
          ans *= ( cores [ i ] / 10000.0 ) ;
        }
        System . out . println ( ans ) ;
      }
      return ans ;
    }
    