public static void input ( ) {
  int n = S . length ( ) ;
  int ans = n ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( S . charAt ( i + 1 ) != S . charAt ( i ) ) {
      ans = Math . min ( ans , Math . max ( i + 1 , n - i - 1 ) ) ;
    }
  }
  System . out . println ( ans ) ;
}
