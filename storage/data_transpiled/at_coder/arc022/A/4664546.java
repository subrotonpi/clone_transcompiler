public static String input ( ) {
  int lS = S . length ( ) ;
  int index = 0 ;
  int s_i = 0 ;
  String s1 = "ict" ;
  String s2 = "ICT" ;
  while ( index < lS ) {
    if ( S . charAt ( index ) == s1 . charAt ( s_i ) || S . charAt ( index ) == s2 . charAt ( s_i ) ) {
      s_i ++ ;
      if ( s_i == 3 ) {
        System . out . println ( "YES" ) ;
        break ;
      }
    }
    index ++ ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return "" ;
}
