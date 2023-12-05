public static void print ( int a , int b ) {
  int [ ] [ ] grid = new int [ a ] [ b ] ;
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < grid [ i ] . length ;
    j ++ ) {
      grid [ i ] [ j ] = i < 50 ? "#" : "." ;
    }
  }
  int whiteCnt = 1 ;
  while ( whiteCnt < a ) {
    grid [ ( whiteCnt / 24 ) * 2 ] [ ( whiteCnt % 24 ) * 2 + 1 ] = "." ;
    whiteCnt ++ ;
  }
  int blackCnt = 1 ;
  while ( blackCnt < b ) {
    grid [ ( blackCnt / 24 ) * 2 ] [ ( blackCnt % 24 ) * 2 + 50 + 1 ] = "#" ;
    blackCnt ++ ;
  }
  System . out . println ( 100 + " " + 100 ) ;
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    System . out . println ( Arrays . toString ( grid [ i ] ) ) ;
  }
}
