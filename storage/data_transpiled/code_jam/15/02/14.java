static final String [ ] [ ] loadCases ( String path ) {
  final List < int [ ] > caseList = new ArrayList < int [ ] > ( ) ;
  try {
    final BufferedReader bufferedReader = new BufferedReader ( new FileReader ( path ) ) ;
    final int caseNum = Integer . parseInt ( bufferedReader . readLine ( ) . trim ( ) ) ;
    for ( int i = 0 ;
    i <= caseNum ;
    i ++ ) {
      final int D = Integer . parseInt ( bufferedReader . readLine ( ) . trim ( ) ) ;
      final List < Integer > P = Splitter . on ( ' ' ) . splitToList ( bufferedReader . readLine ( ) . trim ( ) ) ;
      if ( D != P . size ( ) ) {
        System . err . println ( "incorrect file at case " + i ) ;
        System . exit ( 0 ) ;
      }
      caseList . add ( new int [ D ] ) ;
      for ( int j = 0 ;
      j <= D ;
      j ++ ) {
        P . add ( P . get ( j ) ) ;
      }
    }
    return caseList . toArray ( new int [ caseList . size ( ) ] ) ;
  }
  catch ( final IOException e ) {
    e . printStackTrace ( ) ;
  }
  return new String [ ] [ ] {
    {
      "" , "" }
      , {
        "" }
      }
      ;
    }
    