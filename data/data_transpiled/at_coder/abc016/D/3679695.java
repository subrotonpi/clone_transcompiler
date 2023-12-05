public static int Ax = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] Board = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Board [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      Board [ i ] [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
  }
  Board [ 0 ] = Board [ 0 ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x1 = Board [ i ] ;
    int y1 = Board [ i ] ;
    int x2 = Board [ i + 1 ] ;
    int y2 = Board [ i + 2 ] ;
    int D = - ( Bx - Ax ) * ( y2 - y1 ) + ( By - Ay ) * ( x2 - x1 ) ;
    if ( D != 0 ) {
      int t = ( - ( x1 - Ax ) * ( y2 - y1 ) + ( y1 - Ay ) * ( x2 - x1 ) ) / D ;
      int s = ( ( Bx - Ax ) * ( y1 - Ay ) - ( By - Ay ) * ( x1 - Ax ) ) / D ;
      if ( 0 < t && 0 < s && 0 < s ) ans ++ ;
    }
  }
  System . out . println ( ans / 2 + 1 ) ;
  return ans ;
}
