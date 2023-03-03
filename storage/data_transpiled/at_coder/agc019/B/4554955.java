public static void input ( ) {
  int N = S . length ( ) ;
  int ans = 1 + N * ( N - 1 ) / 2 ;
  int [ ] ct = new int [ 26 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = ( int ) ( S . charAt ( i ) - 'a' ) ;
    ct [ i ] ++ ;
  }
  for ( int a : ct ) {
    ans -= a * ( a - 1 ) / 2 ;
  }
  System . out . println ( ans ) ;
}
