public static void input ( ) {
  int N = S . length ( ) ;
  int ans = 0 ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    if ( S . charAt ( k ) == 'U' ) {
      ans += N - k - 1 ;
    }
    else {
      ans += 2 * ( N - k - 1 ) ;
    }
  }
  S . delete ( 0 , N ) ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    if ( S . charAt ( k ) == 'D' ) {
      ans += N - k - 1 ;
    }
    else {
      ans += 2 * ( N - k - 1 ) ;
    }
  }
  System . out . println ( ans ) ;
}
