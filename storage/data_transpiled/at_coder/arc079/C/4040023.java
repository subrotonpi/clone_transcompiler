public static void print ( int N ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  while ( ArrayUtil . find ( A , i ) > - 1 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( A [ i ] <= N - 1 ) continue ;
      int d = A [ i ] - ( N - 1 ) ;
      int k = - ( - d / N ) ;
      A [ i ] -= k * N ;
      ans += k ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( j == i ) continue ;
        A [ j ] += k ;
      }
    }
  }
  System . out . println ( ans ) ;
}
