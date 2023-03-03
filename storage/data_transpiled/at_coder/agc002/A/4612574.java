public static int [ ] getNegativeNumbers ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( 0 < a ) {
    System . out . println ( "Positive" ) ;
  }
  else if ( a <= 0 && 0 <= b ) {
    System . out . println ( "Zero" ) ;
  }
  else if ( ( b - a ) % 2 == 0 ) {
    System . out . println ( "Negative" ) ;
  }
  else {
    System . out . println ( "Positive" ) ;
  }
  return new int [ ] {
    a , b }
    ;
  }
  