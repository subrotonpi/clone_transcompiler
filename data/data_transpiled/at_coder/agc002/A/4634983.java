public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( 0 < a ) {
    System . out . println ( "Positive" ) ;
  }
  else if ( 0 <= b ) {
    System . out . println ( "Zero" ) ;
  }
  else {
    if ( Math . abs ( a - b ) % 2 == 0 ) {
      System . out . println ( "Negative" ) ;
    }
    else {
      System . out . println ( "Positive" ) ;
    }
  }
}
