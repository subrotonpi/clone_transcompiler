@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] T = new int [ K ] [ ] ;
  for ( int i = 0 ;
  i < K ;
  ++ i ) {
    T [ i ] [ i ] = i ;
  }
  boolean flag = false ;
  return T ;
}
