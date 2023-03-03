static final int [ ] getSortValues ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    int ai = a [ i ] ;
    map . put ( ai , i ) ;
  }
  int [ ] h = new int [ n ] ;
  int [ ] right = new int [ n ] ;
  Arrays . fill ( h , n - 1 ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    while ( h [ i ] > 0 && - h [ i ] > a [ i ] ) {
      int v = - heapSort ( h ) ;
      right [ map . get ( v ) ] = i - 1 ;
    }
    heapSort ( h , - a [ i ] ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += a [ i ] * ( i - left [ i ] + 1 ) * ( right [ i ] - i + 1 ) ;
  }
  System . out . println ( ans ) ;
}
