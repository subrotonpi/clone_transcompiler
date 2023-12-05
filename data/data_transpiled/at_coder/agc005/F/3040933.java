static int [ ] [ ] solve ( ) {
  final int MOD = 924844033 ;
  int [ ] [ ] wTable = new int [ size ] [ size ] ;
  for ( int i = 1 ;
  i < size ;
  i ++ ) {
    wTable [ i ] = wTable [ i - 1 ] * w % MOD ;
  }
  int [ ] [ ] answer = readData ( ) ;
  int [ ] [ ] fac = new int [ n ] [ ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    fac [ i ] = wTable [ i - 1 ] * w % MOD ;
  }
  int [ ] ifac = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int a = n * comb ( n , i ) ;
    int b = answer [ n - i ] * ifac [ i ] ;
    System . out . println ( ( a - b ) % MOD ) ;
  }
  solve ( ) ;
  int [ ] [ ] answer = new int [ n ] [ ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    answer [ i ] = answer [ i ] * ifac [ i ] ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int a = n * comb ( n , i ) ;
    int odd = i > 0 ? 1 : 0 ;
    int even = i < n ? 1 : 0 ;
    int w1 = wTable [ 0 ] [ size / 2 ] ;
    int w2 = wTable [ size / 2 ] [ size ] ;
    int sub1 = ( odd + even * w1 ) % MOD ;
    int sub2 = ( odd + even * w2 ) % MOD ;
    answer [ i ] = new int [ ] {
      sub1 , sub2 }
      ;
    }
    if ( scale != 0 ) {
      answer [ i ] = answer [ i ] * scale % MOD ;
    }
    return answer ;
  }
  