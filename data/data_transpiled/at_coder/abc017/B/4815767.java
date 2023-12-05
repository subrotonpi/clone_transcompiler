public static void input ( String x ) {
  String t = x . replace ( "ch" , "X" ) ;
  for ( int i = 0 ;
  i < t . length ( ) ;
  i ++ ) {
    switch ( t . charAt ( i ) ) {
      case 'X' : case 'o' : case 'k' : case 'u' : continue ;
      default : System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  else System . out . println ( "YES" ) ;
}
