public static String S = new LinkedList < String > ( ) {
  @ Override public String get ( ) {
    int Flag = 0 ;
    if ( ( S . get ( 0 ) . equals ( "A" ) ) ) {
      Flag ++ ;
    }
    if ( ( S . substring ( 2 , S . length ( ) - 1 ) . indexOf ( "C" ) == 1 ) ) {
      Flag ++ ;
    }
    if ( ( Flag == 2 ) ) {
      S . remove ( "A" ) ;
      S . remove ( "C" ) ;
      if ( ( S . toString ( ) . toLowerCase ( ) . indexOf ( "A" ) == - 1 ) ) {
        Flag ++ ;
      }
    }
    if ( ( Flag == 3 ) ) {
      System . out . println ( "AC" ) ;
    }
    else {
      System . out . println ( "WA" ) ;
    }
    return S ;
  }
}
