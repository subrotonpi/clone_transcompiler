public static int [ ] getM ( int n , int a , int b ) {
  int [ ] M = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    M [ i ] = 1 ;
  }
  a -- ;
  b -- ;
  M [ a ] = 1 ;
  M [ b ] = 1 ;
  int turn = 1 ;
  do {
    if ( turn == 1 ) {
      if ( M [ a + 1 ] == 1 && M [ a - 1 ] == 0 ) {
        M [ a - 1 ] = 1 ;
        M [ a ] = 0 ;
        a -- ;
        turn *= - 1 ;
      }
      else if ( M [ a - 1 ] == 1 && M [ a + 1 ] == 0 ) {
        M [ a + 1 ] = 1 ;
        M [ a ] = 0 ;
        a ++ ;
        turn *= - 1 ;
      }
      else if ( M [ a - 1 ] == 0 && M [ a + 1 ] == 0 ) {
        M [ a + 1 ] = 1 ;
        M [ a ] = 0 ;
        a ++ ;
        turn *= - 1 ;
      }
      else {
        System . out . println ( "Borys" ) ;
        exit ( ) ;
      }
    }
    else {
      if ( M [ b + 1 ] == 1 && M [ b - 1 ] == 0 ) {
        M [ b - 1 ] = 1 ;
        M [ b ] = 0 ;
        b -- ;
        turn *= - 1 ;
      }
      else if ( M [ b - 1 ] == 1 && M [ b + 1 ] == 0 ) {
        M [ b + 1 ] = 1 ;
        M [ b ] = 0 ;
        b ++ ;
        turn *= - 1 ;
      }
      else if ( M [ b - 1 ] == 0 && M [ b + 1 ] == 0 ) {
        M [ b - 1 ] = 1 ;
        M [ b ] = 0 ;
        b -- ;
        turn *= - 1 ;
      }
      else {
        System . out . println ( "Alice" ) ;
        exit ( ) ;
      }
    }
  }
  while ( turn == 1 ) ;
  return M ;
}
