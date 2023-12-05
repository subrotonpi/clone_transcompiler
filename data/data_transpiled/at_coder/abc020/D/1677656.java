public static long [ ] [ ] getSums ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  long [ ] [ ] sums = new long [ 32000 ] [ ] ;
  for ( int d = 1 ;
  d < 32000 ;
  d ++ ) {
    if ( d * d > k ) break ;
    if ( k % d == 0 ) {
      sums [ d ] [ 0 ] = new long [ ] {
        d , ( n / d ) * ( n / d + 1 ) / 2 * d }
        ;
        if ( d * d != k ) {
          int e = k / d ;
          sums [ e ] [ 0 ] = new long [ ] {
            e , ( n / e ) * ( n / e + 1 ) / 2 * e }
            ;
          }
        }
      }
      Arrays . sort ( sums ) ;
      for ( int i = sums . length - 1 ;
      i >= 0 ;
      i -- ) {
        for ( int j = 0 ;
        j < i ;
        j ++ ) {
          if ( sums [ i ] [ 0 ] % sums [ j ] [ 0 ] == 0 ) sums [ j ] [ 1 ] -= sums [ i ] [ 1 ] ;
        }
      }
      long ret = 0 ;
      for ( long [ ] v : sums ) ret += v [ 1 ] * ( k / v [ 0 ] ) ;
      System . out . println ( ret % 1000000007 ) ;
      return sums ;
    }
    