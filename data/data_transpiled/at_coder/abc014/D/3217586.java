static private int searchCommon ( int a , int b ) {
  Scanner input = new Scanner ( System . in ) ;
  int N = input . nextInt ( ) ;
  int [ ] [ ] G = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int x = input . nextInt ( ) , y = input . nextInt ( ) ;
    G [ x ] [ y ] = x ;
    G [ y ] [ x ] = y ;
  }
  int [ ] P = new int [ N + 1 ] ;
  int [ ] d = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    P [ i ] = 0 ;
  }
  int [ ] d = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    d [ i ] = 0 ;
  }
  P [ 1 ] = 1 ;
  final int root = 1 ;
  System . gc ( ) ;
  /* make tree of random integers */
  for ( int i = 0 ;
  i < 17 ;
  i ++ ) {
    int g = G [ i ] [ 0 ] ;
    if ( g == p ) continue ;
    P [ g ] = i ;
    d [ g ] = d [ i ] + 1 ;
    /* root = 1 */
  }
  /* calc ancestor of root */
  int [ ] [ ] P_set = new int [ 17 ] [ ] ;
  P_set [ 0 ] = P ;
  for ( int i = 0 ;
  i < 17 ;
  i ++ ) {
    P_set [ i ] = new int [ 17 ] ;
    for ( int j = 0 ;
    j < P_set [ i ] . length ;
    j ++ ) {
      P_set [ i ] [ j ] = P_set [ i ] [ j ] ;
    }
  }
  /* search common */
  for ( int i = 0 ;
  i < 17 ;
  i ++ ) {
    int a_p = P_set [ i ] [ a ] , b_p = P_set [ i ] [ b ] ;
    if ( a_p == b_p ) {
      if ( i == 0 ) return d [ a_p ] ;
      /* search common */
      a = a_p ;
      b = b_p ;
    }
  }
  int Q = input . nextInt ( ) ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int a =