public static void print ( int N ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  while ( ArrayUtil . find ( a , 0 ) >= 0 ) {
    Arrays . sort ( a , Collections . reverseOrder ( ) ) ;
    int k = ( a [ 0 ] - N ) / N + 1 ;
    ans += k ;
    a [ 0 ] -= k * N ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      a [ i ] += k ;
    }
  }
  System . out . println ( ans ) ;
}
