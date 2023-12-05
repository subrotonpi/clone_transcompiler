static final int [ ] [ ] input ( ) {
  int r = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] aArray = new int [ r ] [ c ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    int [ ] a = new int [ c ] ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      a [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
    aArray [ i ] = a ;
  }
  int aMax ;
  if ( d % 2 == 0 ) {
    aMax = aArray [ 0 ] [ 0 ] ;
  }
  else {
    aMax = Math . max ( aMax , aArray [ 0 ] [ 1 ] ) ;
  }
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    if ( i > d ) {
      break ;
    }
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( i + j > d ) {
        break ;
      }
      else if ( ( i + j ) % 2 == d % 2 ) {
        aMax = Math . max ( aMax , aArray [ i ] [ j ] ) ;
      }
    }
  }
  System . out . println ( aMax ) ;
  return aArray ;
}
