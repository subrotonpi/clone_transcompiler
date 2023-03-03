public static int n ( int x ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] DP = a . clone ( ) ;
  int ans = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int [ ] newArray = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      newArray [ j ] = Math . min ( DP [ j ] , DP [ j - 1 ] ) ;
    }
    DP = newArray ;
    ans = Math . min ( ans , Math . min ( DP , ans + ( i + 1 ) * x ) ) ;
  }
  return ans ;
}
