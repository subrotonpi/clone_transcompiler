static final int [ ] getBinarySearch ( ) {
  final String input = System . getProperty ( "input" ) ;
  System . setIn ( input ) ;
  final int n = Integer . parseInt ( input ) ;
  final int [ ] A = Lists . newArrayList ( Integer . parseInt ( input ) ) ;
  final TIntIntHashMap idx = new TIntIntHashMap ( ) ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    idx . put ( A [ i ] , i ) ;
  }
  final int [ ] hq = new int [ n ] ;
  final int [ ] right = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    while ( hq [ i ] > 0 && - hq [ 0 ] > A [ i ] ) {
      final int h = - heapSort ( hq ) ;
      right [ idx . get ( h ) ] = i - 1 ;
    }
    HeapSort ( hq , - A [ i ] ) ;
  }
  hq = new int [ n ] ;
  final int [ ] left = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    while ( hq [ i ] > 0 && - hq [ 0 ] > A [ i ] ) {
      final int h = - heapSort ( hq ) ;
      left [ idx . get ( h ) ] = i + 1 ;
    }
    HeapSort ( hq , - A [ i ] ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += A [ i ] * ( i - left [ i ] + 1 ) * ( right [ i ] - i + 1 ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
