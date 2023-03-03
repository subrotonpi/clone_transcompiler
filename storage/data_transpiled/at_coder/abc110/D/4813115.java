public static Pair < Integer , Integer > factorization ( int N , int M ) {
  int [ ] prime = primelist ( ( int ) ( N * ( 1 / 2 ) ) + 2 ) ;
  int [ ] factor = new int [ ( int ) ( N * ( 1 / 2 ) + 2 ) ] ;
  boolean isprime = false ;
  for ( int i : prime ) {
    while ( N % i == 0 ) {
      N = N / i ;
      factor [ i ] ++ ;
    }
  }
  if ( Arrays . binarySearch ( factor , 0 ) == 0 ) isprime = true ;
  if ( N != 1 ) factor [ N ] = 1 ;
  return new Pair < Integer , Integer > ( factor , isprime ) ;
}
