public static String input ( ) {
  int cond = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    switch ( cond ) {
      case 0 : if ( "Ii" . equals ( s . charAt ( i ) ) ) {
        cond ++ ;
      }
      break ;
    }
  }
  return "YES" ;
}
