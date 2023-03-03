public static double getDistance ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int [ ] west = new int [ n + 1 ] ;
  int [ ] east = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    west [ i ] = 0 ;
    east [ i ] = 0 ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    west [ i ] = west [ i - 1 ] ;
    east [ i ] = east [ i - 1 ] ;
    if ( s . charAt ( i - 1 ) == 'W' ) {
      west [ i ] ++ ;
    }
    if ( s . charAt ( i - 1 ) == 'E' ) {
      east [ i ] ++ ;
    }
  }
  double ans = 1e9 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int reqdEastCnt = i - 1 ;
    int gotEastCnt = east [ i - 1 ] ;
    int reqdWestCnt = n - i ;
    int gotWestCnt = west [ n ] - west [ i ] ;
    ans = Math . min ( ans , reqdEastCnt - gotEastCnt + reqdWestCnt - gotWestCnt ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
