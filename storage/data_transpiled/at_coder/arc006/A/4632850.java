static Set < Integer > set ( ) {
  Set < Integer > E = new HashSet < > ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    E . add ( Integer . parseInt ( s ) ) ;
  }
  Set < Integer > B = new HashSet < > ( ) ;
  Set < Integer > L = new HashSet < > ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
  }
  Set < Integer > EL = E . stream ( ) . filter ( L ) . collect ( toSet ( ) ) ;
  return EL ;
}
