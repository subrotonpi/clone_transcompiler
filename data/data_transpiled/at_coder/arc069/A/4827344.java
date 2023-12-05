static final int [ ] getStrings ( ) {
  final int INF = 10 * 18 ;
  final int MOD = 10 * 9 + 7 ;
  {
    int x = INF ;
    int y = INF ;
    switch ( y ) {
      case 0 : return 1 ;
      case 1 : return x ;
      case 2 : return POW ( x , y / 2 ) * x % MOD ;
      default : return POW ( x , y / 2 ) * x % MOD ;
    }
  }
  {
    int x = INF ;
    int y = MOD ;
    return x * POW ( y , MOD - 2 ) % MOD ;
  }
  {
    int [ ] li = new int [ 3 ] ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      li [ i ] = Integer . parseInt ( i ) ;
    }
  }
  {
    int [ ] li = new int [ 3 ] ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      li [ i ] = Integer . parseInt ( i ) ;
    }
  }
}
