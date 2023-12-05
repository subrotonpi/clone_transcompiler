static void solve ( @ Nonnull int N , int M , @ Nonnull List < Integer > A ) {
  int [ ] costs = {
    10 * 18 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 }
    ;
    List < Pair < Integer , Integer >> cand = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < A . size ( ) ;
    i ++ ) {
      cand . add ( new Pair < > ( A . get ( i ) , costs [ i ] ) ) ;
    }
    Collections . sort ( cand , Collections . reverseOrder ( ) ) ;
    int [ ] digits = new int [ N + 1 ] ;
    for ( int i = 0 ;
    i < digits . length ;
    i ++ ) {
      digits [ i ] = - 1 * 10 * 16 ;
      for ( Pair < Integer , Integer > c : cand ) {
        if ( i - c . second >= 0 ) {
          r = Math . max ( r , digits [ i - c . second ] + 1 ) ;
        }
      }
      digits [ i ] = r ;
    }
    int digit = digits [ N ] ;
    int lastCost = N ;
    int result = 0 ;
    for ( int i = 0 ;
    i < digit ;
    i ++ ) {
      for ( Pair < Integer , Integer > c : cand ) {
        if ( lastCost - c . second >= 0 && digits [ lastCost - c . second ] == digits [ lastCost - 1 ] ) {
          result = result * 10 + c . first ;
          lastCost = lastCost - c . second ;
          break ;
        }
      }
    }
    System . out . println ( result ) ;
    return ;
  }
  