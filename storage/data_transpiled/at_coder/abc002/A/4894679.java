public static int [ ] [ ] a ( int [ ] [ ] a ) {
  int [ ] [ ] b = new int [ a . length ] [ a . length ] ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    if ( a [ i ] > b [ i ] ) {
      System . out . println ( a [ i ] ) ;
    }
    else {
      System . out . println ( b [ i ] ) ;
    }
  }
  return b ;
}
