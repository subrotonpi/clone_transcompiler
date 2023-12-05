static private String findPath ( int [ ] keysToOpen , int [ ] keysInChest , List < Pair < String , String >> searchList , int numChest ) throws IOException {
  while ( searchList . size ( ) != 0 ) {
    Pair < String , String > chestsToOpen = searchList . remove ( 0 ) ;
    int [ ] currentKeys = new int [ numChest ] ;
    String [ ] path = new String [ numChest ] ;
    if ( chestsToOpen . length == 0 ) return path ;
    for ( int t = 0 ;
    t < chestsToOpen . length ;
    t ++ ) {
      int K = Integer . parseInt ( searchList . get ( t ) . trim ( ) ) ;
      int [ ] tmpStartKeys = new int [ N ] ;
      for ( int nn = 0 ;
      nn < N ;
      nn ++ ) {
        int [ ] data = Integer . parseInt ( searchList . get ( t ) . trim ( ) ) ;
        keysToOpen [ k ] = data [ 0 ] ;
        keysInChest [ k ] = data [ 2 ] ;
      }
      int [ ] startKeys = new int [ 201 ] ;
      for ( int keyNum = 0 ;
      keyNum < startKeys . length ;
      keyNum ++ ) {
        startKeys [ keyNum ] ++ ;
      }
      searchList . clear ( ) ;
      for ( int keyNum = 0 ;
      keyNum < startKeys . length ;
      keyNum ++ ) {
        startKeys [ keyNum ] = keyNum ;
      }
      boolean possible = isPossible ( keysToOpen , keysInChest , startKeys , new String [ 1 ] ) ;
      if ( possible ) path = findPath ( keysToOpen , keysInChest , path , chestsToOpen ) ;
      searchList . add ( new Pair < String , String > ( tmpChest , tmpCurrentKeys , path . clone ( ) ) ) ;
    }
  }
  return new String [ 0 ] ;
}
