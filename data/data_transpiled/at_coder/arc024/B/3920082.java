public static int [ ] [ ] color ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] color = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    color [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int s = Arrays . stream ( color ) . mapToInt ( i -> i ) . sum ( ) ;
  return li ;
}
