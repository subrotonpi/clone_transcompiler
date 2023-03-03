public static void main ( String [ ] args ) {
  e = Arrays . stream ( input . split ( " " ) ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
  b = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
  l = Arrays . stream ( input . split ( " " ) ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
  HashSet < Integer > same = new HashSet < Integer > ( e ) ;
  same . retainAll ( l ) ;
  HashSet < Integer > notin = new HashSet < Integer > ( l ) ;
  same . removeAll ( same ) ;
  if ( same . size ( ) == 6 ) {
    System . out . println ( 1 ) ;
  }
  else if ( same . size ( ) >= 5 ) {
    if ( notin . equals ( new Integer ( b ) ) ) {
      System . out . println ( 2 ) ;
    }
    else {
      System . out . println ( 3 ) ;
    }
  }
  else if ( same . size ( ) >= 4 ) {
    System . out . println ( 4 ) ;
  }
  else if ( same . size ( ) >= 3 ) {
    System . out . println ( 5 ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
}
