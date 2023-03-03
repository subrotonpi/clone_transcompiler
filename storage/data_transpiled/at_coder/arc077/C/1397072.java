public static int [ ] readIntArrayFromFile ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] aArray = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) aArray [ i ] = Integer . parseInt ( input ) ;
  int [ ] bonusStrCnt = new int [ m + 1 ] ;
  int [ ] bonusEndVol = new int [ m + 1 ] ;
  int [ ] bonusEndCnt = new int [ m + 1 ] ;
  int oneRes = 0 ;
  int bonusCnt = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int difm = ( aArray [ i + 1 ] - aArray [ i ] ) % m ;
    if ( difm > 1 ) {
      if ( aArray [ i ] + 2 > m ) bonusStrCnt [ ( aArray [ i ] + 2 ) - m ] ++ ;
      else bonusStrCnt [ aArray [ i ] + 2 ] ++ ;
      bonusEndCnt [ aArray [ i + 1 ] ] ++ ;
      bonusEndVol [ aArray [ i + 1 ] ] += difm - 1 ;
    }
    if ( difm <= aArray [ i + 1 ] ) oneRes += difm ;
    else {
      oneRes += aArray [ i + 1 ] ;
      bonusCnt ++ ;
    }
  }
  int [ ] resArray = new int [ m + 1 ] ;
  resArray [ 0 ] = oneRes ;
  int res = oneRes ;
  for ( int i = 2 ;
  i <= m ;
  i ++ ) {
    res += bonusEndVol [ i - 1 ] ;
    bonusCnt += bonusStrCnt [ i ] - bonusEndCnt [ i - 1 ] ;
    res -= bonusCnt ;
    resArray [ i ] = res ;
  }
  System . out . println ( min ( resArray ) ) ;
  return resArray ;
}
