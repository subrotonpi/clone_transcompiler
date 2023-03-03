private static String [ ] S ( ) {
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < sb . length ( ) ;
  i ++ ) {
    char check = sb . charAt ( i ) ;
    switch ( check ) {
      case 'O' : case 'D' : sb . append ( '0' ) ;
      break ;
      case 'I' : sb . append ( '1' ) ;
      break ;
      case 'Z' : sb . append ( '2' ) ;
      break ;
    }
  }
  return sb . toString ( ) ;
}
