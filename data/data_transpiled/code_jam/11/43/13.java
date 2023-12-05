public static List < Integer > primes ( int n ) {
  int [ ] pr = new int [ n ] ;
  for ( int i : xrange ( 2 , n ) ) {
    if ( ! pr [ i ] ) continue ;
    int ii = i * i ;
    if ( ii > n ) break ;
    Arrays . fill ( pr , ii , 0 , pr . length ) ;
  }
  return Stream . of ( pr ) . filter ( i -> i <= n ) . collect ( Collectors . toList ( ) ) . stream ( ) . flatMap ( i -> Stream . of ( i ) ) . filter ( i -> i >= n ) . collect ( Collectors . toList ( ) ) ;
}
