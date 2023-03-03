public static void print ( String input ) {
  int r = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] [ ] p = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x1 = Integer . parseInt ( input ) ;
    int y1 = Integer . parseInt ( input ) ;
    int x2 = Integer . parseInt ( input ) ;
    int y2 = Integer . parseInt ( input ) ;
    if ( x1 == 0 || x1 == r || y1 == 0 || y1 == c ) {
      if ( x2 == 0 || x2 == r || y2 == 0 || y2 == c ) {
        if ( y1 == 0 ) p [ i ] [ 0 ] = x1 ;
        else if ( x1 == r ) p [ i ] [ 1 ] = r + y1 ;
        else if ( y1 == c ) p [ i ] [ 2 ] = 2 * r + c - x1 ;
        else p [ i ] [ 2 ] = 2 * r + 2 * c - y1 ;
        if ( y2 == 0 ) p [ i ] [ 0 ] = x2 ;
        else if ( x2 == r ) p [ i ] [ 1 ] = r + y2 ;
        else if ( y2 == c ) p [ i ] [ 2 ] = 2 * r + c - x2 ;
        else p [ i ] [ 2 ] = 2 * r + 2 * c - y2 ;
      }
    }
  }
  Arrays . sort ( p ) ;
  int [ ] t = new int [ p . length ] ;
  int old = - 1 ;
  for ( int i = 0 ;
  t [ i ] != p [ i ] . length ;
  i ++ ) {
    int temp = p [ i ] [ 1 ] ;
    if ( temp == old ) {
      t [ i ] = t [ i ] ;
      if ( t . length == 0 ) old = - 1 ;
      else old = t [ i ] ;
    }
    else {
      t [ i ] = temp ;
      old = temp ;
    }
  }
  if ( t . length > 0 ) System . out . println ( "NO" ) ;
  else System . out . println ( "YES" ) ;
}
