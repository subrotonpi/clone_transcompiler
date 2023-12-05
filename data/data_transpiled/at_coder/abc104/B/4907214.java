public static String input ( ) {
  String S = input ( ) ;
  if ( S . charAt ( 0 ) == 'A' && S . substring ( 2 , S . length ( ) - 1 ) . indexOf ( "C" ) == 1 && S . indexOf ( "A" ) == 1 && S . indexOf ( "C" ) == 1 ) {
    S = S . replace ( "A" , "a" ) ;
    S = S . replace ( "C" , "c" ) ;
    if ( Character . isLowerCase ( S . charAt ( 0 ) ) ) {
      System . out . println ( "AC" ) ;
    }
    else {
      System . out . println ( "WA" ) ;
    }
  }
  else {
    System . out . println ( "WA" ) ;
  }
  return S ;
}
