public static String S = input ( ) {
  String S ;
  while ( ( S = S . substring ( 0 , S . length ( ) - 1 ) ) != null ) {
    if ( S . length ( ) % 2 == 0 ) {
      String SA = S . substring ( 0 , S . length ( ) / 2 ) ;
      String SB = S . substring ( S . length ( ) / 2 ) ;
      if ( SA . equals ( SB ) ) {
        System . out . println ( S . length ( ) ) ;
        break ;
      }
    }
  }
  return S ;
}
