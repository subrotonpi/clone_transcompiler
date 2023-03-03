public static char b ( ) {
  char b ;
  if ( ( b = input . charAt ( 0 ) ) == 'A' ) {
    System . out . print ( 'T' ) ;
  }
  else if ( ( b = input . charAt ( 1 ) ) == 'T' ) {
    System . out . print ( 'A' ) ;
  }
  else if ( ( b = input . charAt ( 2 ) ) == 'C' ) {
    System . out . print ( 'G' ) ;
  }
  else if ( ( b = input . charAt ( 3 ) ) == 'G' ) {
    System . out . print ( 'C' ) ;
  }
  return b ;
}
