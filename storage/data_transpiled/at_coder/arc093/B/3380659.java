public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  char [ ] [ ] grid = new char [ 50 ] [ 50 ] ;
  for ( int i = 0 ;
  i < 50 ;
  i ++ ) {
    char [ ] whiteLine = new char [ 100 ] ;
    for ( int k = 0 ;
    k < 100 ;
    k ++ ) whiteLine [ k ] = '.' ;
    grid [ i ] = whiteLine ;
  }
  for ( int i = 0 ;
  i < 50 ;
  i ++ ) {
    char [ ] blackLine = new char [ 100 ] ;
    for ( int k = 0 ;
    k < 100 ;
    k ++ ) blackLine [ k ] = '#' ;
    grid [ i ] = blackLine ;
  }
  b += - 1 ;
  int check = 1 ;
  int x = 1 ;
  int y = 1 ;
  while ( b > 0 ) {
    grid [ y ] [ x ] = '#' ;
    b += - 1 ;
    if ( x + 2 < 50 ) x += 2 ;
    else {
      check = check * ( - 1 ) ;
      if ( check == 1 ) x = 2 ;
      else x = 1 ;
      y += 2 ;
    }
  }
  a += - 1 ;
  check = 1 ;
  x = 1 ;
  y = 55 ;
  while ( a > 0 ) {
    grid [ y ] [ x ] = '.' ;
    a += - 1 ;
    if ( x + 2 < 50 ) x += 2 ;
    else {
      check = check * ( - 1 ) ;
      if ( check == 1 ) x = 2 ;
      else x = 1 ;
      y += 2 ;
    }
  }
  System . out . println ( 100 + " " + 100 ) ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    for ( int k = 0 ;
    k < 100 ;
    k ++ ) {
      if ( k != 99 ) System . out . print ( grid [ i ] [ k ] ) ;
      else System . out . println ( grid [ i ] [ k ] ) ;
    }
  }
  return a ;
}
