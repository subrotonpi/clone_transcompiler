public static void input ( ) {
  String s = input ( ) ;
  String t = input ( ) ;
  Set < String > safe = new HashSet < String > ( "atcoder" ) ;
  String output = "You can win" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == t . charAt ( i ) || ( s . charAt ( i ) == '@' && t . indexOf ( t ) >= 0 ) || ( t . charAt ( i ) == '@' && s . indexOf ( t ) >= 0 ) ) {
    }
    else {
      output = "You will lose" ;
      break ;
    }
  }
  System . out . println ( output ) ;
}
