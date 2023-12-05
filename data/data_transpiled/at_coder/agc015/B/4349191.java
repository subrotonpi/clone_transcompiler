public static void input ( ) {
  int N = S . length ( ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i ) == 'U' ) {
      cnt += N + i - 1 ;
    }
    else {
      cnt += 2 * N - i - 2 ;
    }
  }
  System . out . println ( cnt ) ;
}
