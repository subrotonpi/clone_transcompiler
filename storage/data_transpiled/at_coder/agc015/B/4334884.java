public static void input ( ) {
  int n = S . length ( ) ;
  int ans = 2 * n - 2 ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    if ( S . charAt ( i ) == 'U' ) {
      ans += n + i - 1 ;
    }
    else {
      ans += 2 * n - i - 2 ;
    }
  }
  System . out . println ( ans ) ;
}
