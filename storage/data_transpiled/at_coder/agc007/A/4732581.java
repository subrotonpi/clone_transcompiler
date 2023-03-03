public static int a , int b , char ... c ) {
  int i = new Scanner ( System . in ) . nextInt ( ) ;
  if ( Integer . parseInt ( a ) + Integer . parseInt ( b ) - 1 == Integer . parseInt ( c [ i ] ) ) {
    System . out . println ( "Possible" ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
  return i ;
}
