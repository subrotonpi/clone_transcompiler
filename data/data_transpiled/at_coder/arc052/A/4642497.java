public static void print ( String s ) {
  String [ ] num = new String [ 10 ] ;
  for ( int i = 0 ;
  i < num . length ;
  i ++ ) {
    num [ i ] = String . valueOf ( i ) ;
  }
  String ans = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( num [ i ] . contains ( s ) ) {
      ans += s . charAt ( i ) ;
    }
  }
  System . out . println ( ans ) ;
}
