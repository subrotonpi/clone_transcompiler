public static String S = input ( ) {
  if ( S . substring ( 0 , 11 ) . equals ( "WBWBWWBWBWB" ) ) {
    System . out . println ( "Do" ) ;
  }
  else if ( S . substring ( 0 , 9 ) . equals ( "WBWWBWBWBWB" ) ) {
    System . out . println ( "Re" ) ;
  }
  else if ( S . substring ( 0 , 7 ) . equals ( "WWBWBWBWB" ) ) {
    System . out . println ( "Mi" ) ;
  }
  else if ( S . substring ( 0 , 6 ) . equals ( "WBWBWBWB" ) ) {
    System . out . println ( "Fa" ) ;
  }
  else if ( S . substring ( 0 , 11 ) . equals ( "WBWBWWBWBWBWW" ) ) {
    System . out . println ( "So" ) ;
  }
  else if ( S . substring ( 0 , 9 ) . equals ( "WBWWBWBWBWW" ) ) {
    System . out . println ( "La" ) ;
  }
  else {
    System . out . println ( "Si" ) ;
  }
  return "" ;
}
