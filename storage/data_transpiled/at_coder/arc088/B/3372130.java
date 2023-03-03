public static void input ( ) {
  int N = S . length ( ) ;
  int ans = N ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( S . charAt ( i ) != S . charAt ( i + 1 ) ) {
      ans = Math . min ( ans , Math . max ( i + 1 , N - i - 1 ) ) ;
    }
  }
  System . out . println ( ans ) ;
}
