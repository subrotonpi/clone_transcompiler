public static int [ ] [ ] getA ( ) {
  int [ ] [ ] A = new int [ 10 ] [ 10 ] ;
  int [ ] [ ] B = new int [ 10 ] [ 10 ] ;
  int count = 0 ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 10 ;
    j ++ ) {
      for ( int k = 0 ;
      k < 10 ;
      k ++ ) {
        int n = 10000 * i + 1000 * j + 100 * k + 10 * j + i ;
        if ( A [ n ] <= B [ n ] ) {
          count ++ ;
        }
      }
    }
  }
  return new int [ count ] ;
}
