static final int [ ] [ ] solve ( ) {
  System . setIn ( "Enter a number of times a pair of integers" ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  input = System . in ;
  LRD = new int [ M ] [ ] ;
  for ( int j = 0 ;
  j < M ;
  j ++ ) {
    LRD [ j ] = new int [ M ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      LRD [ j ] [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
  }
  int [ ] data = new int [ N + 1 ] ;
  int [ ] rank = new int [ N + 1 ] ;
  int [ ] diffWeight = new int [ N + 1 ] ;
  {
    root ( ) ;
  }
  {
    if ( data [ 0 ] == data [ 0 ] ) {
      return data ;
    }
    else {
      int r = root ( data [ 0 ] ) ;
      diffWeight [ r ] += diffWeight [ data [ 0 ] ] ;
      data [ 0 ] = r ;
      return r ;
    }
  }
  {
    int w = diffWeight [ 0 ] ;
    int x = diff ( data [ 0 ] ) ;
    int y = diff ( data [ 0 ] ) ;
    if ( x == y ) return false ;
    if ( rank [ x ] < rank [ y ] ) x = y ;
    w -= weight [ y ] ;
    int x = root ( x ) ;
    int y = root ( y ) ;
    if ( x == y ) return false ;
    if ( rank [ x ] < rank [ y ] ) x = y ;
    y = x ;
    w = - w ;
    if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
    data [ y ] = x ;
    diffWeight [ y ] = w ;
    return true ;
  }
  {
    int x = root ( ) ;
    int y = root ( y ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int L = LRD [ i ] [ i ] ;
      int R = LRD [ i ] [ i ] ;
      int D = LRD [ i ] [ i ] ;
      if ( ! isSame ( L , R ) ) {
        final int [ ] result = merge ( L , R , D ) ;
      }
      else {
        if ( diff ( L , R ) != D ) {
          