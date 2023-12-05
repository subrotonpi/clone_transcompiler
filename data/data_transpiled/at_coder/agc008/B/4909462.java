@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = 0 ;
  }
  int [ ] b = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    b [ i ] = 0 ;
  }
  int [ ] c = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    c [ i ] = 0 ;
  }
  return a ;
}
