public static int [ ] s ( ) {
  s = new Scanner ( System . in ) . nextInt ( ) ;
  n = Integer . parseInt ( System . in ) ;
  int [ ] p = new int [ 5 ] ;
  for ( int i = 0 ;
  i < 5 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 5 ;
    j ++ ) {
      p [ i ] = s [ i ] + s [ j ] ;
    }
  }
  Arrays . sort ( p ) ;
  return p ;
}
