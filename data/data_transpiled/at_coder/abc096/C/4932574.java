public static String input ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  char [ ] [ ] s = new char [ W + 2 ] [ W + 1 ] ;
  s [ 0 ] = '.' ;
  s [ 1 ] [ 0 ] = '.' ;
  s [ 1 ] [ 1 ] = '.' ;
  s [ 2 ] [ 0 ] = '.' ;
  s [ 3 ] [ 1 ] = '.' ;
  s [ 3 ] [ 2 ] = '.' ;
  String out = "Yes" ;
  for ( int i = 1 ;
  i <= H ;
  i ++ ) {
    for ( int j = 1 ;
    j <= W ;
    j ++ ) {
      if ( s [ i ] [ j ] == '.' ) {
        continue ;
      }
      for ( int k = 1 , l = - 1 ;
      k <= l ;
      k ++ ) {
        if ( s [ i + k ] [ j + l ] == '#' ) {
          break ;
        }
      }
      else {
        out = "No" ;
        break ;
      }
    }
    if ( out . equals ( "No" ) ) {
      break ;
    }
  }
  System . out . println ( out ) ;
  return out ;
}
