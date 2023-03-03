public static int [ ] [ ] a ( int [ ] [ ] a , int [ ] [ ] b ) {
  int [ ] [ ] result = new int [ a . length ] [ b . length ] ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    result [ i ] = a [ i ] [ 0 ] ;
  }
  if ( a [ 0 ] >= b [ 0 ] ) {
    System . out . println ( a [ 0 ] ) ;
  }
  else {
    System . out . println ( b [ 0 ] ) ;
  }
  return result ;
}
