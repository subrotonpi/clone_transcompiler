@ VisibleForTesting static Iterable < String > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    b [ i ] = Integer . toString ( b [ i ] % 2 ) ;
  }
  return b ;
}
