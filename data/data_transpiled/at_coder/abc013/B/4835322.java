public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input ) ;
  int c = Math . abs ( a - b ) ;
  if ( c <= 4 ) {
    System . out . println ( c ) ;
  }
  else {
    System . out . println ( 9 - c + 1 ) ;
  }
  return c ;
}
