public static void input ( ) {
  String s = input ( ) ;
  int pos = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'W' ) {
      ans += i - pos ;
      pos ++ ;
    }
  }
  System . out . println ( ans ) ;
}
