static final void solve ( int N , int M , @ Nonnull List < Integer > A ) {
  final int [ ] a = new int [ A . size ( ) ] ;
  for ( int i = 0 ;
  i < A . size ( ) ;
  i ++ ) {
    a [ i ] = A . get ( i ) % M ;
  }
  final int [ ] b = new int [ A . size ( ) ] ;
  Arrays . fill ( b , 0 ) ;
  final Map < Integer , Integer > nums = new LinkedHashMap < > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    final int n = ( b [ i ] + a [ i ] ) % M ;
    b [ i ] = n ;
  }
  for ( int i : b ) {
    nums . put ( i , 1 ) ;
  }
  int sum = 0 ;
  for ( int k : nums . keySet ( ) ) {
    final int c = nums . get ( k ) ;
    if ( c > 1 ) {
      sum += c * ( c - 1 ) / 2 ;
    }
  }
  System . out . println ( sum ) ;
  return ;
}
