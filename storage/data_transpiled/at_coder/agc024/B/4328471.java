public static int [ ] solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] P = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] Q = new int [ n ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    Q [ P [ i ] - 1 ] = i ;
  }
  int cresc = 1 ;
  int cnt = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( Q [ i - 1 ] < Q [ i ] ) {
      cnt ++ ;
    }
    else {
      cresc = Math . max ( cresc , cnt ) ;
      cnt = 1 ;
    }
    cresc = Math . max ( cresc , cnt ) ;
  }
  return P ;
}
