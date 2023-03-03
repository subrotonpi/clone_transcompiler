static final int comb ( int n , int k , HashMap < Integer , Integer > cache ) throws IOException {
  if ( k > n ) return 0 ;
  if ( k < 0 ) return 0 ;
  if ( ( n = cache . containsKey ( n ) ) || ( k = cache . get ( n ) ) != 0 ) return cache . get ( n , k ) ;
  int r = ( Math . factorial ( n ) / Math . factorial ( k ) / Math . factorial ( n - k ) ) % 100003 ;
  cache . put ( n , k , r ) ;
  return r ;
}
