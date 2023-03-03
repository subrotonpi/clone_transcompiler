public static String count ( int h , int w ) {
  int [ ] S = new int [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    S [ i ] = input . nextInt ( ) ;
  }
  /* Count the number of characters in the string */
  int p = 0 ;
  if ( h >= 1 && w >= 1 && S [ h - 1 ] [ w - 1 ] == '#' ) {
    p ++ ;
  }
  if ( h >= 1 && w >= 1 && S [ h - 1 ] [ w - 1 ] == '#' ) {
    p ++ ;
  }
  if ( h >= 1 && w <= w - 2 && S [ h - 1 ] [ w + 1 ] == '#' ) {
    p ++ ;
  }
  if ( h >= 1 && w <= w - 2 && S [ h - 1 ] [ w + 1 ] == '#' ) {
    p ++ ;
  }
  if ( h >= 1 && w <= w - 2 && S [ h - 1 ] [ w + 1 ] == '#' ) {
    p ++ ;
  }
  if ( h >= 1 && w <= w - 2 && S [ h - 1 ] [ w + 1 ] == '#' ) {
    p ++ ;
  }
  String p = Integer . toString ( p ) ;
  return ( p ) ;
}
