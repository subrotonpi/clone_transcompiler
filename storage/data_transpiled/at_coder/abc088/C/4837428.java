[ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  int [ ] cI = new int [ 3 ] ;
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) {
    cI [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  dif [ i ] = new int [ 3 ] ;
  dif [ i ] [ 0 ] = cI [ 0 ] - cI [ 1 ] ;
  dif [ i ] [ 1 ] = cI [ 1 ] - cI [ 2 ] ;
  if ( dif [ i ] [ 0 ] == dif [ i ] [ 1 ] == dif [ i ] [ 2 ] ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
