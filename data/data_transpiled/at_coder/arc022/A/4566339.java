public static String input ( ) {
  String s = "ICT" ;
  int e = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( e < 3 ) {
      if ( d . charAt ( e ) == String . toUpperCase ( s . charAt ( i ) ) ) {
        e ++ ;
      }
    }
  }
  return ( e != 3 ? "NO" : "YES" ) ;
}
