@ VisibleForTesting static int [ ] [ ] binarySearch ( ) {
  int [ ] [ ] sa = new int [ 10 * 5 + 1 ] [ 10 ] ;
  int [ ] ra = new int [ 10 ] ;
  int [ ] [ ] ha = new int [ 10 ] [ 10 ] ;
  for ( int i = 0 ;
  i < sa . length ;
  i ++ ) {
    sa [ i ] = new int [ 2 ] ;
    for ( int j = 0 ;
    j < sa [ i ] . length ;
    j ++ ) {
      sa [ i ] [ j ] = i ;
    }
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int h = Integer . parseInt ( input . nextLine ( ) ) ;
    sa [ i ] [ 0 ] = r ;
    sa [ i ] [ 1 ] = h - 1 ;
    ra [ i ] [ 2 ] = 0 ;
    ha [ i ] [ h - 1 ] ++ ;
  }
  Arrays . sort ( ra ) ;
  /* We can find a mini mini cluster with a mini cluster */
  if ( sa [ 0 ] == 0 ) {
    return new int [ ] {
      sa [ 1 ] , sa [ 2 ] , sa [ 0 ] - 1 }
      ;
    }
    if ( sa [ 1 ] == 1 ) {
      return new int [ ] {
        sa [ 2 ] , sa [ 0 ] , sa [ 1 ] - 1 }
        ;
      }
      if ( sa [ 2 ] == 2 ) {
        return new int [ ] {
          sa [ 0 ] , sa [ 1 ] , sa [ 2 ] - 1 }
          ;
        }
        for ( int i = 0 ;
        i < sa . length ;
        i ++ ) {
          int [ ] p = jnk ( sa [ i ] , ha [ i ] ) ;
          p [ 0 ] += binarySearch ( ra , sa [ i ] ) ;
          p [ 1 ] += n - 1 - sum ( p ) ;
          System . out . println ( ( int [ ] ) p [ 0 ] ) ;
        }
        return sa ;
      }
      