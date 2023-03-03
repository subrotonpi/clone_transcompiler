public static int [ ] [ ] creates ( ) {
  int w = Integer . parseInt ( input . readLine ( ) ) , h = Integer . parseInt ( input . readLine ( ) ) , n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] s = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = new int [ 3 ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      s [ i ] [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
  }
  int l = 0 ;
  int d = 0 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    if ( s [ j ] [ 2 ] == 1 && s [ j ] [ 0 ] > l ) {
      l = s [ j ] [ 0 ] ;
    }
    else if ( s [ j ] [ 2 ] == 2 && s [ j ] [ 0 ] < w ) {
      w = s [ j ] [ 0 ] ;
    }
    else if ( s [ j ] [ 2 ] == 3 && s [ j ] [ 1 ] > d ) {
      d = s [ j ] [ 1 ] ;
    }
    else if ( s [ j ] [ 2 ] == 4 && s [ j ] [ 1 ] < h ) {
      h = s [ j ] [ 1 ] ;
    }
  }
  if ( h - d > 0 && w - l > 0 ) {
    System . out . println ( ( h - d ) * ( w - l ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return s ;
}
