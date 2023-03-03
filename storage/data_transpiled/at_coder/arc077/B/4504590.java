static final String getCombinationString ( ) {
  Scanner input = new Scanner ( System . in ) ;
  System . setIn ( input ) ;
  @ SuppressWarnings ( "resource" ) final int mod = 10 * 9 + 7 ;
  final int n = input . nextInt ( ) ;
  final List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final int [ ] factorial = new int [ n + 2 ] ;
  factorial [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    factorial [ i ] = factorial [ i - 1 ] * i % mod ;
  }
  final int [ ] inverse = new int [ n + 2 ] ;
  inverse [ n + 1 ] = Math . pow ( factorial [ n + 1 ] , mod - 2 , mod ) ;
  for ( int i = n ;
  i >= 0 ;
  i -- ) {
    inverse [ i ] = inverse [ i + 1 ] * ( i + 1 ) % mod ;
  }
  /* comb n = n */
  if ( n < r ) {
    return 0 ;
  }
  /* factorial[n] * inverse[r] * inverse[n-r] % mod */
  final int [ ] C = A . stream ( ) . mapToInt ( i -> i ) . toArray ( ) ;
  final int [ ] idx = new int [ A . length ] ;
  for ( int k = 0 ;
  k < A . length ;
  k ++ ) {
    idx [ k ] = A [ k ] ;
  }
  for ( int k = 1 ;
  k <= n ;
  k ++ ) {
    System . out . println ( ( comb ( n + 1 , k ) - comb ( n + idx [ 0 ] - idx [ 1 ] , k - 1 ) ) % mod ) ;
  }
  return A . toString ( ) ;
}
