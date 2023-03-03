static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > [ ] WP = new ArrayList [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    WP [ i ] = new ArrayList < Integer > ( ) ;
  }
  /* dense */
  int nw = 0 ;
  int np = 0 ;
  int [ ] check = new int [ N ] ;
  for ( int test = 0 ;
  test < K ;
  test ++ ) {
    int ANS = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( check [ i ] == 1 ) continue ;
      int neww = dense ( nw , np , WP [ i ] . get ( 0 ) , WP [ i ] . get ( 1 ) ) ;
      if ( ANS < newp ) {
        ANS = newp ;
        nextw = neww ;
        nextind = i ;
      }
    }
    check [ nextind ] = 1 ;
    nw = nextw ;
    np = ANS ;
  }
  System . out . println ( ANS ) ;
}
