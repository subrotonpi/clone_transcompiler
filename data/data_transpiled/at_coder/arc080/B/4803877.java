public static int [ ] [ ] getStdIn ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] [ ] ans = new int [ H ] [ W ] ;
  int c = 1 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < a [ i ] . length ;
    j ++ ) {
      ans [ c ] [ j ] = a [ i ] [ j ] ;
    }
    c ++ ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( i % 2 == 0 ) {
        System . out . print ( ans [ i * W + j ] [ j ] ) ;
      }
      else {
        System . out . print ( ans [ i * W + W - 1 - j ] [ j ] ) ;
      }
      if ( j < W - 1 ) {
        System . out . print ( " " ) ;
      }
      else {
        System . out . println ( ) ;
      }
    }
  }
  return ans ;
}
