public static Set < Integer > set ( String input ) {
  Set < Integer > E = new HashSet < Integer > ( ) ;
  for ( String s : input . split ( " " ) ) {
    E . add ( Integer . parseInt ( s ) ) ;
  }
  int B = Integer . parseInt ( input . trim ( ) ) ;
  Set < Integer > L = new HashSet < Integer > ( ) ;
  for ( String s : input . split ( " " ) ) {
    L . add ( Integer . parseInt ( s ) ) ;
  }
  if ( E . equals ( L ) ) {
    System . out . println ( 1 ) ;
  }
  else {
    Set < Integer > s = E . stream ( ) . filter ( L :: contains ) . collect ( Collectors . toSet ( ) ) ;
    if ( s . size ( ) == 5 ) {
      if ( Collections . disjoint ( L , s ) ) {
        System . out . println ( 2 ) ;
      }
      else {
        System . out . println ( 3 ) ;
      }
    }
    else if ( s . size ( ) == 4 ) {
      System . out . println ( 4 ) ;
    }
    else if ( s . size ( ) == 3 ) {
      System . out . println ( 5 ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  return s ;
}
