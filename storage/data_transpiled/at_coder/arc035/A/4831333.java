public static void input ( ) {
  String s = input ( ) ;
  char [ ] t = s . toCharArray ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == t [ i ] || s . charAt ( i ) == '*' || t [ i ] == '*' ) {
      continue ;
    }
    else {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "YES" ) ;
}
