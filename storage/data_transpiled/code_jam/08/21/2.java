static void foo ( int idx , InputStream iStream ) throws IOException {
  int n = Integer . parseInt ( iStream . readLine ( ) . trim ( ) ) ;
  int A = Integer . parseInt ( iStream . readLine ( ) . trim ( ) ) ;
  int B = Integer . parseInt ( iStream . readLine ( ) . trim ( ) ) ;
  int C = Integer . parseInt ( iStream . readLine ( ) . trim ( ) ) ;
  int D = Integer . parseInt ( iStream . readLine ( ) . trim ( ) ) ;
  int x0 = Integer . parseInt ( iStream . readLine ( ) . trim ( ) ) ;
  int y0 = Integer . parseInt ( iStream . readLine ( ) . trim ( ) ) ;
  int M = Integer . parseInt ( iStream . readLine ( ) . trim ( ) ) ;
  int [ ] [ ] a = new int [ n ] [ 3 ] ;
  a [ 0 ] = new int [ n ] ;
  a [ 1 ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    a [ i ] = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      a [ i ] [ j ] = i % 3 ;
      int t1 = a [ i ] [ 0 ] % 3 ;
      int t2 = a [ i ] [ 1 ] % 3 ;
      b [ t1 ] [ t2 ] ++ ;
    }
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    int x1 = i / 3 ;
    int y1 = i % 3 ;
    for ( int j = i ;
    j < 9 ;
    j ++ ) {
      int x2 = j / 3 ;
      int y2 = j % 3 ;
      int x3 = ( 9 - x1 - x2 ) % 3 ;
      int y3 = ( 9 - y1 - y2 ) % 3 ;
      int k = x3 * 3 + y3 ;
      if ( k < j ) continue ;
      if ( i == j && j == k ) {
        int t = b [ x1 ] [ y1 ] ;
        res += t * ( t - 1 ) * ( t - 2 ) / 6 ;
      }
      else if ( i == j ) {
        int t1 = b [ x1 ] [ y1 ] ;
        int t2 = b [ x3 ] [ y3 ] ;
        res += t1 * t2 * ( t1 - 1 ) / 2 ;
      }
      else if ( j == k ) {
        int t1 = b [ x1 ] [ y1 ] ;
        int t2 =