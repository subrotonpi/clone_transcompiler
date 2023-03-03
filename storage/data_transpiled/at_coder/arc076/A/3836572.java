public static int [ ] [ ] ints ( Scanner input ) {
  int a = input . nextInt ( ) ;
  int b = input . nextInt ( ) ;
  int c = 1 ;
  int d = 1 ;
  for ( int i = 2 ;
  i <= a ;
  i ++ ) {
    c = ( c * i ) % ( 10 * 9 + 7 ) ;
  }
  for ( int i = 2 ;
  i <= b ;
  i ++ ) {
    d = ( d * i ) % ( 10 * 9 + 7 ) ;
  }
  if ( Math . abs ( a - b ) >= 2 ) {
    System . out . println ( 0 ) ;
  }
  else if ( a == b ) {
    System . out . println ( ( ( c * d ) * 2 ) % ( 10 * 9 + 7 ) ) ;
  }
  else {
    System . out . println ( ( c * d ) % ( 10 * 9 + 7 ) ) ;
  }
  return ints ( a , b ) ;
}
