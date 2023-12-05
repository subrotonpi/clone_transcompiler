public static String input ( ) {
  String s = input ( ) ;
  String ans = "WA" ;
  if ( s . charAt ( 0 ) == 'A' ) {
    if ( s . substring ( 2 , s . length ( ) - 1 ) . indexOf ( "C" ) == 1 ) {
      if ( Character . isLowerCase ( s . charAt ( 1 ) ) && Character . isLowerCase ( s . charAt ( s . length ( ) - 1 ) ) ) {
        s = s . replace ( "C" , "c" ) . replace ( "A" , "a" ) ;
        if ( Character . isLowerCase ( s . charAt ( 0 ) ) ) {
          ans = "AC" ;
        }
      }
    }
  }
  return ans ;
}
