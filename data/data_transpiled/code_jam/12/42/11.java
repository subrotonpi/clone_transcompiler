public static final int [ ] [ ] getPoints ( ) {
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int W = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int L = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] radsr = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    ArrayList < Integer > rads = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < radsr . length ;
    i ++ ) {
      int r = radsr [ i ] ;
      rads . add ( new Integer ( r ) ) ;
    }
    Collections . sort ( rads ) ;
    Collections . reverse ( rads ) ;
    int [ ] [ ] cand = new int [ N ] [ ] ;
    cand [ 0 ] [ 0 ] = - rads [ 0 ] [ 0 ] ;
    ArrayList < Integer > pos = new ArrayList < Integer > ( N ) ;
    ArrayList < Integer > anspos = new ArrayList < Integer > ( N ) ;
    for ( int r : rads ) {
      for ( int i = 0 ;
      i < cand . length ;
      i ++ ) {
        final int cx = cand [ i ] [ 0 ] ;
        final int cy = cand [ i ] [ 1 ] ;
        int x = Math . max ( cx + r , 0 ) ;
        int y = Math . max ( cy + r , 0 ) ;
        if ( 0 <= x && 0 <= y && x <= W && y <= L ) {
          boolean found = true ;
          for ( int j = 0 ;
          j < pos . size ( ) ;
          j ++ ) {
            int px = pos . get ( j ) ;
            int py = pos . get ( j ) ;
            if ( Math . abs ( px - x ) < r + rads [ j ] [ 0 ] && Math . abs ( y - py ) < r + rads [ j ] [ 0 ] ) {
              found = false ;
              break ;
            }
          }
          if ( found ) {
            pos . add ( new Integer ( x ) ) ;
            anspos . set ( j , x , y ) ;
            cand = new ArrayList < Integer > ( ) ;
            pos . add ( new Integer ( x + r ) ) ;
            anspos . add (