static final int [ ] getSortValues ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    int a_ = a [ i ] ;
    map . put ( a_ , i ) ;
  }
  int [ ] h = new int [ n ] ;
  int [ ] right = new int [ n ] ;
  h [ 0 ] = n - 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    while ( h [ 0 ] > - h [ 0 ] ) {
      int v = - heapheappop ( h ) ;
      right [ map . get ( v ) ] = i - 1 ;
    }
    heappush ( h , - a [ i ] ) ;
  }
  h = new int [ n ] ;
  int [ ] left = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    h [ i ] = left [ i ] ;
    left [ i ] = i + 1 ;
  }
  heappush ( h , - a [ i ] ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += a [ i ] * ( i - left [ i ] + 1 ) * ( right [ i ] - i + 1 ) ;
  }
  System . out . println ( ans ) ;
}
