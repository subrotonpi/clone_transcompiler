public static int [ ] getIntegerArray ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  if ( a == b ) {
    System . out . println ( c ) ;
  }
  else if ( b == c ) {
    System . out . println ( a ) ;
  }
  else if ( a == c ) {
    System . out . println ( b ) ;
  }
  else {
    System . out . println ( "wrong" ) ;
  }
  return new int [ ] {
    a , b , c }
    ;
  }
  