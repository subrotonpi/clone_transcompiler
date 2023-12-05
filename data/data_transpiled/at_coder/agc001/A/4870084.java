public static int N = Integer . parseInt ( input ) {
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < c . length ;
  i ++ ) {
    c [ i ] = i ;
  }
  Arrays . sort ( c ) ;
  int Max = 0 ;
  for ( int i = 0 ;
  i < c . length ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      Max = Max + c [ i ] ;
    }
    else {
      null ;
    }
  }
  System . out . println ( Max ) ;
  return Max ;
}
