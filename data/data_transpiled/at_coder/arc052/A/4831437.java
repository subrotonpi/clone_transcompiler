public static void input ( ) {
  String s = input ( ) ;
  String num = "1234567890" ;
  String res = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . contains ( num ) ) {
      res += s . charAt ( i ) ;
    }
  }
  System . out . println ( res ) ;
}
