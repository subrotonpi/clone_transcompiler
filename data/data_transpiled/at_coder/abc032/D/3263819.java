@ VisibleForTesting static int [ ] meetInTheMiddle ( @ Nonnull List < Integer > a , int limit ) {
  int [ ] result = new int [ a . size ( ) ] ;
  int [ ] firstV = new int [ a . size ( ) ] , firstW = new int [ a . size ( ) ] , secondV = new int [ a . size ( ) ] , secondW = new int [ a . size ( ) ] ;
  for ( int i = 0 ;
  i < result . length ;
  i ++ ) {
    int v = a . get ( i ) , w = a . get ( i ) ;
    int acc = W > acc + w ? acc + w : W ;
    for ( int j = acc , toV = w - 1 , fromW = w - 1 ;
    j < toV ;
    j ++ ) {
      int w = a . get ( j ) , w = a . get ( i ) ;
      result [ i ] = w + w ;
    }
  }
  System . out . println ( max ( result ) ) ;
  result [ 0 ] = max ( result ) ;
  result [ 1 ] = max ( result ) ;
  result [ 2 ] = max ( result ) ;
  int maxV = - 1 ;
  for ( int i = 1 ;
  i < result . length ;
  i ++ ) {
    int cw = result [ i ] ;
    int cv = result [ i ] ;
    int nw = w - w ;
    if ( cw < nw && maxV < cv ) {
      result [ i ] = v ;
      result [ i ] = w ;
      maxV = w ;
    }
  }
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  result [ 0 ] = max ( result ) ;
  if ( N <= 30 ) {
    result [ 1 ] = maxV ;
    result [ 2 ] = maxV ;
    result [ 3 ] = maxW ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < result . length ;
    i ++ ) {
      int v = result [ i ] ;
      int w = result [ i ] ;
      int i = result [ i ] ;
      int w = result [ i ] ;
      if ( w > fromW ) {
        result [ i ] = fromW + w ;
      }
    }
  }
  for ( int i = 0 ;
  i < result . length ;
  i ++ ) {
    result [ i ] = result [ i ] ;
  }
  return result ;
}
