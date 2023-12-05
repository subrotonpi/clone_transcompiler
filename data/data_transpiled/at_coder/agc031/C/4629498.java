public static void trace ( int [ ] bits , int idx , List < String > history ) {
  if ( idx == bits . length ) {
    history . add ( bits , 0 ) ;
  }
  else if ( idx == bits . length - 1 ) {
    history . add ( bits , 0 ) ;
    for ( int j = 0 ;
    j < history . size ( ) ;
    j ++ ) {
      history . get ( j ) . set ( Integer . toString ( Integer . parseInt ( String . valueOf ( history . get ( j ) ) , 2 ) ) ) ;
    }
    System . out . println ( "YES" ) ;
    System . out . println ( " " + history ) ;
  }
  else {
    trace ( bits , idx + 1 , history ) ;
    bits [ idx ] = 1 - bits [ idx ] ;
    trace ( bits , idx + 1 , history ) ;
  }
}
