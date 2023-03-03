public static void input ( ) {
  String s = input ( ) ;
  int m = s . length ( ) ;
  int ans = 2 * ( m - 1 ) ;
  for ( int i = 1 ;
  i < m - 1 ;
  i ++ ) {
    ans += i + ( m - i - 1 ) ;
    if ( s . charAt ( i ) == 'D' ) {
      ans += m - i - 1 ;
    }
    else {
      ans += i ;
    }
  }
  System . out . println ( ans ) ;
}
