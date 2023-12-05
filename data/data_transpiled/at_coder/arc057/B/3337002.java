public static int N = Integer . parseInt ( input ) {
  int * A , K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Integer . parseInt ( A ) == K ) {
    System . out . println ( 1 ) ;
    exit ( 0 ) ;
  }
  final int INF = 10 * 18 ;
  final int [ ] C = new int [ N + 1 ] ;
  Arrays . fill ( C , INF ) ;
  C [ 0 ] = 0 ;
  int s = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = A [ i ] ;
    for ( int j = N - 1 ;
    j >= 0 ;
    j -- ) {
      if ( C [ j ] == INF ) continue ;
      final int W = ( s > 0 ) ? ( a * C [ j ] / s + 1 ) : 1 ;
      if ( W <= a ) C [ j + 1 ] = Math . min ( C [ j + 1 ] , C [ j ] + W ) ;
    }
    s += a ;
  }
  System . out . println ( Integer . parseInt ( e ) <= K ) ;
  return - 1 ;
}
