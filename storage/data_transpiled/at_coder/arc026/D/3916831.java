static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> E = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    E . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  return E . size ( ) ;
  /* solve the k */
  int [ ] * p = new int [ N ] ;
  int px , py ;
  /* root of the x */
  if ( px == p [ x ] ) {
    return x ;
  }
  p [ x ] = y = root ( p [ x ] ) ;
  /* unite the x */
  int res = 0 ;
  for ( List < Integer > a : E ) {
    int a = a . get ( 2 ) - a . get ( 3 ) * k ;
    int b = a . get ( 3 ) ;
    int c = b . get ( 4 ) ;
    int t = a . get ( 5 ) ;
    int v = c - t * k ;
    if ( v <= 0 ) {
      /* unite the x */
      res += v ;
    }
    else {
      if ( unite ( a , b ) ) {
        res += v ;
      }
    }
  }
}
