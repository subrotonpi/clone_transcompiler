@ VisibleForTesting static void print ( String input ) {
  final String [ ] args = input . split ( " " ) ;
  final int H = Integer . parseInt ( args [ 0 ] ) ;
  final int W = Integer . parseInt ( args [ 1 ] ) ;
  final char [ ] c = new char [ W + 2 ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    c [ i ] = 'w' + args [ 1 ] . trim ( ) + 'w' ;
  }
  final int [ ] [ ] smap = new int [ W + 2 ] [ W + 2 ] ;
  for ( int i = 0 ;
  i < H + 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < W + 2 ;
    j ++ ) {
      if ( c [ i ] [ j ] == 's' ) {
        q . add ( new int [ ] {
          i , j }
          ) ;
          smap [ i ] [ j ] = 0 ;
        }
      }
    }
    final Queue < int [ ] > q = new LinkedList < > ( ) ;
    int cnt = 0 ;
    for ( int i = 0 ;
    i < H + 2 ;
    i ++ ) {
      for ( int j = 0 ;
      j < W + 2 ;
      j ++ ) {
        if ( c [ i ] [ j ] == 's' ) {
          q . add ( new int [ ] {
            i , j }
            ) ;
            smap [ i ] [ j ] = 0 ;
          }
        }
      }
      while ( ( cnt = q . size ( ) ) > 0 ) {
        final int [ ] x = q . poll ( ) ;
        cnt = smap [ x [ 0 ] ] [ x [ 1 ] ] ;
        for ( int i = 0 ;
        i < angle . length ;
        i ++ ) {
          if ( c [ x [ 0 ] + i ] [ x [ 1 ] + i ] == '.' && smap [ x [ 0 ] + i ] [ x [ 1 ] + i ] == 0 ) {
            q . add ( new int [ ] {
              x [ 0 ] + i , x [ 1 ] + i }
              ) ;
              smap [ x [ 0 ] + i ] [ x [ 1 ] + i ] = cnt ;
            }
            else if ( cnt < 2 && c [ x [ 0 ] + i ] [ x [ 1 ] + i ] == '#' && smap [ x [ 0 ] + i ] [ x [ 1 ] + i ] == 0 ) {
              q