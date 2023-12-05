static final int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] src = new String [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    int y = src [ i ] . indexOf ( ' ' ) ;
    String row = src [ i ] ;
    if ( row . contains ( "S" ) ) {
      sy = y ;
      sx = row . indexOf ( 'S' ) ;
    }
    if ( row . contains ( "G" ) ) {
      gy = y ;
      gx = row . indexOf ( 'G' ) ;
    }
  }
  final double INF = Double . POSITIVE_INFINITY ;
  int [ ] [ ] dxy = {
    {
      0 , 1 }
      , {
        1 , 0 }
        , {
          0 , - 1 }
          , {
            - 1 , 0 }
          }
          ;
          /* reach */
          int k = Integer . MAX_VALUE ;
          HeapPriorityQueue < Integer > hq = new HeapPriorityQueue < Integer > ( 0 , sx , sy ) ;
          HeapSort . sort ( hq ) ;
          int [ ] [ ] dist = new int [ W ] [ W ] ;
          for ( int i = 0 ;
          i < H ;
          i ++ ) {
            int t = hq . poll ( ) ;
            int x = hq . poll ( ) ;
            int y = hq . poll ( ) ;
            if ( t > T ) break ;
            if ( x == gx && y == gy ) return true ;
            for ( int [ ] dx : dxy ) {
              int nx = x + dx , ny = y + dy ;
              if ( ! 0 <= nx && nx < W ) continue ;
              if ( ! 0 <= ny && ny < H ) continue ;
              int d = src [ ny ] . charAt ( nx ) == '#' ? k : 1 ;
              if ( t + d >= dist [ ny ] [ nx ] ) continue ;
              dist [ ny ] [ nx ] = t + d ;
              HeapSort . sort ( hq , t + d , nx , ny ) ;
            }
          }
          int ok = 1 ;
          int ng = T + 1 ;
          while ( ng - ok > 1 ) {
            int m = ( ok + ng ) / 2 ;
            if ( reach ( m ) ) ok = m ;
            else ng = m ;
          }
          System . out . println ( ok ) ;
          return ok ;
        }
        