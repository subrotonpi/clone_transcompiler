@ VisibleForTesting static int [ ] copy ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] CC = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) CC [ i ] = Integer . parseInt ( input ( ) ) ;
  int [ ] C = new int [ CC . length ] ;
  for ( int i = 0 ;
  i < CC . length ;
  i ++ ) C [ i ] = CC [ i ] ;
  if ( C . length == 1 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  return C ;
}
