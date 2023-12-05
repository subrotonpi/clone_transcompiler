public static int input ( ) {
  String s = input ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'D' ) {
      ans += i * 1 + ( s . length ( ) - i - 1 ) * 2 ;
    }
    else {
      ans += i * 2 + ( s . length ( ) - i - 1 ) * 1 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
