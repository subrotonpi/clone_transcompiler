@ VisibleForTesting static int [ ] [ ] solve ( int [ ] boxes , int [ ] toys ) {
  if ( boxes [ 0 ] [ 0 ] == 0 ) {
    boxes [ 0 ] = 0 ;
  }
  if ( toys [ 0 ] [ 0 ] == 0 ) {
    toys [ 0 ] = 0 ;
  }
  int [ ] [ ] result ;
  try {
    File in = new File ( "C-large.in" ) ;
    File out = new File ( "C-large.out" ) ;
    processFiles ( in , out ) ;
  }
  catch ( FileNotFoundException e ) {
    throw new RuntimeException ( e ) ;
  }
  if ( M == null ) {
    M = new HashMap < > ( ) ;
  }
  if ( boxes . length == 0 || toys . length == 0 ) {
    return 0 ;
  }
  final int [ ] key = new int [ ] {
    boxes . length , toys . length , boxes [ 0 ] , toys [ 0 ] }
    ;
    if ( M . containsKey ( key ) ) {
      return M . get ( key ) ;
    }
    if ( boxes [ 0 ] == toys [ 0 ] ) {
      final int matches = Math . min ( boxes . length , toys . length ) ;
      final int [ ] [ ] boxes = new int [ boxes . length ] [ ] ;
      final int [ ] [ ] toys = new int [ boxes . length ] [ ] ;
      for ( int i = 0 ;
      i < toys . length ;
      i ++ ) {
        boxes [ i ] = new int [ ] {
          boxes [ 0 ] - matches , boxes [ 0 ] - matches }
          ;
          toys [ i ] = new int [ ] {
            toys [ 0 ] - matches , toys [ 0 ] - matches }
            ;
          }
          compact ( boxes , toys ) ;
          M . put ( key , matches + solve ( boxes , toys , M ) ) ;
          return M . get ( key ) ;
        }
        M [ key ] = Math . max ( solve ( boxes , toys , M ) , solve ( boxes , toys , M ) ) ;
        return new int [ ] [ ] {
        }
        ;
      }
      