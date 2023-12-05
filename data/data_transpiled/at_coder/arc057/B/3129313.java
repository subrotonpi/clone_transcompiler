@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Arrays . equals ( a , K ) || K == 0 ) {
    System . out . println ( Integer . valueOf ( K > 0 ) ) ;
    exit ( ) ;
  }
  float inf = Float . POSITIVE_INFINITY , acc = Integer . valueOf ( accumulate ( a ) ) ;
  int [ ] dp = new int [ N + 1 ] ;
  dp [ 0 ] = inf ;
  for ( int i = 1 , pGame = acc . length ;
  i < pGame ;
  i ++ ) {
    int cGame = acc [ i ] ;
    for ( int j = i + 1 , win = dp [ j ] ;
    j > 0 ;
    j -- , win -- ) {
      int req = ( cGame * win ) / pGame + 1 ;
      if ( req <= K && req <= cGame ) dp [ j ] = Math . min ( dp [ j ] , req ) ;
    }
  }
  for ( int i = N , n = dp . length ;
  i > 0 ;
  i -- ) {
    if ( n < inf ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  return dp ;
}
