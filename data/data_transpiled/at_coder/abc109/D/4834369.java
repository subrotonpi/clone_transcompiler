public static String [ ] [ ] getHW ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    a [ i ] = new int [ W ] ;
    for ( int j = 0 ;
    j < W - 1 ;
    j ++ ) {
      if ( a [ i ] [ j ] % 2 == 1 ) {
        a [ i ] [ j + 1 ] ++ ;
        ans [ i ] [ j + 1 ] = Integer . toString ( i + 1 ) + " " + Integer . toString ( j + 1 ) + " " + Integer . toString ( i + 1 ) + " " + Integer . toString ( j + 2 ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < H - 1 ;
  i ++ ) {
    if ( a [ i ] [ W - 1 ] % 2 == 1 ) {
      a [ i + 1 ] [ W - 1 ] ++ ;
      ans [ i ] [ W - 1 ] = Integer . toString ( i + 1 ) + " " + Integer . toString ( W ) + " " + Integer . toString ( i + 2 ) + " " + Integer . toString ( W ) ;
    }
  }
  int n = ans . length ;
  System . out . println ( n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return a ;
}
