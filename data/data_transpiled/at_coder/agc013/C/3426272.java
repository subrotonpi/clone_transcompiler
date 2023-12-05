public static int N = Integer . parseInt ( input ) {
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  int T = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] src = Arrays . copyOf ( src , N ) ;
  Arrays . sort ( src ) ;
  int [ ] xs = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = src [ i ] ;
    int w = src [ i ] ;
    int dx = w == 1 ? T : - T ;
    xs [ i ] = ( x + dx ) % L ;
  }
  Arrays . sort ( xs ) ;
  if ( N == 1 ) {
    System . out . println ( xs [ 0 ] ) ;
    exit ( ) ;
  }
  int x0 = src [ 0 ] ;
  int w0 = src [ 1 ] ;
  int k0 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = src [ i ] ;
    int w = src [ i ] ;
    if ( x == x0 ) continue ;
    if ( w == w0 ) continue ;
    int dist ;
    if ( w0 == 1 ) dist = ( x - x0 ) % L ;
    else dist = ( x0 - x ) % L ;
    if ( 2 * T >= dist ) k0 ++ ;
    int newx0 = w0 == 1 ? ( x0 + T ) % L : ( x0 - T ) % L ;
    int i0 = xs [ i0 ] ;
    if ( w0 == 1 && i0 + 1 < N && xs [ i0 ] == xs [ i0 + 1 ] ) i0 ++ ;
    i0 += ( w0 == 2 ? k0 : - k0 ) ;
    i0 %= N ;
    for ( int i = i0 ;
    i < i0 + N ;
    i ++ ) {
      System . out . println ( xs [ i % N ] ) ;
    }
  }
  return N ;
}
