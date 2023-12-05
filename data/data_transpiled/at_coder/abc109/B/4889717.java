@ VisibleForTesting static LinkedHashMap < String , Integer > readLongList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < String > wList = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) wList . add ( input . nextLine ( ) ) ;
  int cnt = new Long ( wList . size ( ) ) . compareTo ( new Long ( wList . get ( 0 ) ) ) ;
  if ( cnt > 1 ) {
    System . out . println ( "No" ) ;
  }
  else {
    for ( int i = 0 ;
    i <= N - 1 ;
    i ++ ) {
      if ( wList . get ( i ) . length ( ) - 1 != wList . get ( i + 1 ) . length ( ) ) {
        System . out . println ( "No" ) ;
        break ;
      }
    }
  }
  else {
    System . out . println ( "Yes" ) ;
  }
  return wList ;
}
