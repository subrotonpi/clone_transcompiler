@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int [ ] [ ] ints ( ) {
  final int INF = Integer . MAX_VALUE ;
  final int [ ] dy = {
    0 , 1 , 1 }
    ;
    final int [ ] dx = {
      1 , 0 , 1 }
      ;
      final boolean inside = ( y -> 0 <= y && y < H && 0 <= x && x < W ) ;
      final boolean [ ] [ ] field = new boolean [ 101 ] [ 101 ] ;
      final boolean [ ] [ ] memo = new boolean [ 101 ] [ 101 ] ;
      for ( int i = 0 ;
      i < 101 ;
      i ++ ) {
        memo [ i ] [ 0 ] = null ;
      }
      /* This is the first one */
      if ( memo [ y ] [ x ] != null ) {
        return memo [ y ] [ x ] ;
      }
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) {
        final int ny = y + dy [ i ] , nx = x + dx [ i ] ;
        if ( ! inside ) {
          continue ;
        }
        if ( field [ ny ] [ nx ] == "#" ) {
          continue ;
        }
        if ( ! canWin ( ny , nx , H , W ) ) {
          memo [ y ] [ x ] = true ;
          return true ;
        }
      }
      memo [ y ] [ x ] = false ;
      return false ;
    }
    