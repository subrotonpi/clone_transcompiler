public static int input ( ) {
  int plus = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( s . length ( ) - 1 - i ) == 'W' ) {
      plus ++ ;
    }
    else {
      ans += plus ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
