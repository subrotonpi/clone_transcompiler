static boolean checkHorizontal ( int [ ] [ ] d ) {
  int i , j , l , r ;
  int N = 0 ;
  int h = 0 ;
  int l = 0 , r = d [ i ] . length - 1 ;
  while ( l < r ) {
    if ( d [ i ] [ l ] != d [ i ] [ r ] ) {
      if ( d [ i ] [ l ] == - 1 ) d [ i ] [ l ] = d [ i ] [ r ] ;
      else if ( d [ i ] [ r ] == - 1 ) d [ i ] [ r ] = d [ i ] [ l ] ;
      else return false ;
    }
    l ++ ;
    r -- ;
  }
  /* main */
  int T = Integer . parseInt ( input . readLine ( ) ) ;
  for ( i = 1 ;
  i <= T ;
  i ++ ) {
    int N = Integer . parseInt ( input . readLine ( ) ) ;
    d = new int [ N ] ;
    for ( int t = 0 ;
    t < d [ i ] . length ;
    t ++ ) {
      d [ i ] = d [ i ] [ 0 ] ;
    }
    solve ( N , d ) ;
    d = new int [ N ] ;
    for ( int t = 0 ;
    t < d [ i ] . length - 1 ;
    t ++ ) {
      d [ i ] = d [ i ] [ 0 ] ;
    }
    solve ( N , d ) ;
    d = new int [ N ] ;
    for ( int t = 0 ;
    t < d [ i ] . length - 1 ;
    t ++ ) {
      d [ i ] = d [ i ] [ 0 ] ;
    }
    solve ( N , d ) ;
    d = new int [ N ] ;
    for ( int t = 0 ;
    t < d [ i ] . length ;
    t ++ ) {
      d [ i ] = d [ i ] [ 0 ] ;
    }
    for ( int t = 0 ;
    t < d [ i ] . length - 1 ;
    t ++ ) {
      d [ i ] = d [ i ] [ 0 ] ;
    }
    for ( int t = 0 ;
    t < d [ i ] . length - 1 ;
    t ++ ) {
      d [ i ] [ 0 ] = d [ i ] [ 0 ] ;
    }
    for ( int t = 0 ;
    t < d [ i ] . length ;
    t ++ ) {
      d [ i ] [ 0 ] = d [ i ] [ 0 ] ;
    }
    solve ( N , d ) ;
  }
  return true ;
}
