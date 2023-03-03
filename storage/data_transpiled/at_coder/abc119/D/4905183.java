@ VisibleForTesting static String solve ( String string ) {
  int a = Integer . parseInt ( string ) ;
  int b = Integer . parseInt ( string ) ;
  int q = Integer . parseInt ( string ) ;
  int ... stx = Integer . parseInt ( string ) ;
  int bignum = 3 * 10 * 10 ;
  int [ ] s = new int [ stx . length ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) s [ i ] = - bignum ;
  int [ ] t = new int [ stx . length ] ;
  for ( int i = a ;
  i < b ;
  i ++ ) t [ i ] = - bignum ;
  for ( int i = a ;
  i < b ;
  i ++ ) s [ i ] = stx [ i ] ;
  for ( int j = b ;
  j < b ;
  j ++ ) t [ j ] = stx [ j ] ;
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int i = b ;
  i < b ;
  i ++ ) {
    int _x = stx [ i - q ] ;
    int i = s [ i ] ;
    int j = t [ j ] ;
    int ls = _x - s [ i - 1 ] ;
    int rs = s [ i ] - _x ;
    int lt = _x - t [ j - 1 ] ;
    int rt = t [ j ] - _x ;
    ans . append ( Integer . toString ( Math . min ( Math . max ( rs , rt ) , Math . max ( ls , lt ) ) ) ) . append ( " " ) . append ( rt ) . append ( ls ) . append ( min ( rt , ls ) ) . append ( rs ) . append ( lt ) . append ( min ( rs , lt ) ) ;
  }
  return ans . toString ( ) ;
}
