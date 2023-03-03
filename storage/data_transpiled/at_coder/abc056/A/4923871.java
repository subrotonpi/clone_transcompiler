public static String print ( char a , char b ) {
  if ( a == 'H' ) {
    if ( b == 'H' ) {
      System . out . println ( "H" ) ;
    }
    else {
      System . out . println ( "D" ) ;
    }
  }
  else {
    if ( b == 'D' ) {
      System . out . println ( "H" ) ;
    }
    else {
      System . out . println ( "D" ) ;
    }
  }
  return a + " " + b ;
}
