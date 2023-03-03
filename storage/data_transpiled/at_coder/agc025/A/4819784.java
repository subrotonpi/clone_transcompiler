static int [ ] NL = new int [ ] {
  Integer . parseInt ( input . readLine ( ) ) }
  ;
  if ( NL [ 0 ] == 1 && Arrays . stream ( NL ) . mapToInt ( Integer :: parseInt ) . sum ( ) == 1 ) {
    System . out . println ( 10 ) ;
  }
  else {
    System . out . println ( Arrays . stream ( NL ) . mapToInt ( Integer :: parseInt ) . sum ( ) ) ;
  }
  