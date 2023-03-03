public static void print ( int H , int W ) {
  int [ ] [ ] a = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    a [ i ] = new int [ W ] ;
  }
  List < Integer > lis = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( ! i == H - 1 ) {
        if ( ( a [ i ] [ j ] ) % 2 == 1 ) {
          a [ i + 1 ] [ j ] = a [ i + 1 ] [ j ] + 1 ;
          lis . add ( new Integer ( i ) ) ;
          lis . add ( new Integer ( j ) ) ;
        }
      }
      else {
        if ( ! j == W - 1 ) {
          if ( ( a [ i ] [ j ] ) % 2 == 1 ) {
            a [ i ] [ j + 1 ] = a [ i ] [ j + 1 ] + 1 ;
            lis . add ( new Integer ( i ) ) ;
          }
        }
      }
    }
  }
  System . out . println ( lis . size ( ) ) ;
  for ( Integer i : lis ) {
    System . out . println ( i . intValue ( ) + 1 ) ;
  }
}
