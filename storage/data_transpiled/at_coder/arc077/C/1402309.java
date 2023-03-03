@ VisibleForTesting static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > aa = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    aa . add ( i ) ;
  }
  Map < Integer , Integer > counter = new HashMap < > ( ) ;
  int [ ] cum = new int [ m + 2 ] ;
  int ans_1 = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = aa . get ( i ) ;
    int b = aa . get ( i ) ;
    counter . put ( b , a ) ;
    cum [ a + 1 ] ++ ;
    cum [ b ] += - 1 ;
    if ( a > b ) {
      cum [ 1 ] ++ ;
      ans_1 += b ;
    }
    else ans_1 += b - a ;
  }
  cum = Collections . unmodifiableList ( cum ) ;
  int ans_prev = ans_1 ;
  for ( int x = 1 ;
  x < m ;
  x ++ ) {
    int ans_x = ans_prev ;
    if ( counter . containsKey ( x ) ) ans_x += Integer . valueOf ( ( x - a ) % m - 1 ) ;
    ans_x -= cum [ x ] ;
  }
  System . out . println ( ans_min ) ;
}
