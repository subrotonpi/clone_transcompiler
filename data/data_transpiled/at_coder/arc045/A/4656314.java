public static String input ( ) {
  String S = input . split ( " " ) ;
  String res = "" ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( S [ i ] . equals ( "Left" ) ) {
      res += "< " ;
    }
    else if ( S [ i ] . equals ( "Right" ) ) {
      res += "> " ;
    }
    else {
      res += "A " ;
    }
  }
  System . out . println ( res . substring ( 0 , res . length ( ) - 1 ) ) ;
  return res ;
}
