@ VisibleForTesting static Iterable < String > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] lstOperationimosu = new int [ N + 2 ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    lstOperationimosu [ l ] ++ ;
    lstOperationimosu [ r + 1 ] -- ;
  }
  List < String > lstOperationNum = Lists . newArrayList ( ) ;
  for ( int i = 1 ;
  i < N + 1 ;
  i ++ ) {
    lstOperationNum . add ( String . valueOf ( i % 2 ) ) ;
  }
  return lstOperationNum ;
}
