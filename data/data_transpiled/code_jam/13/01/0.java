static final String [ ] [ ] main ( String [ ] args ) {
  final int timeit = 1 ;
  final int debugv = 0 ;
  {
    int T = Integer . parseInt ( args [ 0 ] ) ;
    for ( int testCase = 1 ;
    testCase <= T ;
    testCase ++ ) {
      doCase ( testCase ) ;
    }
  }
  {
    int [ ] [ ] grid = new int [ 4 ] [ 4 ] ;
    int i = 0 ;
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( Arrays . binarySearch ( args , j ) == - 1 ) {
        System . err . println ( "Completed in " + ( System . nanoTime ( ) - startTime ) + " seconds." ) ;
        debugv ++ ;
      }
    }
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( Arrays . binarySearch ( args , j ) == - 1 ) {
        System . err . println ( "Completed in " + ( System . nanoTime ( ) - startTime ) + " seconds." ) ;
        debugv ++ ;
      }
    }
    return grid ;
  }
  {
    int [ ] [ ] grid = new int [ 4 ] [ 4 ] ;
    for ( i = 0 ;
    i < 4 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 4 ;
      j ++ ) {
        if ( ( grid [ i ] [ j ] == marker ) && ( grid [ j ] [ i ] == marker ) ) {
          return grid ;
        }
      }
    }
    return grid ;
  }
  {
    int [ ] [ ] result = new int [ 4 ] [ 4 ] ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      System . arraycopy ( args , 0 , result , 0 , 4 ) ;
    }
    System . arraycopy ( grid , 0 , result , 0 , 4 ) ;
    result [ 4 ] = System . nanoTime ( ) ;
    if ( debugv ++ > 0 ) {
      System . err . println ( result [ 4 ] ) ;
    }
  }
}
