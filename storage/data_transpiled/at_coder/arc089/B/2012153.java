public static void calc ( int K , int [ ] xyc ) {
  int K2 = K * 2 ;
  int N = xyc . length ;
  int [ ] [ ] p = new int [ K2 ] [ K2 ] ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    int x = xyc [ i ] ;
    int y = xyc [ i ] ;
    int c = xyc [ i ] ;
    y += c * K ;
    p [ x % K2 ] [ y % K2 ] ++ ;
    p [ ( x + K ) % K2 ] [ ( y + K ) % K2 ] ++ ;
  }
  {
    int r = 0 ;
    new Random ( ) . nextInt ( ) ;
    for ( int i = 0 ;
    i < p . length ;
    i ++ ) {
      int x = p [ i ] [ i ] ;
      r += x ;
      new Random ( ) . nextInt ( ) ;
    }
  }
  int [ ] [ ] psum = new int [ K ] [ K ] ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    psum [ i ] = new int [ K ] ;
    for ( int j = 0 ;
    j < p [ i ] . length ;
    j ++ ) {
      psum [ i ] [ j ] = Collections . nCopies ( K , p [ i ] [ j ] ) ;
    }
    int [ ] [ ] pksum = new int [ K ] [ K ] ;
    for ( int j = 0 ;
    j < K ;
    j ++ ) {
      pksum [ i ] [ j ] = psum [ i ] [ j ] - a ;
    }
  }
  int rmax = N / 2 ;
  for ( int y = 0 ;
  y < K ;
  y ++ ) {
    int rcount = Arrays . binarySearch ( pksum , 0 , K ) ;
    for ( int x = 0 ;
    x < K ;
    x ++ ) {
      rmax = Math . max ( rmax , rcount , N - rcount ) ;
      rcount += - pksum [ x ] [ y ] + pksum [ x + K ] [ y ] ;
    }
  }
  System . out . println ( calc ( K , xyc ) ) ;
}
