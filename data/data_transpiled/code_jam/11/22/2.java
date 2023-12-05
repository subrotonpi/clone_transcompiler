static class empty : pass ;
{
  int p = - ( 10 * 100 ) ;
  for ( int i = 0 ;
  i < V . length ;
  i ++ ) {
    final var v = V [ i ] ;
    final int w = D * v . V ;
    final int r = t - D * ( v . V - 1 ) / 2 ;
    if ( r < 0 || p + w / 2 - v . P > r ) return false ;
    p = Math . max ( v . P - r + w / 2 , p + w ) ;
  }
  int T = input . nextInt ( ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    C = Integer . parseInt ( input . nextLine ( ) ) ;
    D *= 2 ;
    final var [ ] V = new var [ C ] ;
    for ( int i = 0 ;
    i < C ;
    i ++ ) {
      final var t = Integer . parseInt ( input . nextLine ( ) ) ;
      V [ i ] = new var [ t . length ] ;
      for ( int j = 0 ;
      j < t . length ;
      j ++ ) V [ i ] [ j ] = empty ( ) ;
      V [ i ] [ j ] . P = t [ 0 ] * 2 ;
      V [ i ] [ j ] . V = t [ 1 ] ;
    }
    int l = 0 ;
    int r = 10 * 100 ;
    while ( ( r - l > 1 ) && ( r - l > 1 ) ) {
      final int m = ( l + r ) / 2 ;
      if ( check ( C , D , V , m ) ) r = m ;
      else l = m ;
    }
    if ( check ( C , D , V , 0 ) ) r = 0 ;
    System . out . printf ( "Case #%s: %.1f%n" , testCase , r * 0.5 ) ;
  }
  return true ;
}
