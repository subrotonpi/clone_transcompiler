static final int solve ( ) {
  final int mod = 10 * 9 + 7 ;
  {
    int [ ] ret = new int [ a + 1 ] ;
    for ( int i = 2 ;
    i <= a ;
    i ++ ) {
      ret [ i ] = ( ret [ i - 1 ] * i ) % mod ;
    }
    return ret [ a ] ;
  }
  {
    int [ ] ret = new int [ a + 1 ] ;
    int [ ] fac = fact ( a ) ;
    ret [ a ] = power ( fac [ a ] , mod - 2 ) ;
    for ( int i = 2 ;
    i <= a ;
    i ++ ) {
      ret [ i ] = ( ret [ i + 1 ] * ( i + 1 ) ) % mod ;
    }
    return ret [ a ] ;
  }
  {
    int [ ] ret = new int [ a + 1 ] ;
    int [ ] fac = fact ( a ) ;
    ret [ a ] = power ( fac [ a ] , mod - 2 ) ;
    for ( int i = 2 ;
    i <= a ;
    i ++ ) {
      ret [ i ] = ( ret [ i + 1 ] * ( i + 1 ) ) % mod ;
    }
    return ret [ a ] ;
  }
  {
    int [ ] ret = new int [ a ] ;
    for ( int i = 0 ;
    i < a ;
    i ++ ) {
      ret [ i ] = ( ret [ i ] * ( i + 1 ) ) % mod ;
    }
    return ret [ a ] ;
  }
  {
    int [ ] ret = new int [ a ] ;
    for ( int i = 0 ;
    i < a ;
    i ++ ) {
      ret [ a ] = ( ret [ i ] * ( i + 1 ) ) % mod ;
    }
    return ret [ a ] ;
  }
}
