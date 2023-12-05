public static void print ( int N ) {
  int [ ] St = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    St [ i ] = Math . max ( St [ i - 1 ] + 1 , 1 ) ;
  }
  System . out . println ( N - max ( St ) ) ;
}
