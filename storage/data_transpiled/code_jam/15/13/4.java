@ VisibleForTesting static int divide ( ) {
  final int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int test : xrange ( T ) ) {
    final int N = Integer . parseInt ( readLine ( ) ) ;
    final List < Pair < Integer , Integer >> trees = new ArrayList < > ( ) ;
    for ( int i : xrange ( N ) ) {
      final int x = Integer . parseInt ( readLine ( ) ) ;
      final int y = Integer . parseInt ( readLine ( ) ) ;
      trees . add ( new Pair < > ( x , y ) ) ;
    }
    System . out . println ( "Case #" + ( test + 1 ) + ":" ) ;
    for ( int i = 0 ;
    i < trees . size ( ) ;
    i ++ ) {
      final int x0 = trees . get ( i ) . x ;
      final int y0 = trees . get ( i ) . y ;
      final List < Integer > left = new ArrayList < > ( ) ;
      final List < Integer > right = new ArrayList < > ( ) ;
      int up = 0 ;
      int down = 0 ;
      for ( int x1 = 0 ;
      x1 < trees . size ( ) ;
      x1 ++ ) {
        final int y1 = trees . get ( x1 ) . y ;
        final int x = x1 - x0 ;
        final int y = y1 - y0 ;
        if ( x > 0 ) {
          right . add ( y / x ) ;
        }
        else if ( x < 0 ) {
          left . add ( y / x ) ;
        }
        else if ( y > 0 ) {
          up ++ ;
        }
        else if ( y < 0 ) {
          down ++ ;
        }
      }
      Collections . sort ( left ) ;
      Collections . sort ( right ) ;
      int ans = Math . min ( left . size ( ) , right . size ( ) ) ;
      for ( int i = 0 ;
      i < ans ;
      i ++ ) {
        final int angle = left . get ( i ) . angle ;
        final int cutAfter = down + left . size ( ) - 1 - i + Math . min ( right . get ( i ) . left , right . get ( i ) . right ) ;
        final int cutBefore = up + i + right . size ( ) - Math . min ( right . get ( i ) . right , right . get ( i ) . right ) ;
        final int cut = Math . min ( cutAfter , cutBefore ) ;
        ans = Math . min ( ans , cut ) ;
      }
      System . out . println ( ans ) ;
    }
  }
  return