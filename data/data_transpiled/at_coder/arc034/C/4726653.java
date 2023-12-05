static final long serialVersionUID = 1L ;
{
  final int [ ] seedPrimes = {
    2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 47 , 53 , 59 , 61 , 67 , 71 , 73 , 79 , 83 , 89 , 97 }
    ;
    long a , b ;
    {
      long [ ] factors = new long [ 3 ] ;
      for ( int x = a ;
      x > 0 ;
      x -- ) {
        int [ ] f = Prime . findFactors ( x ) ;
        for ( int k = 0 ;
        k < f . length ;
        k ++ ) {
          factors [ k ] += f [ k ] ;
        }
      }
      {
        long ans = 1 ;
        for ( long v : factors [ n ] ) {
          ans *= v + 1 ;
        }
        return ans ;
      }
    }
    long a , b ;
    {
      long [ ] primes = new long [ 3 ] ;
      for ( int i = 0 ;
      i < primes . length ;
      i ++ ) {
        primes [ i ] = 1 ;
      }
      int n = primes [ n ] ;
      if ( n == 1 ) return false ;
      if ( Prime . seedPrimes . containsKey ( n ) ) return true ;
      if ( ArrayUtils . contains ( primes , n ) ) return false ;
    }
    {
      long n = primes [ n ] ;
      for ( int i = 0 ;
      i < primes . length ;
      i ++ ) {
        n = primes [ i ] ;
      }
      return n ;
    }
    long b ;
    long d ;
    {
      a = BigInteger . valueOf ( 1 ) . longValue ( ) ;
      b = BigInteger . valueOf ( 1 ) . longValue ( ) ;
      int count = 0 ;
      while ( d == 1 ) {
        count ++ ;
        x = primes [ n ] = 1 ;
        y = primes [ n ] = BigInteger . valueOf ( 1 ) . longValue ( ) ;
        System . out . println ( solve ( a , b ) ) ;
      }
      if ( n == 1 ) return false ;
    }
    {
      long n = primes [ n ] ;
      for ( int i = 2 ;
      i < ( int ) Math . sqrt ( n ) + 1 ;
      i ++ ) {
        if ( n % i == 0 ) return false ;
      }
      return true ;
    }
    {
      long n = primes [ n ] ;
      long t = n - 1 ;
      while ( n % 2 == 0 ) d /= 2 ;
      long [ ] witnesses = primes [ n ] ;
      for ( long w : witnesses ) {
        t = d ;
        y = pow ( w , t , n