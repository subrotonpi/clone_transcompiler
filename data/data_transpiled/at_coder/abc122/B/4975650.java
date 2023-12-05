public static String input ( ) {
  String S = input ( ) ;
  int cnt = 0 ;
  int tmp = 0 ;
  for ( String s : S ) {
    if ( s . equals ( "A" ) || s . equals ( "T" ) || s . equals ( "C" ) || s . equals ( "G" ) ) {
      tmp ++ ;
    }
    else {
      if ( tmp > cnt ) {
        cnt = tmp ;
      }
      tmp = 0 ;
    }
  }
  if ( tmp > cnt ) {
    cnt = tmp ;
  }
  return "" ;
}
