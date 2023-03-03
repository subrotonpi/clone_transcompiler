static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * * 9 + 7 ;
/* LI */
for ( String s : System . console ( ) . split ( " " ) ) {
  /* LI_ */
  for ( String x : System . console ( ) . split ( " " ) ) {
    /* LS */
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      /* LS */
    }
  }
  /* II */
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    /* SI */
  }
  /* main */
  int n = II . nextInt ( ) ;
  int [ ] P = new int [ n ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    P [ i ] = II . nextInt ( ) ;
  }
  int [ ] dp = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) {
    dp [ i ] += dp [ i - 1 ] + 1 ;
  }
  return n - Math . max ( dp ) ;
}
