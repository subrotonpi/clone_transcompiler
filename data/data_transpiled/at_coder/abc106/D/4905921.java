@ VisibleForTesting static Iterable < List < Integer >> accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ N + 1 ] [ M + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int L = Integer . parseInt ( input . nextLine ( ) ) ;
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ L ] [ R ] ++ ;
  }
  List < Integer > [ ] b = new List [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    b [ i ] = Collections . unmodifiableList ( accumulate ( a [ i ] ) ) ;
  }
  int [ ] [ ] k = new int [ N + 1 ] [ M + 1 ] ;
  for ( int j = 0 ;
  j < i + 1 ;
  j ++ ) {
    k [ j ] = b [ j ] [ i ] ;
  }
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    ans . add ( Collections . unmodifiableList ( accumulate ( k [ i ] ) ) . subList ( 0 , ans . size ( ) - 1 ) ) ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int p = Integer . parseInt ( input . nextLine ( ) ) ;
    int q = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( ans . get ( q ) [ p - q - 1 ] ) ;
  }
  return ans ;
}
