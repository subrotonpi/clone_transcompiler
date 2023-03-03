private static boolean scanup ( char [ ] [ ] grid , int y0 , int x ) {
  for ( int y = y0 - 1 ;
  y >= 0 ;
  y -- ) {
    if ( grid [ y ] [ x ] != '.' ) {
      return true ;
    }
  }
  return false ;
}
