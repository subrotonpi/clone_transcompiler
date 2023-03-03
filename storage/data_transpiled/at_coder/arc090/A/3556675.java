public static int N = Integer . parseInt ( input ) {
  int [ ] A1 = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] A2 = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int maxi = 0 ;
  int prev = A1 [ 0 ] + Arrays . stream ( A2 ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int cur = prev + A1 [ i ] - A2 [ i - 1 ] ;
    maxi = Math . max ( maxi , cur ) ;
    prev = cur ;
  }
  System . out . println ( maxi ) ;
  return N ;
}
