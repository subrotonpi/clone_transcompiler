public static void print ( String s ) {
  s = s . trim ( ) ;
  int y = Integer . parseInt ( s . substring ( 0 , 4 ) ) ;
  int m = Integer . parseInt ( s . substring ( 5 , 7 ) ) ;
  int d = Integer . parseInt ( s . substring ( 8 ) ) ;
  if ( y < 2019 ) {
    System . out . println ( "Heisei" ) ;
  }
  else if ( y > 2019 ) {
    System . out . println ( "TBD" ) ;
  }
  else {
    if ( m <= 4 ) {
      System . out . println ( "Heisei" ) ;
    }
    else {
      System . out . println ( "TBD" ) ;
    }
  }
}
