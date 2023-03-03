public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( A ) ;
  /* if (A[i] != 0) {
  return gcd(B, A[i] != 0);
  }*/
  int cur = A [ 0 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cur = gcd ( A [ i ] , cur ) ;
  }
  if ( max ( A ) < K ) {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
  else {
    if ( K % cur != 0 ) {
      System . out . println ( "IMPOSSIBLE" ) ;
    }
    else {
      System . out . println ( "POSSIBLE" ) ;
    }
  }
  return cur ;
}
