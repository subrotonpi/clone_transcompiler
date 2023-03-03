public static int [ ] [ ] a ( int [ ] [ ] input ) {
  int a = Integer . parseInt ( input [ 0 ] [ 0 ] ) , b = Integer . parseInt ( input [ 1 ] [ 0 ] ) ;
  if ( ( b % a ) == 0 ) {
    System . out . println ( a + b ) ;
  }
  else {
    System . out . println ( b - a ) ;
  }
  return new int [ ] [ ] {
    a , b }
    ;
  }
  