public static void print ( int N ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  while ( ArrayUtil . find ( A , 0 ) > 0 ) {
    Collections . sort ( A ) ;
    int d = A [ A . length - 1 ] - ( N - 1 ) ;
    int k = - ( - d / N ) ;
    ans += k ;
    A [ A . length - 1 ] -= k * N ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      A [ i ] += k ;
    }
  }
  System . out . println ( ans ) ;
}
