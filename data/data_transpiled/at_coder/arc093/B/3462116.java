public static int A = Integer . parseInt ( input ) {
  int h = 100 , w = 100 ;
  char [ ] [ ] grid = new char [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      grid [ i ] [ j ] = j < 50 ? '.' : '#' ;
    }
  }
  A -- ;
  B -- ;
  char [ ] reg = new char [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) {
    reg [ i ] = i % 2 == 0 ? '.' : '#' ;
  }
  for ( int i = 0 ;
  i < 25 ;
  i ++ ) {
    if ( B >= 50 ) {
      grid [ i * 2 ] = reg ;
      B -= 50 ;
    }
    else {
      for ( int j = 0 ;
      j < B ;
      j ++ ) {
        grid [ i * 2 ] [ j * 2 ] = '#' ;
      }
      break ;
    }
  }
  for ( int i = 0 ;
  i < 25 ;
  i ++ ) {
    if ( A >= 50 ) {
      grid [ 99 - i * 2 ] = reg ;
      A -= 50 ;
    }
    else {
      for ( int j = 0 ;
      j < A ;
      j ++ ) {
        grid [ 99 - i * 2 ] [ j * 2 ] = '.' ;
      }
      break ;
    }
  }
  System . out . println ( h + " " + w ) ;
  for ( char [ ] row : grid ) {
    System . out . println ( new String ( row ) ) ;
  }
  return h ;
}
