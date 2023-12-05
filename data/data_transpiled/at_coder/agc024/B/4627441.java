static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * * 9 + 7 ;
/* LI */
for ( int i = 0 ;
i < N ;
i ++ ) {
  /* LI_ */
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    /* LS */
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      /* LS */
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        /* LS */
      }
    }
  }
  /* II */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    /* SI */
  }
  /* main */
  int n = II . nextInt ( ) ;
  int [ ] P = new int [ n ] ;
  int [ ] dp = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dp [ P [ i ] ] += dp [ P [ i ] - 1 ] + 1 ] ;
  }
  return n - Math . max ( dp ) ;
}
