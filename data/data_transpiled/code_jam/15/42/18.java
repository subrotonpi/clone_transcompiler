@ VisibleForTesting static String run ( int N , double V , double X , ArrayList < ArrayList < Double >> pipes ) throws IOException {
  for ( int i : xrange ( N ) ) pipes . get ( i ) . add ( pipes . get ( i ) . doubleValue ( ) - X ) ;
  Collections . sort ( pipes , new Comparator < ArrayList < Double >> ( ) {
    @ Override public int compare ( ArrayList < Double > o1 , ArrayList < Double > o2 ) {
      if ( o1 . get ( 0 ) . doubleValue ( ) > 0 || o2 . get ( N - 1 ) . doubleValue ( ) < 0 ) return "IMPOSSIBLE" ;
      int cutoff = 0 ;
      while ( o1 . get ( cutoff ) . doubleValue ( ) < 0 ) cutoff ++ ;
      double flow = 0 ;
      ArrayList < Double > poss = new ArrayList < Double > ( ) ;
      ArrayList < Double > negs = new ArrayList < Double > ( ) ;
      Collections . reverse ( poss ) ;
      while ( poss . size ( ) > 0 && poss . get ( poss . size ( ) - 1 ) . doubleValue ( ) == 0 ) {
        flow += poss . get ( poss . size ( ) - 1 ) . doubleValue ( ) ;
        -- poss . size ( ) ;
      }
      while ( poss . size ( ) > 0 && negs . size ( ) > 0 ) {
        Double topp = poss . get ( poss . size ( ) - 1 ) ;
        Double topn = negs . get ( negs . size ( ) - 1 ) ;
        double totp = topp . doubleValue ( ) * topp . doubleValue ( ) ;
        double totn = - topn . doubleValue ( ) * topn . doubleValue ( ) ;
        double added = Math . min ( totp , totn ) ;
        double flowp = added / topp . doubleValue ( ) ;
        double flown = - added / topn . doubleValue ( ) ;
        flow += flowp + flown ;
        if ( totp > totn ) {
          -- negs . size ( ) ;
          poss . set ( ( poss . size ( ) - 1 ) . doubleValue ( ) - flowp , ( poss . size ( ) - 1 ) . doubleValue ( ) ) ;
        }
        if ( totp < totn ) {
          -- poss . size ( ) ;
          -- poss . size ( ) ;
        }
      }
      return String . format ( "%.9f" , V / flow ) ;
    }
  }
  