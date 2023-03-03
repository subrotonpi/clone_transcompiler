public static int mergeAndCountRec ( int [ ] A , int [ ] W , int l , int r ) {
  if ( l + 1 >= r ) return 0 ;
  int m = ( l + r ) / 2 ;
  int cnt = mergeAndCountRec ( A , W , l , m ) ;
  cnt += mergeAndCountRec ( A , W , m , r ) ;
  int i = l , j = m , k = l ;
  while ( i < m && j < r ) {
    if ( A [ i ] <= A [ j ] ) {
      W [ k ] = A [ i ++ ] ;
    }
    else {
      W [ k ] = A [ j ++ ] ;
      cnt += m - i ;
    }
    k ++ ;
  }
  if ( i < m ) W [ k ] = A [ i ++ ] ;
  if ( j < r ) W [ k ] = A [ j ++ ] ;
  Arrays . sort ( W , 0 , W , l , r ) ;
  return cnt ;
}
int N = Integer . parseInt ( input ( ) ) ;
int [ ] A = new int [ 3 ] ;
int [ ] O = new int [ 3 ] ;
boolean ok = true ;
int [ ] flip = {
  0 , 0 }
  ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ok &= ( A [ 1 ] % 3 ) == 2 ;
    ok &= new int [ ] {
      A [ 0 ] , A [ 1 ] , A [ 2 ] }
      ;
      ok &= ( hb % 2 ) == ( flip [ 1 ] % 2 ) ;
      ok &= ( hc % 2 ) == ( flip [ 0 ] % 2 ) ;
      int [ ] order = {
        A [ 0 ] , A [ 1 ] , A [ 2 ] }
        ;
        ok &= ( hb % 2 ) == ( flip [ 1 ] % 2 ) ;
        ok &= ( hc % 2 ) == ( flip [ 0 ] % 2 ) ;
        System . out . println ( ok ? "Yes" : "No" ) ;
      }
      