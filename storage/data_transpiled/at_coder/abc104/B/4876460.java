public static void enter ( ) {
  String s = input ( ) ;
  if ( s . charAt ( 0 ) == 'A' ) {
    if ( s . substring ( 2 , s . length ( ) - 1 ) . indexOf ( "C" ) == 1 ) {
      if ( Character . isLowerCase ( s . charAt ( 1 ) ) && Character . isLowerCase ( s . charAt ( 2 ) ) ) {
        s = s . replace ( "C" , "c" ) ;
      }
    }
  }
  System . out . println ( "WA" ) ;
}
