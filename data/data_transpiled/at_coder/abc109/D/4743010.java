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
      if ( a [ i ] [ j ] % 2 != 0 ) {
        out [ i ] [ j ] = i + 1 ;
        out [ i ] [ j + 1 ] = i + 1 ;
        out [ i ] [ j ] -- ;
        a [ i ] [ j + 1 ] ++ ;
      }
    }
  }
  for ( int i = 0 ;
  i < H - 1 ;
  i ++ ) {
    if ( a [ i ] [ W - 1 ] % 2 != 0 ) {
      out [ i ] [ W - 1 ] = i + 1 ;
      out [ i ] [ W ] = i + 2 ;
      out [ i ] [ W - 1 ] -- ;
      a [ i + 1 ] [ W - 1 ] ++ ;
    }
  }
  System . out . println ( out . length ) ;
  for ( int sub : out ) {
    System . out . println ( Arrays . toString ( sub ) ) ;
  }
  return null ;
}
