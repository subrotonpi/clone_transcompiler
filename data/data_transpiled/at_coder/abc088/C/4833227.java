{
  c = new int [ 3 ] [ 3 ] ;
  for ( int i = 0 ;
  i <= 3 ;
  i ++ ) {
    c [ i ] = new int [ 3 ] ;
    for ( int j = 0 ;
    j <= 3 ;
    j ++ ) {
      c [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  boolean f = true ;
  for ( int i = 0 ;
  i <= 2 ;
  i ++ ) {
    f = f && c [ i ] [ 0 ] - c [ i ] [ 1 ] == c [ i + 1 ] [ 0 ] - c [ i + 1 ] [ 1 ] ;
    f = f && c [ i ] [ 1 ] - c [ i ] [ 2 ] == c [ i + 1 ] [ 1 ] - c [ i + 1 ] [ 2 ] ;
  }
  for ( int i = 0 ;
  i <= 2 ;
  i ++ ) {
    f = f && c [ 0 ] [ i ] - c [ 1 ] [ i ] == c [ 0 ] [ i + 1 ] - c [ 1 ] [ i + 1 ] ;
    f = f && c [ 1 ] [ i ] - c [ 2 ] [ i ] == c [ 1 ] [ i + 1 ] - c [ 2 ] [ i + 1 ] ;
  }
  if ( f ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
