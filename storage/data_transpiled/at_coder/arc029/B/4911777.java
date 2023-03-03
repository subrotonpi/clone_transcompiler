public static final int [ ] getDoubleArray ( ) {
  final int [ ] a = new int [ 2 ] ;
  final int [ ] b = new int [ 2 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    final int [ ] a = new int [ 2 ] ;
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    if ( a [ 0 ] <= b [ 0 ] && a [ 1 ] <= b [ 1 ] ) {
      System . out . println ( "YES" ) ;
    }
    else {
      int d = 90 ;
      int e = 0 ;
      while ( d - e > 10 * ( - 6 ) ) {
        final int l = ( d + e ) / 2 ;
        final int g = a [ 1 ] * Math . sin ( Math . toRadians ( l ) ) + a [ 0 ] * Math . cos ( Math . toRadians ( l ) ) ;
        if ( g >= b [ 1 ] ) {
          d = l ;
        }
        else {
          e = l ;
        }
      }
      else {
        final int g = a [ 1 ] * Math . sin ( Math . toRadians ( e ) ) + a [ 0 ] * Math . cos ( Math . toRadians ( e ) ) ;
        final int h = a [ 1 ] * Math . cos ( Math . toRadians ( e ) ) + a [ 0 ] * Math . sin ( Math . toRadians ( e ) ) ;
        if ( h <= b [ 0 ] && g <= b [ 1 ] ) {
          System . out . println ( "YES" ) ;
        }
        else {
          System . out . println ( "NO" ) ;
        }
      }
    }
  }
  return a ;
}
