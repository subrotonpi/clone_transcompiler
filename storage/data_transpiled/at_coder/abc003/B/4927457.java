private static void print ( String s ) {
  String t = list ( input ) ;
  String x = list ( "atcorder@" ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '@' && t . indexOf ( x ) == - 1 ) {
      continue ;
    }
    else {
      System . out . println ( "You will lose" ) ;
      exit ;
    }
  }
}
