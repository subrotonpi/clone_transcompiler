public static void input ( Scanner i ) {
  String [ ] x = i . nextLine ( ) . split ( "/" ) ;
  if ( Integer . parseInt ( x [ 0 ] ) < 2019 ) {
    System . out . println ( "Heisei" ) ;
  }
  else if ( Integer . parseInt ( x [ 0 ] ) == 2019 ) {
    if ( Integer . parseInt ( x [ 1 ] ) < 5 ) {
      System . out . println ( "Heisei" ) ;
    }
    else {
      System . out . println ( "TBD" ) ;
    }
  }
  else {
    System . out . println ( "TBD" ) ;
  }
}
