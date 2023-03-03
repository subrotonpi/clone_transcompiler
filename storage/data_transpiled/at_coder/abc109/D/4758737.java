public static void print ( int H , int W ) {
  int M [ ] [ ] = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    M [ i ] [ i ] = i % 2 == 1 ;
  }
  List < Integer > LIST = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( M [ i ] [ j ] ) {
        if ( j < W - 1 ) {
          LIST . add ( new Integer ( i + 1 ) ) ;
          LIST . add ( new Integer ( j + 1 ) ) ;
          M [ i ] [ j + 1 ] ^= true ;
        }
        else if ( i < H - 1 ) {
          LIST . add ( new Integer ( i + 1 ) ) ;
          LIST . add ( new Integer ( j + 1 ) ) ;
          M [ i ] [ j + 1 ] ^= true ;
        }
      }
    }
  }
  System . out . println ( LIST . size ( ) ) ;
  for ( Integer c : LIST ) {
    System . out . println ( ( char ) c ) ;
  }
}
