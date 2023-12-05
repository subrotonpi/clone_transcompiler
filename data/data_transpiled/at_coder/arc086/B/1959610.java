static final int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > aLst = new ArrayList < Integer > ( ) ;
  for ( String str : input . nextLine ( ) . split ( " " ) ) {
    aLst . add ( Integer . parseInt ( str ) ) ;
  }
  int [ ] aArr = new int [ aLst . size ( ) ] ;
  for ( int i = 0 ;
  i < aArr . length ;
  i ++ ) {
    aArr [ i ] = aLst . get ( i ) ;
  }
  int idx = Integer . parseInt ( aArr [ idx ] ) + 1 ;
  if ( aLst [ idx - 1 ] == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( 2 * N - 2 ) ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      if ( i != idx ) {
        System . out . println ( idx + " " + i ) ;
      }
    }
    if ( aLst [ idx - 1 ] > 0 ) {
      for ( int i = 1 ;
      i <= N ;
      i ++ ) {
        System . out . println ( i + " " + i + " " + i ) ;
      }
    }
    else if ( aLst [ idx - 1 ] < 0 ) {
      for ( int i = N ;
      i >= 1 ;
      i -- ) {
        System . out . println ( i + " " + i - 1 ) ;
      }
    }
  }
  return aArr ;
}
