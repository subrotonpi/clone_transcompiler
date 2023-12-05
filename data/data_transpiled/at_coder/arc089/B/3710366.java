@ VisibleForTesting static Iterable < Integer > iterable ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final int L = 2 * K ;
  final int [ ] [ ] Map = new int [ L ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x , y , c ;
    x = Integer . parseInt ( input . nextLine ( ) ) ;
    y = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( c == 'W' ) x -= K ;
    x = x % L ;
    y = y % L ;
    if ( y >= K ) x = ( x - K ) % L ;
  }
  Arrays . sort ( Map ) ;
  return map ;
}
