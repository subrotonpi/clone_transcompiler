@ WorkerThread public static void setWall ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  String [ ] s = new String [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) s [ i ] = input . readLine ( ) ;
  String y = "." ;
  String n = "#" ;
  int [ ] [ ] D = new int [ W ] [ H ] ;
  int num = 0 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( s [ i ] . charAt ( j ) == y ) num ++ ;
      else D [ i ] [ j ] = - 1 ;
    }
  }
  /* set wall */
  H = D . length ;
  W = D [ 0 ] . length + 2 ;
  D = new int [ W ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    D [ i ] [ 0 ] = i ;
  }
  for ( int j = 0 ;
  j < W ;
  j ++ ) {
    D [ 0 ] [ j ] = - 1 ;
  }
  D = new int [ W ] [ W ] ;
  D [ 0 ] [ 0 ] = - 1 ;
  D [ 1 ] [ 1 ] = 1 ;
}
