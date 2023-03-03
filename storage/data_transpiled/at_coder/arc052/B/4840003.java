@ Produces @ ApplicationScoped public static void accumulateWithTenants ( @ New int [ ] input ) {
  int [ ] s = new int [ 2 * ( 10 * 4 ) + 1 ] ;
  int n = Integer . parseInt ( input [ 0 ] ) ;
  int q = Integer . parseInt ( input [ 1 ] ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input [ 2 ] ) ;
    int r = Integer . parseInt ( input [ 3 ] ) ;
    int h = Integer . parseInt ( input [ 4 ] ) ;
    for ( int j = x ;
    j < x + h ;
    j ++ ) {
      int p = x + h - j ;
      s [ j + 1 ] += MathUtils . PI * ( p * ( ( r * p / h ) * ( r * p / h ) ) - ( p - 1 ) * ( ( r * ( p - 1 ) / h ) * ( r * ( p - 1 ) / h ) ) ) / 3 ;
    }
  }
  s = new int [ q ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int a = Integer . parseInt ( input [ 2 ] ) ;
    int b = Integer . parseInt ( input [ 3 ] ) ;
    System . out . println ( s [ b ] - s [ a ] ) ;
  }
}
