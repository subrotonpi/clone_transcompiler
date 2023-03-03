static final int [ ] binarySearch ( int N , int K ) {
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) B [ i ] = Integer . parseInt ( input ( ) ) ;
  int minp = A [ 0 ] * B [ 0 ] ;
  int maxp = A [ N - 1 ] * B [ N - 1 ] ;
  if ( K == 1 ) {
    System . out . println ( minp ) ;
    exit ( ) ;
  }
  if ( K == N * N ) {
    System . out . println ( maxp ) ;
    exit ( ) ;
  }
  /* enough */
  int cnt = 0 ;
  for ( int a : A ) {
    cnt += binarySearch ( B , a ) ;
    if ( cnt >= K ) return true ;
  }
  int ng = 0 ;
  int ok = maxp ;
  while ( ok - ng > 1 ) {
    int m = ( ok + ng ) / 2 ;
    if ( big ( m ) ) ok = m ;
    else ng = m ;
  }
  System . out . println ( ok ) ;
  return null ;
}
