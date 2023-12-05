public static void calc ( int K , int [ ] xyc ) {
  int K2 = K * 2 ;
  int N = xyc . length ;
  int [ ] [ ] p = new int [ K2 ] [ K ] ;
  for ( int i = 0 ;
  i < K2 ;
  i ++ ) {
    int x = xyc [ i ] ;
    int y = xyc [ i ] ;
    int c = xyc [ i ] ;
    y += c * K ;
    p [ x % K2 ] [ y % K2 ] ++ ;
    p [ ( x + K ) % K2 ] [ ( y + K ) % K2 ] ++ ;
  }
  {
    int r = Integer . MAX_VALUE ;
    System . arraycopy ( xyc [ 0 ] , 0 , p , 0 , K ) ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      int a = Integer . parseInt ( xyc [ i ] ) ;
      int b = Integer . parseInt ( xyc [ i ] ) ;
      r += - a + b ;
      System . arraycopy ( xyc [ i ] , 0 , p , i , K ) ;
    }
  }
  int [ ] [ ] pksum = new int [ N ] [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    pksum [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < K ;
    j ++ ) {
      pksum [ i ] [ j ] = Integer . parseInt ( xyc [ i ] ) ;
    }
  }
  int rmax = N / 2 ;
  for ( int y = 0 ;
  y < K ;
  y ++ ) {
    int rcount = Integer . parseInt ( xyc [ y ] ) ;
    for ( int x = 0 ;
    x < K ;
    x ++ ) {
      rmax = Math . max ( rmax , rcount , N - rcount ) ;
      rcount += - pksum [ x ] [ y ] + pksum [ x + K ] [ y ] ;
    }
  }
  System . out . println ( calc ( K , xyc ) ) ;
}
