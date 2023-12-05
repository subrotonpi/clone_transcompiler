@ VisibleForTesting static void go ( ) {
  int casenum = 1 ;
  {
    int ans = - 1 ;
    int H = Integer . parseInt ( lines . pollFirst ( ) ) ;
    int N = Integer . parseInt ( lines . pollFirst ( ) ) ;
    int M = Integer . parseInt ( lines . pollFirst ( ) ) ;
    int [ ] [ ] C = new int [ N ] [ M ] ;
    float [ ] [ ] F = new float [ N ] [ M ] ;
    float [ ] [ ] T = new float [ N ] [ M ] ;
    float [ ] [ ] P = new float [ N ] [ M ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      C [ i ] = Integer . parseInt ( lines . pollFirst ( ) ) ;
      T [ i ] = new float [ M ] ;
      P [ i ] = null ;
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      F [ i ] = Integer . parseInt ( lines . pollFirst ( ) ) ;
    }
    T [ 0 ] [ 0 ] = 0 ;
    HashSet < Integer > done = new HashSet < Integer > ( ) ;
    HeapSort discovered = new HeapSort ( ) ;
    heapSort ( discovered , new int [ ] {
      0 , ( 0 , 0 ) , null }
      ) ;
      /* OOB for the following cases */
      boolean oob = ( r < 0 || r >= N || c < 0 || c >= M ) ;
      /* Earlier pass */
      int srcRow = C [ srcRow ] [ srcCol ] ;
      float srcFloor = F [ srcRow ] [ srcCol ] ;
      int destRow = C [ destRow ] [ destCol ] ;
      float destFloor = F [ destRow ] [ destCol ] ;
      if ( destFloor - destFloor < 50 ) return ;
      if ( destFloor - srcFloor < 50 || srcFloor - destFloor < 50 ) return ;
      if ( destFloor - H > 50 ) return ;
      else return ( 50 - destFloor + H ) / 10.0 ;
    }
    while ( discovered . size ( ) > 0 ) {
      HeapSort best = new HeapSort ( discovered ) ;
      final int bestTime = best . getBest ( ) ;
      final int bestCol = best . getBest ( ) . getBest ( ) . getBest ( ) . getBest ( ) . getBest ( ) . getBest ( ) . getBest ( ) . getBest ( ) . getBest