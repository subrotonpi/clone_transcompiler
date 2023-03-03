public static String [ ] split ( String input ) {
  int s = Integer . parseInt ( input ) ;
  int t = Integer . parseInt ( input ) ;
  int c = 0 ;
  for ( int i = 0 ;
  i < s ;
  i ++ ) {
    for ( int j = 0 ;
    j < t ;
    j ++ ) {
      if ( s == t ) {
        c ++ ;
      }
    }
  }
  return ( c > 0 ? "YES" : "NO" ) ;
}
