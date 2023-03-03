@ VisibleForTesting static void main ( String input ) {
  int H = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int W = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  List < List < String >> meiro = new ArrayList < > ( ) ;
  for ( int l = 0 ;
  l < H ;
  l ++ ) {
    meiro . add ( Collections . singletonList ( input . substring ( l , l + 1 ) ) ) ;
  }
  for ( int y = 0 ;
  y < meiro . size ( ) ;
  y ++ ) {
    String row = meiro . get ( y ) ;
    try {
      try {
        int posg = y ;
        posg = row . indexOf ( "g" ) ;
        int poss = row . indexOf ( "s" ) ;
        int dx [ ] = {
          1 , 0 , - 1 , 0 }
          ;
          int dy [ ] = {
            0 , 1 , 0 , - 1 }
            ;
            Deque < Integer > stk = new LinkedList < > ( ) ;
            stk . addLast ( poss [ 0 ] , poss [ 1 ] ) ;
            int [ ] [ ] dis = new int [ W ] [ H ] ;
            for ( int l = 0 ;
            l < H ;
            l ++ ) {
              for ( int i = 0 ;
              i < 4 ;
              i ++ ) {
                int xx = x + dx [ i ] , yy = y + dy [ i ] ;
                if ( xx < 0 || W <= yy || yy < 0 || H <= xx ) {
                  continue ;
                }
                if ( meiro . get ( xx ) . get ( yy ) . equals ( "." ) ) {
                  if ( dis [ x ] [ y ] < dis [ xx ] [ yy ] ) {
                    dis [ xx ] [ yy ] = dis [ x ] [ y ] ;
                    stk . addLast ( new Integer ( xx ) ) ;
                  }
                }
                else if ( meiro . get ( xx ) . get ( yy ) . equals ( "g" ) ) {
                  dis [ xx ] [ yy ] = dis [ x ] [ y ] ;
                  if ( dis [ xx ] [ yy ] <= 2 ) {
                    System . out . println ( "YES" ) ;
                    exit ( ) ;
                  }
                }
                else if ( meiro . get ( xx ) . get ( yy ) . equals ( "#" ) ) {
                  if ( dis [ x ] [ y ] + 1 < dis [ xx ] [ yy ] ) {
                    dis [ xx ]