static final void printGrid ( List < List < Integer >> grid ) {
  for ( List < Integer > line : grid ) {
    System . out . println ( StringUtils . toString ( Integer . valueOf ( line . get ( 0 ) ) ) ) ;
  }
  System . out . println ( ) ;
}
