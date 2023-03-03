public static void input ( ) {
  String num = "1234567890" ;
  String ans = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( num . contains ( s . charAt ( i ) ) ) {
      ans += s . charAt ( i ) ;
    }
  }
  System . out . println ( Integer . parseInt ( ans ) ) ;
}
