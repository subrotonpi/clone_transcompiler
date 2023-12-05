@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = i ;
  List < Integer > b = new ArrayList < Integer > ( ) ;
  b . addAll ( a ) ;
  int ans = 0 ;
  for ( int x = 0 , y = 0 ;
  x < K ;
  x ++ ) {
    ans += b . get ( x ) - b . get ( y ) ;
  }
  System . out . println ( ans ) ;
  return b ;
}
