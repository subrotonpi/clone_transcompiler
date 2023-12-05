static final int [ ] [ ] getLengths ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  if ( W == 1 ) {
    System . out . println ( 1 ) ;
    System . exit ( 0 ) ;
  }
  else if ( W == 2 ) {
    System . out . println ( 2 * ( H - 1 ) ) ;
    System . exit ( 0 ) ;
  }
  int [ ] [ ] dic = {
    1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 1 }
    ;
    int [ ] [ ] a = new int [ H + 1 ] [ W ] ;
    for ( int i = 0 ;
    i < H + 1 ;
    i ++ ) {
      a [ i ] [ 0 ] = a [ i - 1 ] [ 0 ] * dic [ W - 2 ] + a [ i - 1 ] [ 1 ] * dic [ W - 3 ] ;
      for ( int j = 1 ;
      j <= W - 1 ;
      j ++ ) {
        a [ i ] [ j ] = a [ i - 1 ] [ j - 1 ] * dic [ W - 2 ] + a [ i - 1 ] [ j + 1 ] * dic [ W - 1 ] * dic [ W - 3 ] ;
      }
      a [ i ] [ W - 1 ] = a [ i - 1 ] [ W - 1 ] * dic [ W - 2 ] + a [ i - 1 ] [ W - 2 ] * dic [ W - 3 ] ;
    }
    System . out . println ( a [ H ] [ K - 1 ] % 1000000007 ) ;
    return a ;
  }
  