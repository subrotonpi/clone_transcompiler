public static int [ ] getDigits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int K = Arrays . stream ( A ) . mapToInt ( i -> i + 1 ) . sum ( ) / Arrays . stream ( A ) . mapToInt ( i -> i + 1 ) . sum ( ) ;
  int [ ] D = new int [ N ] ;
  for ( int i = - 1 ;
  i <= N - 1 ;
  i ++ ) {
    D [ i ] = A [ i + 1 ] - A [ i ] - K ;
  }
  for ( int d : D ) {
    if ( ! ( d <= 0 && d % N == 0 ) ) {
      System . out . println ( "NO" ) ;
      break ;
    }
  }
  return D ;
}
