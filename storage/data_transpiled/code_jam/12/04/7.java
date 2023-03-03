@ VisibleForTesting static int [ ] [ ] solve ( int x , int y , int q , int x1 , int y1 , int [ ] [ ] T , int [ ] [ ] x , int [ ] [ ] y ) {
  int TOTAL = Integer . parseInt ( readLine ( ) ) ;
  int i , j , x1 , y1 , total = 0 ;
  int [ ] [ ] x = new int [ total ] [ ] ;
  int [ ] [ ] y = new int [ total ] [ ] ;
  int [ ] [ ] dx = new int [ total ] ;
  int [ ] [ ] dx = new int [ total ] ;
  int [ ] [ ] dy = new int [ total ] ;
  int [ ] [ ] dx = new int [ total ] ;
  int [ ] [ ] dx = new int [ total ] ;
  int [ ] [ ] dy = new int [ total ] ;
  int [ ] [ ] dx = new int [ total ] ;
  int [ ] [ ] dy = new int [ total ] ;
  if ( i > 0 ) {
    dx [ 0 ] = - rx ;
  }
  else {
    dx [ 0 ] = - ry ;
  }
  int [ ] [ ] dx = new int [ total ] ;
  int [ ] [ ] dy = new int [ total ] ;
  if ( j > 0 ) {
    dy [ 0 ] = - ry ;
  }
  if ( dy [ 0 ] == 0 ) {
    do {
      x [ 0 ] = x [ 0 ] + dx ;
      System . arraycopy ( x , 0 , dx , dy , 0 ) ;
    }
    while ( dy [ 0 ] < dy [ 0 ] ) ;
  }
  do {
    int [ ] yy = dy < 0 ? y [ 0 ] : y [ 0 ] + dy ;
    int [ ] xx = X ( p , q , yy ) ;
    int [ ] [ ] dx = new int [ total ] ;
    int [ ] yy = new int [ total ] ;
    int [ ] [ ] dx = new int [ total ] ;
    int [ ] [ ] dy = new int [ total ] ;
    for ( int [ ] l : Arrays . copyOfRange ( dx , 0 , total ) ) {
      dx [ 0 ] = - dx [ 0 ] ;
      dy [ 0 ] = - dy [ 0 ] ;
    }
  }
  while ( dx [ 0 ] != 0 ) ;
  System . out . println ( "Case #{0}: {1}" . format ( testCase ) ) ;
  return T ;
}
