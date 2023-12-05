public static void s_long ( ) {
  int count = 0 ;
  String prev = "" ;
  for ( String s : s_long ) {
    if ( prev . isEmpty ( ) ) {
      prev = s ;
      continue ;
    }
    if ( prev . equals ( s ) ) {
      count ++ ;
      prev = s ;
    }
  }
  System . out . println ( count ) ;
}
