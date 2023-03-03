{
  c = Arrays . stream ( input . split ( " " ) ) . collect ( Collectors . toList ( ) ) ;
  int check = 0 ;
  int [ ] a = new int [ 3 ] , b = new int [ 3 ] ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      if ( c [ i ] [ j ] + c [ i + 1 ] [ j + 1 ] == c [ i + 1 ] [ j ] + c [ i ] [ j + 1 ] ) {
        check ++ ;
      }
    }
  }
  if ( c [ 0 ] [ 0 ] + c [ 2 ] [ 2 ] == c [ 0 ] [ 2 ] + c [ 2 ] [ 0 ] ) {
    check ++ ;
  }
  if ( check == 5 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return a ;
}
