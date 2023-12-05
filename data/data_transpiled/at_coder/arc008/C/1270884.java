@ VisibleForTesting static int [ ] [ ] dijkstra ( int [ ] [ ] matrix ) {
  int n = matrix . length ;
  int inf = 10 * 10 ;
  int [ ] hq = new int [ n ] ;
  int [ ] ans = new int [ n ] ;
  Arrays . fill ( ans , inf ) ;
  ans [ 0 ] = 0 ;
  heapSort ( hq , ( int ) 0 ) ;
  while ( hq . length > 0 ) {
    int d = hq [ 0 ] ;
    int p = hq [ 1 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ans [ p ] == d && p != i && d + matrix [ p ] [ i ] < ans [ i ] ) {
        ans [ i ] = d + matrix [ p ] [ i ] ;
        heapSort ( hq , ( int ) ans [ i ] ) ;
      }
    }
  }
  return ans ;
}
