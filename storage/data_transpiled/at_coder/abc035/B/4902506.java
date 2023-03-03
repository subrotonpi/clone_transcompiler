public static int getDigit ( ) {
  Scanner s = new Scanner ( System . in ) ;
  int x = Math . abs ( s . nextInt ( ) - s . nextInt ( ) ) + Math . abs ( s . nextInt ( ) - s . nextInt ( ) ) ;
  int c = s . nextInt ( ) ;
  if ( Integer . parseInt ( input . nextLine ( ) ) == 1 ) {
    System . out . println ( x + c ) ;
  }
  else if ( c <= x ) {
    System . out . println ( x - c ) ;
  }
  else {
    System . out . println ( ( x + c ) % 2 ) ;
  }
  return x ;
}
