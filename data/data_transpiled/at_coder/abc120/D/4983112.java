public static int [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  ArrayList < Integer > alist = new ArrayList < > ( ) ;
  ArrayList < Integer > blist = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    alist . add ( a ) ;
    blist . add ( b ) ;
  }
  int [ ] [ ] father = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    father [ i ] = i ;
  }
  int [ ] rank = new int [ N + 1 ] ;
  int [ ] size = new int [ N + 1 ] ;
  /* find the first element */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i != father [ i ] ) {
      father [ i ] = find ( father [ i ] ) ;
    }
  }
  /* union the first element */
  int xfa = father [ 0 ] [ 0 ] ;
  int yfa = father [ 0 ] [ 0 ] ;
  if ( xfa == yfa ) {
    return null ;
  }
  else if ( rank [ xfa ] < rank [ yfa ] ) {
    father [ xfa ] = yfa ;
    size [ yfa ] += size [ xfa ] ;
  }
  else {
    father [ yfa ] = xfa ;
    size [ xfa ] += size [ yfa ] ;
    if ( rank [ xfa ] == rank [ yfa ] ) {
      rank [ xfa ] ++ ;
    }
  }
  /* same father */
  ArrayList < Integer > ansList = new ArrayList < > ( ) ;
  int ans = ( int ) ( N * ( N - 1 ) / 2 ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ansList . add ( ans ) ;
    int a = alist . get ( M - 1 - i ) ;
    int b = blist . get ( M - 1 - i ) ;
    int p = size [ a ] ;
    int q = size [ b ] ;
    if ( samefather ( a , b ) ) {
      continue ;
    }
    