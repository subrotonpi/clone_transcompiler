static int [ ] solve ( int [ ] data ) {
  if ( data . length == 0 ) {
    return new int [ ] {
      0 }
      ;
    }
    for ( int i = data . length - 1 ;
    i > 0 ;
    i -- ) {
      if ( data [ i ] < data [ i - 1 ] ) {
        data [ i - 1 ] = data [ i - 1 ] - 1 ;
        for ( int j = i ;
        j < data . length ;
        j ++ ) {
          data [ j ] = 9 ;
        }
      }
    }
    if ( ( data [ 0 ] == 0 ) && ( data [ 0 ] == 0 ) ) {
      System . arraycopy ( data , 0 , data , 0 , data . length ) ;
    }
    return data ;
  }
  