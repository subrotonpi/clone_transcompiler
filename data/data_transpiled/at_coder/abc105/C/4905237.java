public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String s_rev = "" ;
  while ( n != 0 ) {
    s_rev += String . valueOf ( n % 2 ) ;
    n = n / ( - 2 ) + n % 2 ;
  }
  String s = "" ;
  for ( int i = 0 ;
  i < s_rev . length ( ) ;
  i ++ ) {
    s += s_rev . charAt ( s_rev . length ( ) - i - 1 ) ;
  }
  if ( s . equals ( "" ) ) {
    System . out . println ( "0" ) ;
  }
  else {
    System . out . println ( s ) ;
  }
}
