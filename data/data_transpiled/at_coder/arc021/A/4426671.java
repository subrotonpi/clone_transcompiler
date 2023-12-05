public static boolean inside ( int x , int y ) {
  return 0 <= x && x < 4 && 0 <= y && y < 4 ;
}
int [ ] [ ] a = new int [ 4 ] [ 4 ] ;
for ( int i = 0 ;
i < 4 ;
i ++ ) {
  for ( int j = 0 ;
  j < 4 ;
  j ++ ) {
    for ( int x = 0 , y = 1 ;
    x < 4 ;
    x ++ , y ++ ) {
      int ii = i + x ;
      int jj = j + y ;
      if ( ! inside ( ii , jj ) ) continue ;
      if ( a [ i ] [ j ] == a [ ii ] [ jj ] ) {
        System . out . println ( "CONTINUE" ) ;
        exit ( ) ;
      }
    }
  }
}
return false ;
}
