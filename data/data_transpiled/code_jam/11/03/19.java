static final String [ ] [ ] bits ( int [ ] xs ) throws IOException {
  int i = 0 ;
  int [ ] [ ] toReturn = new int [ 32 ] [ 32 ] ;
  for ( int x : xs ) {
    toReturn [ x ] [ 0 ] = 0 ;
  }
  int cur2 = 1 ;
  while ( i < 32 ) {
    Iterator < Integer > it = xs . iterator ( ) ;
    while ( it . hasNext ( ) ) {
      int j = it . next ( ) ;
      if ( j % 2 == 1 ) {
        toReturn [ j ] [ i ] = 1 ;
        xs [ j ] -- ;
      }
      xs [ j ] /= 2 ;
    }
    i ++ ;
  }
  toReturn = Arrays . copyOf ( toReturn , toReturn . length ) ;
  return toReturn ;
}
