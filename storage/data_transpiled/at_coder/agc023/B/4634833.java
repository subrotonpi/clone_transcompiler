static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * * 9 + 7 ;
/* LI */
for ( int i = 0 ;
i < Integer . MAX_VALUE ;
i ++ ) {
  /* LI_ */
  for ( int j = 0 ;
  j < MOD ;
  j ++ ) {
    /* LS */
    for ( int j = 0 ;
    j < MOD ;
    j ++ ) {
      /* LS */
      for ( int j = 0 ;
      j < MOD ;
      j ++ ) {
        /* LS */
        for ( int j = 0 ;
        j < MOD ;
        j ++ ) {
          /* LS */
        }
      }
    }
  }
  /* II */
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  /* SI */
  Scanner scanner = new Scanner ( System . in ) ;
  /* main */
  int n = scanner . nextInt ( ) ;
  /* I */
  int [ ] B = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    B [ i ] = scanner . nextInt ( ) ;
  }
  /* BT */
  int [ ] BT = new int [ n ] ;
  int res = 0 ;
  for ( int a = 0 ;
  a < n ;
  a ++ ) {
    boolean isGood = true ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( B [ i ] > n - a ) {
        if ( B [ i ] + B [ i ] != '' ) {
          isGood = false ;
        }
      }
    }
    if ( isGood ) {
      res += n ;
    }
  }
  return res ;
}
