public static void input ( ) {
  String s = input ( ) ;
  String num = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) >= '0' ) {
      num += s . charAt ( i ) ;
    }
  }
  System . out . println ( num ) ;
}
