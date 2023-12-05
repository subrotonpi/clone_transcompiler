@ VisibleForTesting static int from ( int input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int cand = 1 ;
  for ( int i = 1 ;
  i <= ( int ) Math . sqrt ( M ) ;
  i ++ ) {
    if ( M % i == 0 ) {
      if ( M >= ( M / i ) * N ) cand = Math . max ( cand , M / i ) ;
    }
    else if ( M >= i * N ) cand = Math . max ( cand , i ) ;
  }
  return cand ;
}
