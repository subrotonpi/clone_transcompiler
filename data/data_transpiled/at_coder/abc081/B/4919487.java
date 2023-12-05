public static int N = Integer . parseInt ( input ) {
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < 5 * 10 * 8 ;
  i ++ ) {
    int tmp = 0 ;
    for ( int j = 0 ;
    j < A . length ;
    j ++ ) {
      int k = A [ j ] ;
      if ( k % 2 == 0 ) {
        A [ j ] = k / 2 ;
        tmp ++ ;
      }
    }
    if ( tmp == A . length ) {
      ans ++ ;
    }
    else {
      System . out . println ( ans ) ;
      exit ( ) ;
    }
  }
  return ans ;
}
