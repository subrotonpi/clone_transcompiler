@ VisibleForTesting static void input ( Scanner input ) {
  int n = input . nextInt ( ) ;
  int m = input . nextInt ( ) ;
  int [ ] aa = Lists . newArrayList ( input . nextLine ( ) . split ( " " ) ) ;
  Map < Integer , Integer > counter = new HashMap < > ( ) ;
  int [ ] cum = new int [ m + 2 ] ;
  int ans_1 = 0 ;
  for ( int i = 0 ;
  i < aa . length ;
  i ++ ) {
    int a = aa [ i ] ;
    int b = aa [ i ] ;
    counter . put ( b , a ) ;
    cum [ a + 1 ] ++ ;
    cum [ b ] += - 1 ;
    if ( a > b ) {
      cum [ 1 ] ++ ;
      ans_1 += b ;
    }
    else ans_1 += b - a ;
  }
  cum = Lists . newArrayList ( cum ) ;
  int ans_prev = ans_1 ;
  for ( int x = 2 ;
  x <= m ;
  x ++ ) {
    int ans_x = ans_prev ;
    int px = x - 1 ;
    if ( counter . containsKey ( px ) ) ans_x += Integer . MAX_VALUE ;
    ans_x -= Integer . MAX_VALUE ;
  }
  System . out . println ( ans_min ) ;
}
