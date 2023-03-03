public static int n ( int z , int w ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = z ;
  int res = Math . abs ( a [ n - 1 ] - w ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int cand = Math . abs ( a [ n - 1 ] - a [ i ] ) ;
    for ( int j = i + 1 ;
    j < n - 1 ;
    j ++ ) cand = Math . min ( a [ j ] - a [ j - 1 ] , cand ) ;
    res = Math . max ( res , cand ) ;
  }
  return res ;
}
