public static void print ( String s ) {
  s = input . split ( "\\s+" ) ;
  String result = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    result += s [ i ] . charAt ( 0 ) ;
  }
  System . out . println ( result ) ;
}
