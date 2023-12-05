static int [ ] makeNum ( int [ ] digits , boolean repeatLastDigit ) {
  int [ ] result = new int [ digits . length ] ;
  int start = 0 ;
  for ( int d : digits ) {
    num *= 10 ;
    num += d ;
  }
  int [ ] result ;
  if ( repeatLastDigit ) {
    int [ ] r = new int [ digits . length ] ;
    for ( int i = 0 ;
    i < r . length ;
    i ++ ) {
      int d = digits [ i ] ;
      num *= 10 ;
      num += d ;
    }
    result [ start ] = 1 ;
  }
  else {
    int [ ] r = new int [ digits . length ] ;
    for ( int i = 0 ;
    i < r . length ;
    i ++ ) {
      int d = digits [ i ] ;
      num *= 10 ;
      num += d ;
    }
  }
  return result ;
}
