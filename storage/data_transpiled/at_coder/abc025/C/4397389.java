{
  b = Arrays . asList ( new LinkedList < Integer > ( ) ) ;
  c = Arrays . asList ( new LinkedList < Integer > ( ) ) ;
  reach = new ArrayList < Integer > ( 1 << 18 ) ;
  /* ox() */
  if ( ( y == 9 ) && ( y == 9 ) ) {
    int point = 0 ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 2 ;
      j ++ ) {
        if ( ( ( ( x >> ( i * 3 + j ) * 2 ) & 3 ) ^ ( ( x >> ( i * 3 + j + 1 ) * 2 ) & 3 ) ) != 0 ) {
          point += 0 ;
        }
        else {
          point += c . get ( i ) . get ( j ) ;
        }
      }
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) {
        for ( int j = 0 ;
        j < 2 ;
        j ++ ) {
          if ( ( ( ( x >> ( j * 3 + i ) * 2 ) & 3 ) ^ ( ( x >> ( ( j + 1 ) * 3 + i ) * 2 ) & 3 ) ) != 0 ) {
            point += 0 ;
          }
          else {
            point += b . get ( j ) . get ( i ) ;
          }
        }
      }
      return point ;
    }
    else {
      y ++ ;
      int result [ ] = new int [ 9 ] ;
      for ( int i = 0 ;
      i < 9 ;
      i ++ ) {
        int j = 1 << i * 2 ;
        if ( ( ( ( x >> ( i * 2 ) ) & 3 ) == 0 ) && ( ( y % 2 == 0 ) && ( y == 9 ) ) ) {
          int t ;
          if ( ( y % 2 == 0 ) && ( y == 9 ) ) {
            t = x | j ;
          }
          else {
            t = x | j * 2 ;
          }
          if ( ( reach [ t ] == null ) && ( y == 9 ) ) {
            reach [ t ] = ox ( t , y ) ;
          }
          result [ y ] = reach [ t ] ;
        }
      }
      if ( ( y % 2 == 1 ) && ( y == 9 ) ) {
        return max ( result ) ;
      }
      else {
        return min ( result ) ;
      }
    }
  }
  