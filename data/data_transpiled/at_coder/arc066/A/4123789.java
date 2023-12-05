public static int [ ] getans ( ) {
  int [ ] ans = null ;
  int tmp = 0 ;
  int z = 1 ;
  if ( ( N % 2 ) == 0 ) {
    tmp = ( int ) ( N / 2 ) ;
    ans = new int [ tmp ] ;
    for ( int i = 0 ;
    i < tmp ;
    i ++ ) ans [ i ] = 2 ;
    int [ ] A = map . get ( input ) . split ( " " ) ;
    for ( int i = 0 ;
    i < A . length ;
    i ++ ) {
      if ( ( Integer . parseInt ( A [ i ] ) / 2 ) <= ( Integer . parseInt ( N / 2 ) ) ) {
        ans [ Integer . parseInt ( A [ i ] ) - 1 ] -- ;
      }
      else {
        System . out . println ( 0 ) ;
        exit ( ) ;
      }
    }
  }
  int output = 2 * ( tmp ) % ( 10 * 9 + 7 ) ;
  for ( int i : ans ) {
    if ( ( i != 0 ) ) output = 0 ;
  }
  System . out . println ( output * z ) ;
  return ans ;
}
