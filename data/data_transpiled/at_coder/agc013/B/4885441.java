static void m ( int n , int m , String ... t ) {
  int [ ] [ ] e = new int [ n + 1 ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    e [ i ] [ 0 ] = i ;
    e [ i ] [ 1 ] = i ;
  }
  for ( int a = 0 , b = t . length ;
  a < b ;
  a ++ , b ++ ) {
    e [ a ] [ b ] = i ;
    e [ b ] [ a ] = i ;
  }
  int [ ] f = new int [ ~ n ] ;
  f [ 1 ] = 1 ;
  int a = 1 ;
  while ( true ) {
    for ( int v : e [ a ] [ b ] ) {
      if ( f [ v ] == 0 ) {
        f [ v ] = 1 ;
        a ++ ;
        break ;
      }
    }
  }
  a = 0 ;
  System . arraycopy ( f , 0 , a , 0 , a . length ) ;
}
