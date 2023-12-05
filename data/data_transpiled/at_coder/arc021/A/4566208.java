{
  a = Arrays . asList ( new LinkedList < Integer > ( ) ) ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( a [ i ] [ j ] == a [ i + 1 ] [ j ] || a [ i ] [ j ] == a [ i ] [ j + 1 ] ) {
        System . out . println ( "CONTINUE" ) ;
        exit ( ) ;
      }
    }
  }
  else {
    System . out . println ( "GAMEOVER" ) ;
  }
  return a ;
}
