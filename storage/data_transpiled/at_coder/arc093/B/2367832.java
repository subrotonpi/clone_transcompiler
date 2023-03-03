public static int white = Integer . parseInt ( input ) {
  int white = 0 , black = 0 ;
  white -- ;
  black -- ;
  char [ ] [ ] grid = new char [ 100 ] [ 100 ] ;
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < grid [ i ] . length ;
    j ++ ) {
      grid [ i ] [ j ] = '#' ;
    }
  }
  for ( int i = 1 ;
  i < grid . length ;
  i ++ ) {
    for ( int j = 50 ;
    j < grid [ i ] . length ;
    j ++ ) {
      grid [ i ] [ j ] = '.' ;
    }
  }
  int a = 3 ;
  int b = 3 ;
  do {
    if ( white == 0 ) break ;
    grid [ a ] [ b ] = '.' ;
    white -- ;
    a += 2 ;
    if ( a > 93 ) {
      a = 3 ;
      b += 2 ;
    }
  }
  while ( white > 0 ) ;
  int c = 3 ;
  int d = 53 ;
  do {
    if ( black == 0 ) break ;
    grid [ c ] [ d ] = '#' ;
    black -- ;
    c += 2 ;
    if ( c > 93 ) {
      c = 3 ;
      d += 2 ;
    }
  }
  while ( black > 0 ) ;
  System . out . println ( 100 + " " + 100 ) ;
  for ( char [ ] [ ] i : grid ) {
    System . out . println ( Arrays . toString ( i ) ) ;
  }
  return white ;
}
