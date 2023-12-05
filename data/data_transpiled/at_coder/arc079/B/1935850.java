static final int [ ] getN ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = 50 ;
  int [ ] As = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) As [ i ] = N - 1 ;
  int ind = 0 ;
  int modk = K % 50 ;
  int base = 49 + K / 50 - modk ;
  int [ ] ans = new int [ N ] ;
  if ( modk != 0 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) if ( i >= N ) ans [ ind ++ ] = base + N + 1 ;
  }
  else ans = new int [ N ] ;
  return ans ;
}
