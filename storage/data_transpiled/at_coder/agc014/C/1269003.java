@ VisibleForTesting static void input ( ) {
  final int H = Integer . parseInt ( input . readLine ( ) ) ;
  final int W = Integer . parseInt ( input . readLine ( ) ) ;
  final int K = Integer . parseInt ( input . readLine ( ) ) ;
  final List < String > m = new ArrayList < String > ( ) ;
  int startx = 0 , starty = 0 ;
  for ( int i = 0 ;
  i <= H ;
  i ++ ) {
    final String a = new String ( input . readLine ( ) ) ;
    if ( a . contains ( "S" ) ) {
      startx = ( a . indexOf ( "S" ) ) ;
      starty = ( a . indexOf ( "S" ) ) ;
    }
    m . add ( a ) ;
  }
  final Deque < Integer > dq = new ArrayDeque < Integer > ( ) ;
  dq . add ( new Integer [ ] {
    startx , starty , K }
    ) ;
    int dist = 9999999999999999999 ;
    final boolean [ ] [ ] hist = new boolean [ W ] [ H ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      hist [ i ] [ i ] = false ;
      hist [ starty ] [ startx ] = true ;
    }
    while ( dq . size ( ) > 0 ) {
      final int x = dq . poll ( ) ;
      final int y = dq . poll ( ) ;
      dist = Math . min ( dist , x , y , W - 1 - x , H - 1 - y ) ;
      if ( dist == 0 ) {
        break ;
      }
      if ( turn > 0 ) {
        turn -- ;
        for ( int dx = 0 , dy = - 1 ;
        dx < W ;
        dy ++ ) {
          final int newx = x + dx , newy = y + dy ;
          if ( m . get ( newy ) . equals ( newx ) && ! hist [ newy ] [ newx ] ) {
            dq . add ( new Integer ( newx ) ) ;
            hist [ newy ] [ newx ] = true ;
          }
        }
      }
    }
    System . out . println ( 1 + Math . ceil ( dist / K ) ) ;
  }
  