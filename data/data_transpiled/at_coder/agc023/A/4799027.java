public static void print ( int N ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] S = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i + 1 ] = A [ i ] + S [ i ] ;
  }
  Map < Integer , Integer > D = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    if ( S [ i ] >= 0 ) {
      D . put ( S [ i ] , 1 ) ;
    }
    else {
      D . put ( S [ i ] , 1 ) ;
    }
  }
  int ans = 0 ;
  for ( int k : D . keySet ( ) ) {
    int t = D . get ( k ) ;
    ans += ( t * ( t - 1 ) ) / 2 ;
  }
  System . out . println ( ans ) ;
}
