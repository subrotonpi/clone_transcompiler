@ VisibleForTesting static void main ( String [ ] args ) {
  final int INF = Integer . MAX_VALUE ;
  final int mod = 10 * 9 + 7 ;
  final int eps = 10 * - 7 ;
  {
    final int inpl = Integer . parseInt ( input . nextLine ( ) ) ;
    final int inpls = Integer . parseInt ( input . nextLine ( ) ) ;
    final int H = inpl ;
    final int W = inpls ;
    final int h = inpl + mod ;
    final int w = inpls + eps ;
    final int [ ] [ ] MAP = new int [ H ] [ W ] ;
    int pl = 0 ;
    int mn = 0 ;
    int tmp = 0 ;
    for ( int y = 0 ;
    y < H ;
    y ++ ) {
      for ( int x = 0 ;
      x < W ;
      x ++ ) {
        if ( ( y + 1 ) % h == 0 && ( x + 1 ) % w == 0 ) {
          MAP [ y ] [ x ] -= ( h * w - 1 ) * 1000 + 1 ;
          mn ++ ;
          tmp -= ( h * w - 1 ) * 1000 + 1 ;
        }
        else {
          MAP [ y ] [ x ] = 1000 ;
          pl ++ ;
          tmp += 1000 ;
        }
      }
    }
    if ( tmp <= 0 ) {
      System . out . println ( "No" ) ;
    }
    else {
      System . out . println ( "Yes" ) ;
      for ( int [ ] [ ] m : MAP ) {
        System . out . println ( Arrays . toString ( m ) ) ;
      }
    }
  }
}
