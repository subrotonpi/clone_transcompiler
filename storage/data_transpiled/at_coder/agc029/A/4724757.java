public static int input ( ) {
  int white = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'W' ) {
      white ++ ;
    }
  }
  int cnt = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'W' ) {
      ans += i - cnt ;
      cnt ++ ;
    }
  }
  System . out . println ( ans ) ;
  return white ;
}
