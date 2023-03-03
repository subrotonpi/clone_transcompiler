public static int a ( ) {
  int a , b ;
  a = input . nextInt ( ) ;
  b = input . nextInt ( ) ;
  if ( a < b ) {
    System . out . println ( "<" ) ;
  }
  else if ( a > b ) {
    System . out . println ( ">" ) ;
  }
  else {
    System . out . println ( "=" ) ;
  }
  return a ;
}
