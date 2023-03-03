public static void main ( int n , int x ) {
  int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int cnt = 0 ;
  if ( A [ 0 ] > x ) {
    cnt += A [ 0 ] - x ;
    A [ 0 ] -= A [ 0 ] - x ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int total = A [ i ] + A [ i - 1 ] ;
    if ( total > x ) {
      cnt += total - x ;
      A [ i ] -= total - x ;
    }
  }
  System . out . println ( cnt ) ;
}
