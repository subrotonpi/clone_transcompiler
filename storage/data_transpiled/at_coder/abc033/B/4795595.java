public static void print ( int N = Integer . parseInt ( input ) ) {
  int [ ] S = new int [ N ] ;
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String [ ] SP = input . split ( " " ) ;
    S [ i ] = SP [ 0 ] ;
    P [ i ] = SP [ 1 ] ;
  }
  System . out . println ( max ( P ) * 2 > sum ( P ) ? S : "atcoder" ) ;
}
