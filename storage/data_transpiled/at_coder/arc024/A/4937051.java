public static int [ ] convert ( String input ) {
  int L = Integer . parseInt ( input ) ;
  int R = Integer . parseInt ( input ) ;
  int [ ] l = new int [ L ] ;
  int [ ] r = new int [ R ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input ) ;
    r [ i ] = Integer . parseInt ( input ) ;
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < r . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < r . length ;
    j ++ ) {
      if ( l [ i ] == r [ j ] ) {
        r [ j ] = l [ j ] ;
        cnt ++ ;
        break ;
      }
    }
  }
  System . out . println ( cnt ) ;
  return l ;
}
