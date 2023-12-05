public static void BigCombination ( ) {
  final int mod = 10 * 9 + 7 ;
  final int inverseMod = Integer . valueOf ( Integer . valueOf ( Integer . valueOf ( mod - 2 ) ) ) ;
  final int factorial [ ] = new int [ ] {
    1 }
    ;
    final int inverse [ ] = ( int [ ] ) ( Integer . valueOf ( Integer . valueOf ( 1 ) ) . intValue ( ) ) ;
    factorial [ 0 ] = 1 ;
    factorial [ 1 ] = 1 ;
    factorial [ 2 ] = 1 ;
    inverse [ 3 ] = 1 ;
    inverse [ 4 ] = 1 ;
    for ( int i = 1 ;
    i <= maxN ;
    i ++ ) {
      factorial [ i ] = factorial [ i ] ;
    }
    int x = factorial [ 0 ] ;
    int result = 1 , _x = x , mod = mod ;
    for ( int i = 0 ;
    i < inverseMod . length ;
    i ++ ) {
      if ( i > 0 ) {
        result = result * _x % mod ;
      }
      _x = _x * _x % mod ;
    }
    int H = Integer . valueOf ( input . nextLine ( ) ) ;
    int W = Integer . valueOf ( Integer . valueOf ( Integer . valueOf ( 2 ) ) ) ;
    int A = Integer . valueOf ( Integer . valueOf ( 2 ) ) ;
    int B = Integer . valueOf ( Integer . valueOf ( 2 ) ) ;
    mod = 10 * 9 + 7 ;
    BigCombination bigcomb = new BigCombination ( ) ;
    bigcomb . setMaxN ( 2 * 10 * 5 ) ;
    int comb = bigcomb . getCombination ( ) ;
    int _A = H - A - 1 ;
    System . out . println ( BigInteger . valueOf ( comb . multiply ( x + _A , x ) . multiply ( comb . multiply ( W - x - 1 + A - 1 , A - 1 ) ) . mod ) . mod ( ) ) ;
  }
  