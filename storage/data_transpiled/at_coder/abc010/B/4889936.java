public static int n = Integer . parseInt ( input ) {
  int [ ] a = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int c = 0 ;
  for ( int a_ : a ) {
    if ( ( a_ % 6 ) == 2 ) {
      c ++ ;
    }
    else if ( ( ( a_ % 6 ) == 4 ) | ( ( a_ % 6 ) == 5 ) ) {
      c += ( a_ % 6 ) - 3 ;
    }
    else if ( ( a_ % 6 ) == 0 ) {
      c += 3 ;
    }
  }
  System . out . println ( c ) ;
  return c ;
}
