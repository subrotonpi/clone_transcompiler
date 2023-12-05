@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static < T > Callable < T > cached ( final Callable < T > f ) {
  return new Callable < T > ( ) {
    private final Object notCached = new Object ( ) ;
    private final AtomicReference < Object > cache = new AtomicReference < Object > ( ) ;
    @ Override public T call ( ) throws Exception {
      Object result = cache . get ( ) ;
      if ( result != notCached ) {
        return result ;
      }
      cache . set ( result = f . call ( ) ) ;
      return result ;
    }
    @ Override public synchronized T call ( ) throws Exception {
      return f . call ( ) ;
    }
    @ Override public synchronized T call ( ) throws Exception {
      return f . call ( ) ;
    }
    @ Override public synchronized T call ( ) throws Exception {
      return f . call ( ) ;
    }
    @ Override public synchronized T gcEinner ( int a , int b ) throws Exception {
      assert a >= 0 ;
      assert b >= 0 ;
      if ( a == 0 ) {
        return f . call ( ) ;
      }
      int k = 0 ;
      while ( a & 1 == 0 && b & 1 == 0 ) {
        k ++ ;
        a >>= 1 ;
        b >>= 1 ;
      }
      int t ;
      if ( a & 1 == 0 ) {
        t = - b ;
      }
      else {
        t = a ;
      }
      while ( t > 0 ) {
        while ( Math . abs ( t ) & 1 == 0 ) {
          t >>= 1 ;
        }
        if ( t > 0 ) {
          a = t ;
        }
        else {
          b = - t ;
        }
        t = a - b ;
      }
      return f . call ( ) * ( 1 << k ) ;
    }
    private int generateSievePrimes2 ( int limit ) {
      int limit1 = ( ( int ) Math . sqrt ( limit ) + 1 ) / 2 ;
      int limit2 = ( limit + 1 ) / 2 ;
      boolean [ ] sieve = new boolean [ limit2 ] ;
      if ( 2 <= limit ) {
        return 2 ;
      }
      for ( int i : xrange ( 1 , limit1 ) ) {
        if ( sieve [ i ] ) {
          int candidate = i * 2 + 1 ;
          System . out . println ( candidate ) ;
          int start = 2 * ( i * i + i ) ;
          assert start < limit2 ;
          for ( int nonPrime : xrange ( start , limit2 , candidate ) ) {
            sieve [ nonPrime ] = false ;
          }
        }
      }
      return f . call ( ) ;
    }
  }
  ;
  