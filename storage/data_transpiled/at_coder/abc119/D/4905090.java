@ SafeVarargs public static String solve ( String string ) {
  int a = Integer . parseInt ( string ) ;
  int b = Integer . parseInt ( string ) ;
  int q = Integer . parseInt ( string ) ;
  int ... stx = Integer . parseInt ( string ) ;
  int [ ] s = new int [ stx . length ] ;
  int [ ] t = new int [ stx . length ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    s [ i ] = - 10 * 10 ;
  }
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    t [ i ] = - 10 * 10 ;
  }
  for ( int i = a ;
  i < b ;
  i ++ ) {
    s [ i ] = stx [ i ] ;
  }
  for ( int i = a ;
  i < b ;
  i ++ ) {
    t [ i ] = stx [ i ] ;
  }
  Map < Integer , String > x = new HashMap < > ( ) ;
  String [ ] ans = new String [ stx . length ] ;
  int iS = 0 ;
  int iT = 0 ;
  for ( int i = 0 ;
  i < stx . length - q ;
  i ++ ) {
    int _x = stx [ i ] ;
    while ( s [ iS ] < _x ) {
      iS ++ ;
    }
    while ( t [ iT ] < _x ) {
      iT ++ ;
    }
    int ls = _x - s [ iS - 1 ] ;
    int rs = s [ iS ] - _x ;
    int lt = _x - t [ iT - 1 ] ;
    int rMax = rs > rt ? rs : rt ;
    int lMax = ls > lt ? ls : lt ;
    x . put ( _x , String . valueOf ( Math . min ( rMax , lMax ) ) ) ;
    ans [ i ] = String . valueOf ( Math . min ( rMax , lMax ) ) ;
    ans [ i ] = String . valueOf ( rt + ls + ( rt < ls ? rt : ls ) ) ;
    ans [ i ] = String . valueOf ( rs + lt + ( rs < lt ? rs : lt ) ) ;
  }
  return "\n" + x . get ( ) ;
}
