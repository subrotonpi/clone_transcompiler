public static List < Integer > inpl ( ) {
  return Arrays . asList ( input . split ( " " ) ) ;
  int C = inpl ( ) ;
  int B = inpl ( ) ;
  int A = inpl ( ) ;
  if ( ( B - C ) % 2 == 0 ) {
    System . out . println ( ( 2 * A - B - C ) / 2 ) ;
  }
  else {
    System . out . println ( ( 2 * A - B - C + 3 ) / 2 ) ;
  }
  return Arrays . asList ( ) ;
}
