@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = i + 1 ;
  int [ ] acc = new int [ K ] ;
  for ( int i = 0 ;
  i < acc . length ;
  i ++ ) acc [ i ] = i ;
  int [ ] acc2 = new int [ K ] ;
  for ( int i = 0 ;
  i < acc . length ;
  i ++ ) acc2 [ i ] = acc [ i ] ;
  int ans = 0 , total = acc2 [ N - 1 ] ;
  for ( int i = 1 , j = 1 ;
  j <= K ;
  j ++ ) {
    int v = total - acc2 [ j ] + acc2 [ i - 1 ] + ( acc [ j ] - acc [ i - 1 ] > 0 ? 1 : 0 ) ;
    if ( ans < v ) ans = v ;
  }
  System . out . println ( ans ) ;
  return acc ;
}
