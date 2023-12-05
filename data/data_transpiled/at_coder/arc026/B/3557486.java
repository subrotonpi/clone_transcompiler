static final int N = Integer . parseInt ( input ) {
  int [ ] NUM = new int [ 10 ] ;
  int [ ] CNUM = new int [ 10 ] ;
  int M = N ;
  int flg = 0 ;
  for ( int i = 2 ;
  i < 10 * 5 ;
  i ++ ) {
    int x = 0 ;
    if ( N % i == 0 ) {
      flg = 1 ;
      NUM [ i ] = i ;
      while ( N % i == 0 ) {
        N = N / i ;
        x ++ ;
      }
      CNUM [ i ] = x ;
    }
  }
  if ( ( N > 10 * 5 ) && ( flg == 0 ) ) {
    NUM [ 0 ] = N ;
    CNUM [ 0 ] = 1 ;
  }
  if ( ( flg == 0 ) && ( N > 10 * 5 ) ) {
    System . out . println ( "Deficient" ) ;
    quit ( ) ;
  }
  int ANS = 1 ;
  for ( int i = 0 ;
  i < NUM . length ;
  i ++ ) {
    double CL = 0 ;
    for ( int j = 0 ;
    j < CNUM [ i ] + 1 ;
    j ++ ) {
      CL += Math . pow ( NUM [ i ] , j ) ;
    }
    ANS *= CL ;
  }
  ANS -= M ;
  if ( ( ANS == M ) && ( M == M ) ) {
    System . out . println ( "Perfect" ) ;
  }
  else if ( ( ANS > M ) && ( M < M ) ) {
    System . out . println ( "Abundant" ) ;
  }
  else {
    System . out . println ( "Deficient" ) ;
  }
  return M ;
}
