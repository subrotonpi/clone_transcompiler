@ VisibleForTesting static int [ ] [ ] createCounters ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] cost = new int [ C ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    cost [ i ] = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      cost [ i ] += Lists . newArrayList ( ) ;
    }
  }
  int [ ] color = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    color [ i ] = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      color [ i ] = Lists . newArrayList ( ) ;
    }
  }
  HashMap < Integer , ArrayList < Integer >> mod3 = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int m = ( i + j ) % 3 ;
      mod3 . put ( m , color [ i ] ) ;
    }
  }
  HashMap < Integer , ArrayList < Integer >> cnts = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    cnts . put ( i , new ArrayList < > ( mod3 . get ( i ) ) ) ;
  }
  double ans = Double . POSITIVE_INFINITY ;
  for ( int p [ ] : permutations ( C , 3 ) ) {
    double cond = 0 ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      for ( int col : cnts . keySet ( ) ) {
        cond += cnts . get ( i ) . get ( col ) * cost [ col ] [ p [ i ] ] ;
      }
    }
    ans = Math . min ( ans , cond ) ;
  }
  System . out . println ( ans ) ;
  return null ;
}
