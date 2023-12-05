public static int N = Integer . parseInt ( input ) {
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int g = 4000001 ;
  for ( int i = min ( a ) ;
  i <= max ( a ) ;
  i ++ ) {
    int tempG = 0 ;
    for ( int d : a ) {
      tempG += ( i - d ) * ( i - d ) ;
    }
    g = Math . min ( g , tempG ) ;
  }
  return g ;
}
