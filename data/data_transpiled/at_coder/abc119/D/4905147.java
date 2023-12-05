@ VisibleForTesting static String solve ( String string ) {
  int a = Integer . parseInt ( string ) ;
  int b = Integer . parseInt ( string ) ;
  int q = Integer . parseInt ( string ) ;
  int ... stx = Integer . parseInt ( string ) ;
  int bignum = 3 * 10 * 10 ;
  int [ ] s = new int [ stx . length ] ;
  for ( int i = 0 ;
  i < stx . length ;
  i ++ ) {
    s [ i ] = - bignum ;
  }
  int [ ] t = new int [ stx . length ] ;
  for ( int i = a ;
  i < stx . length ;
  i ++ ) {
    t [ i ] = - bignum ;
  }
  for ( int i = a ;
  i < stx . length ;
  i ++ ) {
    int _x = stx [ i - q ] ;
    int iS = Integer . parseInt ( s [ i ] ) ;
    int iT = Integer . parseInt ( t [ i ] ) ;
    int ls = _x - s [ iS - 1 ] ;
    int rs = s [ iS ] - _x ;
    int lt = _x - t [ iT - 1 ] ;
    int rt = t [ iT ] - _x ;
    ans [ i ] = Integer . toString ( Math . min ( Math . max ( rs , rt ) , Math . max ( ls , lt ) ) + rt + ls + Math . min ( rt , ls ) + rs + lt + Math . min ( rs , lt ) ) ;
  }
  return String . join ( "\n" , ans ) ;
}
