static final String [ ] [ ] land = new String [ 10 ] [ 10 ] ;
int [ ] firstCheck = {
  0 , 0 }
  ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    String lst = new String ( input ) ;
    if ( lst . contains ( "o" ) ) {
      firstCheck [ 0 ] = i ;
      firstCheck [ 1 ] = lst . indexOf ( "o" ) ;
    }
    land [ i ] [ 0 ] = lst ;
  }
  int [ ] [ ] check = new int [ 10 ] [ 10 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) check [ i ] [ 0 ] = new int [ 10 ] ;
  /* search for the row */
  if ( ( row < 0 ) || ( row >= 10 ) || ( col < 0 ) || ( col >= 10 ) || ( land [ i ] [ col ] == 'x' ) ) return null ;
  if ( ( check [ i ] [ col ] == 'x' ) && ( check [ i ] [ col ] == 'o' ) ) return null ;
  check [ i ] [ col ] = id ;
  /* search for the row */
  search ( row - 1 , col , id ) ;
  search ( row + 1 , col , id ) ;
  search ( row , col - 1 , id ) ;
  search ( row , col + 1 , id ) ;
  search ( firstCheck [ 0 ] , firstCheck [ 1 ] , 1 ) ;
  String ans = "YES" ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) for ( int j = 0 ;
  j < 10 ;
  j ++ ) {
    ans = "YES" ;
    if ( land [ i ] [ j ] == 'x' ) land [ i ] [ j ] = 'o' ;
    else continue ;
    /* search for the row */
    search ( i , j , 1 ) ;
    for ( int row = 0 ;
    row < 10 ;
    i ++ ) for ( int j = 0 ;
    j < 10 ;
    j ++ ) {
      ans = "YES" ;
      if ( land [ i ] [ j ] == 'x' ) land [ i ] [ j ] = 'o' ;
      else continue ;
      /* search for the row */
      search ( i , j , ans ) ;
    }
  }
  System . out . println ( "NO" ) ;
  return check ;
}
