@ VisibleForTesting static int getSortingLeft ( List < Integer > p ) {
  return p . stream ( ) . reduce ( ( x , y ) -> {
    int [ ] route = new int [ p . size ( ) ] ;
    for ( int y = 0 ;
    y < p . size ( ) ;
    y ++ ) {
      int pos = bl ( route , y ) ;
      if ( route . length <= pos ) route [ pos ] = y ;
      else route [ pos ] = y ;
    }
    return route . length ;
  }
  ) . orElse ( 0 ) ;
}
