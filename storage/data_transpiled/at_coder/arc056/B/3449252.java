static final int [ ] [ ] resize ( int N , int M , int S ) {
  S -- ;
  int [ ] [ ] es = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    es [ i ] = new int [ M ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int a = Integer . parseInt ( input . readLine ( ) ) - 1 ;
      int b = Integer . parseInt ( input . readLine ( ) ) ;
      es [ a ] [ j ] = b ;
      es [ b ] [ j ] = a ;
    }
  }
  final int INF = 1 ;
  int [ ] costs = new int [ N ] ;
  Arrays . fill ( costs , INF ) ;
  costs [ S ] = - S ;
  HeapSort hsort = new HeapSort ( ) ;
  heapifyHeap ( hsort ) ;
  while ( hsort . size ( ) > 0 ) {
    int c = hsort . get ( ) ;
    int v = es [ v ] [ c ] ;
    for ( int to : es [ v ] ) {
      if ( costs [ to ] < INF ) continue ;
      int cost = - Math . min ( to , - c ) ;
      costs [ to ] = cost ;
      heappush ( hsort , cost , to ) ;
    }
  }
  int [ ] ans = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) ans [ i ] = costs [ i ] ;
  System . arraycopy ( ans , 0 , ans , 0 , ans . length ) ;
  return ans ;
}
