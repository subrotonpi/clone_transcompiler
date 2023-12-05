public static int [ ] getB ( ) {
  L = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] B = new int [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int z = B [ 0 ] ;
  for ( int y = 1 ;
  y < B . length ;
  y ++ ) {
    z = z ^ B [ y ] ;
  }
  if ( z == 0 ) {
    int g = 0 ;
    int [ ] A = new int [ B . length ] ;
    for ( int i = 0 ;
    i < B . length ;
    i ++ ) {
      g = g ^ B [ i ] ;
      A [ i ] = g ;
    }
    for ( int t = A . length - 1 ;
    t >= 0 ;
    t -- ) {
      System . out . println ( A [ t ] ) ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return B ;
}
