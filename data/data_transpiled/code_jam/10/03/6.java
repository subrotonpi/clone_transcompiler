public static void main ( String className ) {
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int caseno : xrange ( T ) ) {
    int R = Integer . parseInt ( readLine ( ) ) ;
    int k = Integer . parseInt ( readLine ( ) ) ;
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] g = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      g [ i ] = Integer . parseInt ( readLine ( ) ) ;
    }
    int [ ] h = new int [ R ] ;
    Map < Integer , Integer > cycle = new HashMap < Integer , Integer > ( ) ;
    boolean usedCycle = false ;
    int pos = 0 ;
    int profit = 0 ;
    while ( R -- > 0 ) {
      if ( ! usedCycle && cycle . containsKey ( pos ) ) {
        int cycleLen = h . length - cycle . get ( pos ) ;
        int cycleProfit = Integer . parseInt ( readLine ( ) ) ;
        int cnt = R / cycleLen ;
        R -= cnt * cycleLen ;
        profit += cnt * cycleProfit ;
        usedCycle = true ;
      }
      if ( R == 0 ) {
        break ;
      }
      int npos = pos ;
      int curr = 0 ;
      int gcnt = 0 ;
      while ( curr + g [ npos ] <= k && gcnt < N ) {
        curr += g [ npos ] ;
        npos = ( npos + 1 ) % N ;
        gcnt ++ ;
      }
      profit += curr ;
      cycle . put ( pos , h . length ) ;
      h [ pos ++ ] = new int [ ] {
        pos , curr }
        ;
        pos = npos ;
        R -- ;
      }
      System . out . println ( "Case #" + ( caseno + 1 ) + ": " + profit ) ;
    }
  }
  