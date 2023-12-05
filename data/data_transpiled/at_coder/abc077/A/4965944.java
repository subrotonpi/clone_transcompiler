public static void print ( String s1 ) {
  String s2 = input ( ) ;
  if ( s1 . charAt ( 0 ) == s2 . charAt ( s2 . length ( ) - 1 ) && s1 . charAt ( 1 ) == s2 . charAt ( 1 ) && s1 . charAt ( s2 . length ( ) - 1 ) == s2 . charAt ( 0 ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
