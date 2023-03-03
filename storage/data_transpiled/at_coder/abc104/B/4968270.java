public static void input ( ) {
  String S = input ( ) ;
  if ( S . charAt ( 0 ) == 'A' && S . substring ( 2 , S . length ( ) - 1 ) . indexOf ( 'C' ) == 1 ) {
    for ( int i = 1 ;
    i < S . length ( ) ;
    i ++ ) {
      char s = S . charAt ( i ) ;
      if ( ! s . equals ( 'C' ) && Character . isUpperCase ( s ) ) {
        System . out . println ( "WA" ) ;
        exit ( ) ;
      }
    }
    System . out . println ( "AC" ) ;
  }
  else {
    System . out . println ( "WA" ) ;
  }
}
