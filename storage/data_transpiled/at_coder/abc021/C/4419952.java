public static int [ ] [ ] [ ] dp ( int a , int b ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  a -- ;
  b -- ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  e = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    e [ x - 1 ] [ y - 1 ] = e [ y ] [ x - 1 ] ;
    e [ y - 1 ] [ x - 1 ] = e [ y ] [ x - 1 ] ;
  }
  int [ ] [ ] dp = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dp [ i ] [ a ] = 1 ;
  }
  int flag = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      for ( int k = 0 ;
      k < e [ j ] . length ;
      k ++ ) {
        dp [ i + 1 ] [ k ] += dp [ i ] [ j ] ;
        if ( ( dp [ i + 1 ] [ b ] > 0 ) && ( dp [ i + 1 ] [ b ] > 0 ) ) {
          flag = 1 ;
        }
      }
    }
    if ( ( flag == 1 ) && ( dp [ i + 1 ] [ b ] > 0 ) ) {
      System . out . println ( dp [ i + 1 ] [ b ] % ( 10 * 9 + 7 ) ) ;
      break ;
    }
  }
  return dp ;
}
