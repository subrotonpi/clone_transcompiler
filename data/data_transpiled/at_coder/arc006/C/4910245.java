;
if ( __name__ == "__main__" ) {
  int boxCount = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] boxes = new int [ boxCount ] ;
  List < List < Integer >> boxTotowers = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < boxCount ;
  i ++ ) {
    boxes [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < boxes . length ;
  i ++ ) {
    boolean isStacked = false ;
    for ( List < Integer > tower : boxTotowers ) {
      if ( tower . get ( tower . size ( ) - 1 ) >= box ) {
        tower . add ( box ) ;
        isStacked = true ;
        break ;
      }
    }
    if ( ! isStacked ) {
      boxTotowers . add ( new ArrayList < > ( ) ) ;
    }
  }
  System . out . println ( boxTotowers . size ( ) ) ;
}
