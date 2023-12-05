public static int d_winter ( int R , int C , int X , int Y , int D , int L ) {
  PermutationCombination c ;
  int [ ] factors = new int [ ] {
    Integer . MIN_VALUE , Integer . MAX_VALUE }
    ;
    int maxN = 10 * 6 , mod = 10 * 9 + 7 ;
    int [ ] fac = new int [ maxN ] , inv = new int [ maxN ] ;
    int fac_append , inv_append ;
    for ( int i = 1 ;
    i <= maxN ;
    i ++ ) fac_append ( fac [ fac . length - 1 ] * i % mod ) ;
    inv_append ( Math . pow ( fac [ fac . length - 1 ] , mod - 2 , mod ) ) ;
    for ( int i = maxN ;
    i > 0 ;
    i -- ) inv_append ( inv [ inv . length - 1 ] * i % mod ) ;
    mod = mod ;
    factorial = fac ;
    inv = inv . clone ( ) ;
    for ( int i = 0 ;
    i < factor_append ;
    i ++ ) fac [ i ] = factor_append ( fac [ i ] ) ;
    inv = inv . clone ( ) ;
    int i = factor_append ( i ) ;
    int n = factor_append ( i ) ;
    int r = factor_append ( i ) ;
    if ( r == n || r == 0 ) return 1 ;
    if ( r > n ) return 0 ;
    return factorial [ n ] * factorial [ r ] * inverse [ r ] * inverse [ n - r ] % mod ;
  }
  