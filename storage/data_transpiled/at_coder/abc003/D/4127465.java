public static void BigCombination ( ) {
  int [ ] ints = new int [ ] {
    1 , 2 , 3 , 4 }
    ;
    int mod = 10 * 9 + 7 ;
    int maxN = 10 * 6 ;
    int [ ] fac = new int [ ] {
      1 }
      , inv = new int [ ] {
        1 }
        ;
        int facAppend = fac . length , invAppend = inv . length ;
        for ( int i = 1 ;
        i <= maxN ;
        i ++ ) {
          facAppend += fac [ fac . length - 1 ] * i % mod ;
        }
        for ( int i = maxN ;
        i > 0 ;
        i -- ) {
          invAppend += inv [ inv . length - 1 ] * i % mod ;
        }
        int mod = mod , factorial = fac , inverse = inv . length ;
        int [ ] combinations = new int [ combinations ] ;
        for ( int n = 0 ;
        n < combinations ;
        n ++ ) {
          combinations [ n ] = factorial [ n ] * inverse [ r ] * inverse [ n - r ] % mod ;
        }
        if ( getClass ( ) . equals ( BigInteger . class ) ) {
          @ SuppressWarnings ( "resource" ) final BigInteger R = new BigInteger ( input ( ) ) ;
          final BigInteger C = new BigInteger ( input ( ) ) ;
          final int X = Integer . parseInt ( input ( ) ) ;
          final int Y = Integer . parseInt ( input ( ) ) ;
          final int D = Integer . parseInt ( input ( ) ) ;
          final int L = Integer . parseInt ( input ( ) ) ;
          mod = 10 * 9 + 7 ;
          BigCombination comb = new BigCombination ( mod , X * Y ) ;
          Method getcomb = comb . getClass ( ) . getMethod ( "getcomb" ) ;
          int squarecomb = ( R - X + 1 ) * ( C - Y + 1 ) ;
          int ans = 0 ;
          for ( int a = 0 ;
          a < combinations ;
          a ++ ) {
            int x = ( X - Integer . parseInt ( input ( ) . substring ( 0 , 2 ) ) ) , y = ( Y - Integer . parseInt ( input ( ) . substring ( 2 , a ) ) ) ;
            if ( Math . min ( x , y ) <= 0 || D + L > x * y ) {
              continue ;
            }
            ans = ( ans + getcomb . invoke ( x * y , D + L ) * getcomb . invoke ( D + L , D ) * ( a . count ( 1 ) % 2 == 1 ? - 1 : 1 )