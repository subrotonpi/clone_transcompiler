public static void input ( ) {
  String s = input ( ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    switch ( s . charAt ( i ) ) {
      case '0' : ans . append ( '0' ) ;
      break ;
      case '1' : ans . append ( '1' ) ;
      break ;
      case 'B' : ans . append ( 'A' ) ;
      break ;
    }
  }
  System . out . println ( ans ) ;
}
