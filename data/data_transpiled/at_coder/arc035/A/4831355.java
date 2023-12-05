public static void input ( ) {
  s = input ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == s . charAt ( s . length ( ) - i - 1 ) || s . charAt ( i ) == '*' ) {
      continue ;
    }
    else {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "YES" ) ;
}
