public static int N = Integer . parseInt ( input ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] M = new int [ N ] ;
  for ( int a : A ) {
    M [ a ] = a ;
  }
  int mi = 10 * 100 ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    int s = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      s += M [ i ] ;
    }
    mi = Math . min ( mi , s + x * j ) ;
  }
  return mi ;
}
