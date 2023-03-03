public static void print ( String S ) {
  int w_count = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( ( S . charAt ( i ) == 'W' ) ) {
      ans += i - w_count ;
      w_count ++ ;
    }
  }
  System . out . println ( ans ) ;
}
