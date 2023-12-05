@ GwtIncompatible ( "Euclidean" ) private static Iterable < Integer > solve ( ) {
  return new Iterable < Integer > ( ) {
    @ Override public Iterator < Integer > iterator ( ) {
      return new Iterator < Integer > ( ) {
        private int n = 3 ;
        private final HashMap < Integer , Integer > h = new HashMap < > ( ) ;
        private int m ;
        private int m ;
        private int j ;
        private int min ( int x , int n ) {
          if ( n > 0 ) {
            int b = h . get ( n ) ;
            m += 2 * b ;
            while ( m > 0 ) {
              m += 2 * b ;
            }
            h . put ( m , b ) ;
            -- n ;
          }
          else {
            m += 2 * n ;
            while ( m > 0 ) {
              m += 2 * n ;
            }
            h . put ( m , n ) ;
            -- n ;
          }
        }
        private int [ ] [ ] next ( ) {
          if ( n == 2 ) {
            return new int [ ] [ ] {
              2 , 3 }
              ;
            }
            return new int [ ] [ ] {
              5 , 4 }
              ;
            }
            private int [ ] [ ] ans = new int [ n ] [ ] ;
            private final Enumeration < Integer > eg = eratostheneMap ( ) ;
            private final List < Integer > primes = new ArrayList < > ( 2 * n ) ;
            for ( int i = 0 ;
            i < n ;
            ++ i ) {
              primes . add ( next ( ) ) ;
            }
            Collections . sort ( primes ) ;
            final int [ ] ps = primes . toArray ( new int [ n ] ) ;
            final int [ ] qs = primes . subList ( n , 2 * n ) ;
            final int m = ( n - 1 ) / 2 ;
            for ( int i = 0 ;
            i < n ;
            ++ i ) {
              for ( int j = i % 2 ;
              j < n ;
              ++ j ) {
                final int l1 = ps [ ( i + j ) / 2 - m ] ;
                final int l2 = qs [ ( i - j ) / 2 ] ;
                ans [ i ] [ j ] = l1 * l2 ;
              }
            }
            for ( int i = 0 ;
            i < n ;
            ++ i ) {
              for ( int j = ( i % 2 ) ^ 1 ;
              j < n ;
              ++ j ) {
                final int [ ] surroundings = new int [ n ] ;
                if ( i > 0 ) {
                  surroundings [ i - 1 ] = ans [ i - 1 ] [ j ] ;
                }
                if ( i