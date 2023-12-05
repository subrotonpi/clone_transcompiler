public static int [ ] [ ] a ( ) {
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    a [ i ] = new int [ 4 ] ;
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      a [ i ] [ j ] = input . nextInt ( ) ;
    }
  }
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      int tmp = a [ i ] [ j ] ;
      a [ i ] [ j ] = a [ 3 - i ] [ 3 - j ] ;
      a [ 3 - i ] [ 3 - j ] = tmp ;
    }
  }
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    System . out . println ( Arrays . toString ( a [ i ] ) ) ;
  }
  return a ;
}
