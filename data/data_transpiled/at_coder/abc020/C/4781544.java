static final int [ ] [ ] read ( InputStream input ) throws IOException {
  final int inf = 10 * 18 ;
  final int H = Integer . parseInt ( input . readLine ( ) ) ;
  final int W = Integer . parseInt ( input . readLine ( ) ) ;
  final int T = Integer . parseInt ( input . readLine ( ) ) ;
  final char [ ] [ ] s = new char [ H ] [ W ] ;
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    for ( int x = 0 ;
    x < W ;
    x ++ ) {
      switch ( s [ y ] [ x ] ) {
        case 'S' : sx = x ;
        sy = y ;
        break ;
        case 'G' : gx = x ;
        gy = y ;
        break ;
      }
    }
  }
  final int [ ] [ ] tblr = new int [ ] [ ] {
    {
      ( 0 , - 1 ) , ( 0 , 1 ) , ( - 1 , 0 ) , ( 1 , 0 ) }
    }
    ;
    int l = 1 ;
    int r = T ;
    while ( true ) {
      final int m = ( l + r + 1 ) / 2 ;
      if ( l >= r ) break ;
      final int [ ] [ ] d = new int [ W ] [ H ] ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) d [ i ] [ 0 ] = inf ;
      d [ i ] [ sy ] = sx ;
      final int [ ] [ ] prev = new int [ W ] [ H ] ;
      for ( int i = 0 ;
      i < W ;
      i ++ ) prev [ i ] [ 0 ] = null ;
      final PriorityQueue < Integer > q = new PriorityQueue < Integer > ( ) ;
      HeapWordSearch . search ( q , 0 , sx , sy ) ;
      while ( q . size ( ) > 0 ) {
        final int dur = q . poll ( ) ;
        final int x = q . poll ( ) ;
        final int y = q . poll ( ) ;
        if ( dur > d [ gy ] [ gx ] ) continue ;
        if ( dur > T ) continue ;
        for ( int i = 0 ;
        i < H ;
        i ++ ) {
          final int dx = tblr [ i ] [ x ] ;
          final int dy = tblr [ i ] [ y ] ;
          if ( prev [ y ] [ x ] == i ) continue ;
          if ( x + dx < 0 || W <= x + dx ) continue ;
          if ( y + dy < 0 || H <= y + dy