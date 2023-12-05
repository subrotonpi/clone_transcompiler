public static int [ ] getS ( ) {
  int [ ] c = new int [ 26 ] ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    c [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( i < 3 ) {
      c [ S [ i ] ] ++ ;
      if ( c [ S [ i ] ] >= 2 ) {
        System . out . println ( 1 + i + 1 ) ;
        exit ( ) ;
      }
    }
    else {
    }
  }
  return c ;
}
