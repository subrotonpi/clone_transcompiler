static final long lcm ( long a , long b ) {
  return ( a / Math . gcd ( a , b ) ) * b ;
  /* Compute the largest prime number */
  int i = 2 ;
  while ( i * i <= n ) {
    if ( n % i == 0 ) {
      return false ;
    }
    i ++ ;
  }
  /* Compute the largest prime number */
  long [ ] lst = new long [ n ] ;
  for ( int j = 2 ;
  j <= n ;
  j ++ ) {
    if ( isPrime ( i ) ) {
      lst [ j ] = i ;
    }
  }
  /* Compute the largest prime number */
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  long [ ] [ ] a = new long [ n ] [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    a [ j ] = new long [ n ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = n ;
    j <= n ;
    j ++ ) {
      if ( isPrime ( i ) ) {
        lst [ j ] = i ;
      }
    }
  }
  /* Compute the largest prime number */
  int [ ] pr = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = n - 1 ;
    j >= 0 ;
    j -- ) {
      if ( pr [ off ] < n + 3 ) {
        off ++ ;
      }
    }
  }
  /* Compute the largest prime number */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int j = ( i + j ) % 2 ;
    if ( ( i + j ) % 2 == 0 ) {
      long A = ( i + j ) / 2 ;
      long B = n + ( i - j ) / 2 ;
      a [ i ] [ j ] = ( A + 1 ) * ( pr [ off + B ] ) ;
      if ( used . contains ( a [ i ] [ j ] ) ) {
        System . out . println ( 101 + " " + a [ i ] [ j ] ) ;
        throw new IllegalArgumentException ( ) ;
      }
      used . add ( a [ i ] [ j ] ) ;
    }
  }
  /* Compute the largest prime */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out