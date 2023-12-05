@ VisibleForTesting static int from ( ) {
  int N = Integer . parseInt ( input ) ;
  int MODN = ( int ) ( 1e9 + 7 ) ;
  int [ ] T = new int [ 10001 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    T [ x ] ++ ;
  }
  int [ ] P = new int [ 10001 ] ;
  for ( int i = 1 ;
  i < 10001 ;
  i ++ ) {
    P [ i ] = P [ i - 1 ] * i % MODN ;
  }
  int nowT = 0 , acm_t = 0 ;
  int pat_n = 1 ;
  for ( int i = 1 ;
  i < 10001 ;
  i ++ ) {
    if ( T [ i ] == 0 ) {
      continue ;
    }
    acm_t += T [ i ] * nowT + i * ( T [ i ] * ( T [ i ] + 1 ) / 2 ) ;
    nowT += i * T [ i ] ;
    pat_n = pat_n * P [ T [ i ] ] % MODN ;
  }
  System . out . println ( acm_t ) ;
  System . out . println ( pat_n ) ;
  return 0 ;
}
