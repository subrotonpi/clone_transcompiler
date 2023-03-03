static final int solve ( ) {
  final List < Integer > primes = new ArrayList < Integer > ( 2 ) ;
  final int [ ] p = new int [ 3 ] ;
  primes . add ( 2 ) ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    final int m = ( int ) ( sqrt ( p [ i ] ) + .5 ) ;
    for ( int k : primes ) {
      if ( n % k == 0 ) {
        return false ;
      }
      if ( k > m ) {
        return true ;
      }
    }
  }
  for ( int i = 3 ;
  i < ( int ) 1e6 ;
  i += 2 ) {
    if ( isprime ( p [ i ] ) ) {
      primes . add ( i ) ;
    }
  }
  final int maxpow = ( int ) ( 1e6 * primes . size ( ) ) ;
  int ret = 0 ;
  while ( n >= p ) {
    n /= p ;
    ret ++ ;
  }
  return ret ;
  /* solve */
  final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  if ( N == 1 ) {
    return 0 ;
  }
  final int [ ] pp = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    pp [ i ] = maxpow ( N , p ) ;
  }
  final int high = Arrays . stream ( pp ) . reduce ( 0 , ( x , y ) -> x + y ) + 1 ;
  final int low = Arrays . stream ( pp ) . reduce ( 0 , ( x , y ) -> x + y ) ;
  return high - low ;
}
