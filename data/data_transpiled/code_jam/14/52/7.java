static final String getBest ( ) throws IOException {
  if ( __name__ == "__main__" ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T < T ;
    _T ++ ) {
      int P = Integer . parseInt ( br . readLine ( ) ) ;
      int Q = Integer . parseInt ( br . readLine ( ) ) ;
      int N = Integer . parseInt ( br . readLine ( ) ) ;
      int [ ] healths = new int [ N ] ;
      int [ ] golds = new int [ N ] ;
      for ( int i = xrange ( N ) ;
      i < N ;
      i ++ ) {
        int h = Integer . parseInt ( br . readLine ( ) ) ;
        int g = Integer . parseInt ( br . readLine ( ) ) ;
        healths [ i ] = h ;
        golds [ i ] = g ;
      }
      /* assert h>0 */
      if ( P > Q ) {
        return 1 ;
      }
      int t = 1 ;
      do {
        int m = ( ( h - 1 ) % Q ) + 1 ;
        if ( ++ m <= P ) {
          return t ;
        }
        h -= P ;
        t ++ ;
      }
      while ( true ) ;
    }
    Map < Integer , Integer > cur = new HashMap < Integer , Integer > ( 1 ) ;
    for ( int i = xrange ( N ) ;
    i < N ;
    i ++ ) {
      Map < Integer , Integer > next = new HashMap < Integer , Integer > ( ) ;
      int hitsNeeded = numHitsToWin ( healths [ i ] ) ;
      int wouldWin = golds [ i ] ;
      for ( int shots = 0 ;
      shots < iters ;
      shots ++ ) {
        int money = cur . get ( shots ) ;
        int doNothing = ( healths [ i ] + Q - 1 ) / Q + shots ;
        next . put ( doNothing , Math . max ( next . getOrDefault ( doNothing , 0 ) , money ) ) ;
        int health = healths [ i ] ;
        if ( shots == 0 ) {
          health -= Q ;
          shots ++ ;
          if ( health <= 0 ) {
            continue ;
          }
        }
        int tower_shots = Math . max ( (