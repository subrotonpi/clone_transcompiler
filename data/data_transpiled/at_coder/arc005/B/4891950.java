public static String [ ] S ( ) {
  String S [ ] = input . split ( " " ) ;
  int x = Integer . parseInt ( S [ 0 ] ) , y = Integer . parseInt ( S [ 1 ] ) , W = S [ 2 ] ;
  String [ ] [ ] c = new String [ 9 ] [ ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    c [ i ] [ j ] = input . split ( " " ) ;
  }
  {
    int k = 0 ;
    int i = 0 ;
    int j = 0 ;
    int di = 0 ;
    int dj = 0 ;
    return ( k == 4 ? "" : c [ i ] [ j ] + f ( k + 1 , i + di , j + dj , di < i + di ? 0 : - di , dj < j ? 0 : - dj ) ) ;
  }
  String ans = f ( 0 , y - 1 , x - 1 , ( ( 'D' == W && y - 1 < 8 ) || ( 'U' == W && y - 1 == 0 ) ) ? - 1 : 0 , ( 'U' == W && 0 < y - 1 ) || ( 'D' == W && 0 < x - 1 ) ) ;
  System . out . println ( ans ) ;
  return null ;
}
