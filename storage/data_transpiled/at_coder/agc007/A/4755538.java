@ VisibleForTesting static Iterable < String > combinations ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  }
  int tmpH = - 1 ;
  int tmpW = - 1 ;
  boolean flag = true ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    if ( A . get ( i ) . equals ( "#" ) ) {
      if ( i < tmpH || j < tmpW ) {
        flag = false ;
        break ;
      }
      else {
        tmpH = i ;
        tmpW = j ;
      }
    }
  }
  return new ArrayList < > ( flag ? "Possible" : "Impossible" ) ;
}
