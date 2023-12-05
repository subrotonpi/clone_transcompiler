public static void BigCombination ( ) {
  int [ ] ints = new int [ ] {
    1 , 2 , 3 , 4 }
    ;
    int [ ] fac = new int [ ] {
      1 }
      , inv = new int [ ] {
        1 }
        ;
        int facAppend = fac . length , invAppend = inv . length ;
        for ( int i = 1 ;
        i <= maxN ;
        i ++ ) facAppend += fac [ fac . length - 1 ] * i % mod ;
        invAppend += Math . pow ( fac [ fac . length - 1 ] , mod - 2 , mod ) ;
        for ( int i = maxN ;
        i > 0 ;
        i -- ) invAppend += inv [ inv . length - 1 ] * i % mod ;
        int mod = mod , factorial = fac , inverse = inv . length ;
        for ( int i = 0 ;
        i < fac . length ;
        i ++ ) {
          factorial [ i ] = factorial [ i ] * inv [ i ] * inv [ i ] % mod ;
        }
        int [ ] permutation = new int [ factorial . length ] ;
        for ( int i = 0 ;
        i < inverse . length ;
        i ++ ) permutation [ i ] = factorial [ i ] * inverse [ i ] % mod ;
        final BigCombination Big = new BigCombination ( ) ;
        int mod = 10 * 9 + 7 ;
        int h = Integer . parseInt ( input ( ) ) ;
        int w = Integer . parseInt ( input ( ) ) ;
        int a = Integer . parseInt ( input ( ) ) ;
        int b = Integer . parseInt ( input ( ) ) ;
        int ans = 0 ;
        for ( int i = b ;
        i < w ;
        i ++ ) {
          ans = ( ans + Big . getCombination ( h - a - 1 + i , i ) * Big . getCombination ( a - 1 + w - i - 1 , w - i - 1 ) ) % mod ;
        }
        System . out . println ( ans ) ;
      }
      